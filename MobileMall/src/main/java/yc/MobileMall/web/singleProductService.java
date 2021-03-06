package yc.MobileMall.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import yc.MobileMall.bean.User;
import yc.MobileMall.mybean.GoodsOverall;
import yc.MobileMall.mybean.ShoppedCart;
import yc.MobileMall.utils.ShopListService;

@Controller
public class singleProductService {
	@Autowired
	private ShopListService shopListService;
	
	@RequestMapping("single-product.html")
	public String getdetailGoods(Integer goodsid,HttpSession session){
		@SuppressWarnings("unchecked")
		List<GoodsOverall> listGoods=(List<GoodsOverall>) session.getAttribute("listGoods");
		int index=0;
		if(null==listGoods){
			return "redirect:/shop-fullwidth.html";
		}else{
			for(int i=0;i<listGoods.size();i++){
				if(goodsid==listGoods.get(i).getId()){
					index=i;break;
				}
			}
		}
		GoodsOverall GO=listGoods.get(index);
		shopListService.getNumSize(GO);
		session.setAttribute("singleGoods", GO);
		return "single-product";
	}
	
	//添加商品到购物车
	@RequestMapping("addtoCart")
	public String addtoCart(HttpSession session,String size,Integer num){
		User user=(User) session.getAttribute("lgedUser");
		if(null==user){
			return "login";
		}
		size=size.substring(14);
		GoodsOverall GO =(GoodsOverall) session.getAttribute("singleGoods");
		shopListService.addtoCartSer(GO,user.getId(),size,num);
		return "redirect:/CartPage?id="+user.getId();
	}
	
	//添加商品到收藏
	@RequestMapping("addtoWishlist")
	public String addtoWishlist(HttpSession session,String size,Integer num){
		User user=(User) session.getAttribute("lgedUser");
		if(null==user){
			return "login";
		}
		size=size.substring(14);
		GoodsOverall GO =(GoodsOverall) session.getAttribute("singleGoods");
		shopListService.addtoWishlist(GO,user.getId(),size,num);
		return "wishlist";
	}
	
	
	
	
	
	
	
	
}
