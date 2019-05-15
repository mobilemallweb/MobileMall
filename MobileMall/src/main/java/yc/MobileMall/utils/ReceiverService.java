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
	 * @throws BizException 
	 */
	public void addNewCartPay(HttpServletRequest req) throws BizException {
		Transaction re=new Transaction();
		re.setUserId(Integer.parseInt(req.getParameter("userId")));
		re.setTransdate(new Date(System.currentTimeMillis()));
		re.setTotalprice(Integer.parseInt(req.getParameter("pricetotal")));
	//查询收货人id
		
	//	re.setEstimatedtime(estimatedtime); 送达时间
		
		String listGoods=req.getParameter("Goodss");
		String[] id=listGoods.split("goodsid=");
		String goodids="";
		for(int i=0;i<id.length;i++){
			System.out.println("id " +i);
			if(i>0){
				goodids=goodids+id[i].substring(0, 1)+",";
			}
		}
		re.setGoodsId(goodids);
		System.out.println("goodids: "+goodids);
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
