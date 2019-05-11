package yc.MobileMall.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.Goods;
import yc.MobileMall.bean.Shopcart;
import yc.MobileMall.bean.ShopcartExample;
import yc.MobileMall.bean.ShopcartExample.Criteria;
import yc.MobileMall.bean.User;
import yc.MobileMall.dao.GoodsMapper;
import yc.MobileMall.dao.ShopcartMapper;
import yc.MobileMall.dao.UserMapper;
import yc.MobileMall.mybean.ShoppedCart;

@Service
public class GoodsService {
	@Autowired
	private GoodsMapper goodsMapper;		//商品
	@Autowired
	private ShopcartMapper shopcartMapper;	//购物车
	@Autowired
	private UserMapper userMapper;			//用户
	
	/**
	 * test  获取用户购物车
	 * @param id 
	 * @param map
	 */
	public List<Shopcart> getShopCat(Integer id){
		User u=userMapper.selectByPrimaryKey(id);
		
		ShopcartExample sce=new ShopcartExample();     //购物车里有多件商品
		Criteria csce=sce.createCriteria();
		csce.andUserIdEqualTo(u.getId());
		List<Shopcart> listcart=shopcartMapper.selectByExample(sce);  
		return listcart;
	}
	
	/**
	 * 根据userid 获取购物车信息
	 * @param id
	 * @return
	 */
	public List<Shopcart> getGoodsNum(Integer userid){
		ShopcartExample example=new ShopcartExample();
		Criteria ct=example.createCriteria();
		ct.andUserIdEqualTo(userid);
		
		List<Shopcart> list=shopcartMapper.selectByExample(example);
		return list;
	}
	
	
	/**
	 * ok  获取用户购物车所有信息
	 * @param id 通过用户id
	 * 
	 */
	public List<ShoppedCart> getShopCatGoods(Integer id){
		List<ShoppedCart> cartList=new ArrayList<ShoppedCart>();
		
		ShopcartExample sce=new ShopcartExample();     //购物车里有多件商品
		Criteria csce=sce.createCriteria();
		csce.andUserIdEqualTo(id);
		List<Shopcart> listcart=shopcartMapper.selectByExample(sce);  
		
		int gid=-1;
		for(int i=0;i<listcart.size();i++){
			ShoppedCart shopcart=new ShoppedCart();
			gid=listcart.get(i).getGoodsId();
			shopcart.setUserId(id);
			shopcart.setGoodsid(gid);
			shopcart.setGoodsnum(listcart.get(i).getGoodsnum());
			shopcart.setCartid(listcart.get(i).getId());
			
			Goods goods=getGoods(gid);
			BeanUtils.copyProperties(goods, shopcart);		//复制
			
			setTotalprice(shopcart);
			cartList.add(shopcart);
		}
		return cartList;
	}
	
	/**
	 * 通过goodsid，查询商品
	 * @param id
	 * @return
	 */
	public Goods getGoods(int id) {
		return	goodsMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 设置一定数量的价格
	 * @param shopcart
	 * @return
	 */
	public void setTotalprice(ShoppedCart shopcart){
		if(shopcart.getDisPrice()==null){
			shopcart.setTotalprice(shopcart.getPrice()*shopcart.getGoodsnum()); 
		}else{
			shopcart.setTotalprice(shopcart.getDisPrice()*shopcart.getGoodsnum());
		}
	}
	
	/**
	 * 更新购物车，商品数量
	 * @param cartId 对应的购物车id
	 * @param quantity	更改数量
	 */
	public void updateCart(Integer cartId, Integer quantity) {
		Shopcart sc=new Shopcart();
		sc.setId(cartId);
		sc.setGoodsnum(quantity);
		shopcartMapper.updateByPrimaryKeySelective(sc);
	}
	
	/**
	 * 根据cartId 删除cart
	 * @param cartId
	 */
	public void deleteCart(Integer cartId) {
		shopcartMapper.deleteByPrimaryKey(cartId);
	}
	
	
	
	
	
	
	
	
	
	
	
}
