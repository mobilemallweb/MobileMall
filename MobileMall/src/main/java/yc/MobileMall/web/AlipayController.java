package yc.MobileMall.web;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.request.AlipayTradePagePayRequest;

import yc.MobileMall.config.AlipayConfig;
import yc.MobileMall.mybean.PayOrder;
import yc.MobileMall.mybean.ShoppedCart;
import yc.MobileMall.utils.ReceiverService;
@Controller
public class AlipayController {
	@Autowired
	private ReceiverService RecService;
	
	@RequestMapping("pay")
	@ResponseBody
	public String pay(HttpServletRequest request) throws UnsupportedEncodingException, AlipayApiException{
		//获得初始化的AlipayClient
		AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);
		
		//设置请求参数
		AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
		alipayRequest.setReturnUrl(AlipayConfig.return_url);
		alipayRequest.setNotifyUrl(AlipayConfig.notify_url);
		
		//商户订单号，商户网站订单系统中唯一订单号，必填
		String out_trade_no = new String(request.getParameter("WIDout_trade_no").getBytes("ISO-8859-1"),"UTF-8");
		//付款金额，必填
		String total_amount = new String(request.getParameter("WIDtotal_amount").getBytes("ISO-8859-1"),"UTF-8");
		//订单名称，必填
		String subject = new String(request.getParameter("WIDsubject").getBytes("ISO-8859-1"),"UTF-8");
		//商品描述，可空
		String body = new String(request.getParameter("WIDbody").getBytes("ISO-8859-1"),"UTF-8");
		
		alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
				+ "\"total_amount\":\""+ total_amount +"\"," 
				+ "\"subject\":\""+ subject +"\"," 
				+ "\"body\":\""+ body +"\"," 
				+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		
		//若想给BizContent增加其他可选请求参数，以增加自定义超时时间参数timeout_express来举例说明
		//alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\"," 
		//		+ "\"total_amount\":\""+ total_amount +"\"," 
		//		+ "\"subject\":\""+ subject +"\"," 
		//		+ "\"body\":\""+ body +"\"," 
		//		+ "\"timeout_express\":\"10m\"," 
		//		+ "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");
		//请求参数可查阅【电脑网站支付的API文档-alipay.trade.page.pay-请求参数】章节
		
		//请求
		String result = alipayClient.pageExecute(alipayRequest).getBody();
		
		//输出
		return result;
	}
	
	@RequestMapping("return_url")
	public String getpay(HttpServletRequest request,HashMap<String, Object> map) throws UnsupportedEncodingException, AlipayApiException{
		//获取支付宝GET过来反馈信息
		Map<String,String> params = new HashMap<String,String>();
		Map<String,String[]> requestParams = request.getParameterMap();
		for (Iterator<String> iter = requestParams.keySet().iterator(); iter.hasNext();) {
			String name = (String) iter.next();
			String[] values = (String[]) requestParams.get(name);
			String valueStr = "";
			for (int i = 0; i < values.length; i++) {
				valueStr = (i == values.length - 1) ? valueStr + values[i]
						: valueStr + values[i] + ",";
			}
			//乱码解决，这段代码在出现乱码时使用
			valueStr = new String(valueStr.getBytes("ISO-8859-1"), "utf-8");
			params.put(name, valueStr);
		}
		
		boolean signVerified = AlipaySignature.rsaCheckV1(params, AlipayConfig.alipay_public_key, AlipayConfig.charset, AlipayConfig.sign_type); //调用SDK验证签名

		//商户订单号
		String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"),"UTF-8");
	
		//支付宝交易号
		String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"),"UTF-8");
	
		//付款金额
		String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"),"UTF-8");
		
		double db=Double.parseDouble(total_amount);
		int total_amount2=(int) db;
		int out_trade_no2=Integer.parseInt(out_trade_no);
		
		if(out_trade_no2==po.getOut_trade_no() && total_amount2==po.getTotal_amount()){
			map.put("paymsg", "支付成功");
		}else{
			map.put("paymsg", "支付失败！！");
		}
		
		return "checkout.html";
	}
	
	private PayOrder po=new PayOrder();
	
	/**
	 * 在线支付  my
	 * @param session
	 * @return
	 */
	@PostMapping("PayOnline")
	@ResponseBody
	public PayOrder PayOnline(HttpSession session,HttpServletRequest req){
		List<ShoppedCart> listGoods=(List<ShoppedCart>) session.getAttribute("Goodslist");
		
		Integer pricetotal=0;
		String bodys="";
		for(int i=0;i<listGoods.size();i++){
			pricetotal+=listGoods.get(i).getTotalprice();
			bodys+=listGoods.get(i).getName()+"、";
		}
		po.setTotal_amount(pricetotal);
		po.setSubject(bodys);
		po.setBody("这将是您愉快的一次购物");
		
		//生成随机订单号
		int no=1000;
		Random r = new Random();
		for(int i=0 ; i<3 ;  i++){
			no += r.nextInt(1000000);
		}
		po.setOut_trade_no(no);
		
		return po;
	}
	
	
}
