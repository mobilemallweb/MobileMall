package yc.MobileMall.utils;

import java.sql.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.Receiver;
import yc.MobileMall.bean.ReceiverExample;
import yc.MobileMall.bean.ReceiverExample.Criteria;
import yc.MobileMall.bean.Transaction;
import yc.MobileMall.dao.ReceiverMapper;
import yc.MobileMall.dao.TransactionMapper;
import yc.MobileMall.mybean.ShoppedCart;

@Service
public class ReceiverService {
	@Autowired
	private ReceiverMapper receiverMapper;
	
	@Autowired
	private TransactionMapper transactionMapper;
	
	/**
	 * 保存Receiver对象到数据库
	 * @param rec 
	 * @throws BizException 
	 */
	public void saveReceiver(Receiver rec) throws BizException {
		//先查询是否已经存在
		ReceiverExample example=new ReceiverExample();
		Criteria cri=example.createCriteria();
		cri.andFirstNameEqualTo(rec.getFirstName()).andLastNameEqualTo(rec.getLastName()).andCountryEqualTo(rec.getCountry());
		cri.andProvinceEqualTo(rec.getProvince()).andCityEqualTo(rec.getCity()).andAddressEqualTo(rec.getAddress());
		cri.andEmailEqualTo(rec.getEmail()).andTelephoneEqualTo(rec.getTelephone()).andUserIdEqualTo(rec.getUserId());
		List<Receiver> ulist=receiverMapper.selectByExample(example);
		
		if(ulist.size()>0){                        //收件信息已存在则不插入数据库
			
		}else{
			int i=0;
			i=receiverMapper.insertSelective(rec);  //主键是自动添加的，默认插入为空
			if(i<1){
				throw new BizException("保存失败");
			}
		}
	}
	
	
	/**
	 * 保存新的订单
	 * @param req
	 * @param listGoods2 
	 * @throws BizException 
	 */
	public void addNewCartPay(HttpServletRequest req, List<ShoppedCart> listGoods2) throws BizException {
		Transaction re=new Transaction();
		re.setUserId(Integer.parseInt(req.getParameter("userId")));
		re.setTransdate(new Date(System.currentTimeMillis()));					//创建时间
		re.setTotalprice(Integer.parseInt(req.getParameter("pricetotal")));   //总价
		re.setIsreceipt(0);  												//设置收货信息，未收货为0
		
	//查询收货人id
		ReceiverExample example=new ReceiverExample();
		yc.MobileMall.bean.ReceiverExample.Criteria cri=example.createCriteria();
		cri.andLastNameEqualTo(req.getParameter("lastName"));
		cri.andAddressEqualTo(req.getParameter("address"));
		cri.andTelephoneEqualTo(req.getParameter("telephone"));
		cri.andEmailEqualTo(req.getParameter("email"));
		List<Receiver> listRec=receiverMapper.selectByExample(example);
		if(listRec.size()>0){	
			re.setReceiverId(listRec.get(0).getId());						//收货人id
		}else{
			throw new BizException("请先保存收货人信息!!");						//*** 保存到数据库，获取收货人id
		}
		
	//	re.setEstimatedtime(estimatedtime); 送达时间
		
		String goodids = "";
		for(int i=0;i<listGoods2.size();i++){
			int j=listGoods2.get(i).getGoodsnum();
			while(j>0){
				goodids=goodids+","+listGoods2.get(i).getGoodsid();
				j--;
			}
		}
		re.setGoodsId(goodids);											//商品id 个数表示数量
		
		try {
			transactionMapper.insertSelective(re);
		} catch (Exception e) {
			throw new BizException("订单创建失败"+e.getMessage());
		}
	}
	
	/**
	 * 保存新的订单
	 * @param req
	 * @throws BizException 
	 */
	public void addNewCartPay(String gid) throws BizException {
		System.err.println(gid);
		Transaction re=new Transaction();
		re.setUserId(1);
		re.setTransdate(new Date(System.currentTimeMillis()));
		re.setTotalprice(250);
		re.setId(null);
	//查询收货人id
	//	re.setEstimatedtime(estimatedtime); 送达时间
		re.setGoodsId(gid);
		try {
			transactionMapper.insertSelective(re);
		} catch (Exception e) {
			throw new BizException("订单创建失败"+e.getMessage());
		}
	}
	
}
