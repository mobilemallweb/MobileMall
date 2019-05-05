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
	 * test  多次查询，将数据保存在相应的对象中  最终保存在Map中
	 * @param id
	 * @param map
	 * 取值购物车 ：listcart  
	 * 取商品信息：listgoods
	 */
	public void getShopCat(Integer id, Map<String, Object> map){
		User u=userMapper.selectByPrimaryKey(id);
		
		ShopcartExample sce=new ShopcartExample();     //购物车里有多件商品
		Criteria csce=sce.createCriteria();
		csce.andUserIdEqualTo(u.getId());
		List<Shopcart> listcart=shopcartMapper.selectByExample(sce);  
		map.put("listcart", listcart);
		
		List<Goods> listgoods=new ArrayList<Goods>();
		for(int i=0;i<listcart.size();i++){
			Goods  goods=goodsMapper.selectByPrimaryKey(listcart.get(i).getGoodsId());
			listgoods.add(goods);
		}
		map.put("listgoods",listgoods);
	}
}
