package yc.MobileMall.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import yc.MobileMall.utils.GoodsService;

@Controller
public class GoodsController {
	@Autowired
	private GoodsService goodsService;
	
	/**
	 * 通过用户，查询其对应的购物车
	 * @param userId  用户的id
	 * @param session
	 * @return
	 */
	@PostMapping("CartPage")
	public String getShopCart(Integer userId,HttpSession session){
		System.out.println(userId+"----------");
		Map<String, Object> map=new HashMap<String, Object>();
	//	goodsService.getShopCat(userId,map);
		
		
		return "cart.html";
	}
	
	
	
	
	
	
	
	
}
