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
import yc.MobileMall.mybean.UserExtends;
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
	
	/**
	 * 更改购物车商品数量
	 * @param cartId
	 * @param quantity
	 */
	@PostMapping("updateShopCart")
	@ResponseBody
	public void updateShopCart(Integer cartId,Integer quantity){
		goodsService.updateCart(cartId,quantity);
	}
	
	/**
	 * 从购物车删除选中的商品
	 * @param cartId
	 */
	@PostMapping("deleteShopCart")
	@ResponseBody
	public void deleteShopCart(Integer cartId){
		System.err.println("cartID:"+cartId);
		goodsService.deleteCart(cartId);
	}
	
	@PostMapping("checkoutlist")
	@ResponseBody
	public UserExtends checkoutlist(Integer userId){
		UserExtends thisUser=userService.getThisUser(userId);
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
	public String cartPay(HttpServletRequest req,HttpSession session){
		List<ShoppedCart> listGoods=(List<ShoppedCart>) session.getAttribute("Goodslist");
		try {
			RecService.addNewCartPay(req,listGoods);
			return "支付成功！！";
		} catch (BizException e) {
			e.printStackTrace();
			return "支付失败！！";
		}
	}
	
	
	
}
