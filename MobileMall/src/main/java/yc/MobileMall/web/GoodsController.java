package yc.MobileMall.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.swing.event.CaretListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yc.MobileMall.bean.Goods;
import yc.MobileMall.bean.Shopcart;
import yc.MobileMall.mybean.ShoppedCart;
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
	 * 可优化
	 */
	@PostMapping("CartPage")
	public String getShopCart(Integer id,HttpSession session){
		if(id!=null){
			List<ShoppedCart> listGoods=goodsService.getShopCatGoods(id);
			
			session.setAttribute("Goodslist", listGoods);
			return "redirect:/cart.html";
		}else{
			return "cart";
		}
	}
	
	@PostMapping("updateShopCart")
	public String updateShopCart(Integer cartId,Integer quantity){
		goodsService.updateCart(cartId,quantity);
		return "redirect:/cart.html";
	}
	
	
	
	
	
	
	
	
}
