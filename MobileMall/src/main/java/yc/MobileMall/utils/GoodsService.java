package yc.MobileMall.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
	 * 取值购物车 ：listcart  
	 * 取商品信息：listgoods
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
	 * 根据goodsid  获取对应的物品信息
	 * @param id
	 * @return
	 */
	public Goods getg(Integer id){
		System.err.println(id);
		return goodsMapper.selectByPrimaryKey(id);
	}
	
	/**
	 * 根据goodsid数组  获取所有对应的物品信息
	 * @param id
	 * @return
	 */
	public List<Goods> getGoods(Integer[] ids){
		List<Goods> listg=new ArrayList<Goods>();
		for(Integer id:ids){
			Goods gs=goodsMapper.selectByPrimaryKey(id);
			listg.add(gs);
		}
		return listg;
	}
	
	
	
	
}
