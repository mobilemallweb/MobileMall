package yc.MobileMall.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yc.MobileMall.bean.Receiver;
import yc.MobileMall.bean.User;
import yc.MobileMall.mybean.ShoppedCart;
import yc.MobileMall.utils.BizException;
import yc.MobileMall.utils.GoodsService;
import yc.MobileMall.utils.ReceiverService;
import yc.MobileMall.utils.UserService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ReceiverService RecService;
	/**
	 * 通过用户，查询其对应的购物车
	 * @param userId  用户的id
	 * @param session
	 * @return
	 * 可优化
	 */
	@RequestMapping("CartPage")
	public String getShopCart(Integer id,HttpSession session){
		if(id!=null){
			List<ShoppedCart> listGoods=goodsService.getShopCatGoods(id);
			int pricetotal=0;
			for(int i=0;i<listGoods.size();i++){
				pricetotal+=listGoods.get(i).getTotalprice();
			}
			session.setAttribute("pricetotal", pricetotal);
			session.setAttribute("Goodslist", listGoods);
			return "redirect:/cart.html";
		}else{
			return "cart";
		}
	}
	
	@PostMapping("updateShopCart")
	@ResponseBody
	public void updateShopCart(Integer cartId,Integer quantity){
		goodsService.updateCart(cartId,quantity);
	}
	
	@PostMapping("checkoutlist")
	@ResponseBody
	public User checkoutlist(Integer userId){
		User thisUser=userService.getThisUser(userId);
		return thisUser;
	}
	
	@PostMapping("confirm")
	@ResponseBody
	public String confirmRec(Receiver rec){
		try {
			RecService.saveReceiver(rec);
		} catch (BizException e) {
			e.printStackTrace();
		}
		return "收货信息已保存";
	}
	
	@PostMapping("cartPay")
	@ResponseBody
	public String cartPay(HttpServletRequest req){
		System.out.println(req.getParameter("payment"));
		return "支付成功！";
	}
	
	
	
	
}
