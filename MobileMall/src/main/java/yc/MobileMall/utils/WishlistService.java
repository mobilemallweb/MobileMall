package yc.MobileMall.utils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.Shopcart;
import yc.MobileMall.dao.ShopcartMapper;
import yc.MobileMall.dao.WishlistMapper;
import yc.MobileMall.mybean.GoodsOverall;

@Service
public class WishlistService {
	@Autowired
	private WishlistMapper wishlistMapper;
	
	@Autowired
	private ShopcartMapper shopcartMapper;
	
	/**
	 * 通过id，移除
	 * @param wid
	 */
	public void remove(Integer wid){
		wishlistMapper.deleteByPrimaryKey(wid);
	}

	/**
	 * 移到购物车
	 * @param goodsOverall 
	 * @param uid 
	 */
	public void addtoCart(GoodsOverall goodsOverall, Integer uid,Integer wid) {
		Shopcart sc=new Shopcart();
		sc.setUserId(uid);
		sc.setGoodsId(goodsOverall.getId());
		sc.setGoodsnum(1);
		int i=shopcartMapper.insertSelective(sc);
		if(i>0){
			remove(wid);
		}
	}
	
	
}
