package yc.MobileMall.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import yc.MobileMall.bean.Goods;
import yc.MobileMall.bean.Wishlist;
import yc.MobileMall.mybean.GoodsOverall;
import yc.MobileMall.utils.GoodsService;
import yc.MobileMall.utils.WishlistService;

@Controller
public class WishlistController {
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private WishlistService wishlistService;
	
	/**
	 * 通过用户，查询其对应的收藏,关联查询goods
	 * @param userId  用户的id
	 * @param session
	 * @return
	 */
	@RequestMapping("WishlistPage")
	public String getWishlistPage(Integer uid,HttpSession session){
		if(uid!=null){
			List<Wishlist> listWish=goodsService.getWishlist(uid);
			List<GoodsOverall> WishGOlist=new ArrayList<GoodsOverall>();
			
			for(int i=0;i<listWish.size();i++){
				GoodsOverall GO=new GoodsOverall();
				Goods gs=goodsService.getGoods(listWish.get(i).getGoodsId());
				BeanUtils.copyProperties(gs, GO);
				GO.setWishlist(listWish.get(i));
				WishGOlist.add(GO);
			}
			session.setAttribute("WishGOlist", WishGOlist);
			return "redirect:/wishlist.html";
		}else{
			return "login";
		}
	}
	
	/**
	 * 移除商品收藏
	 * @param wid
	 * @param session
	 * @return
	 */
	@RequestMapping("removeWish")
	public String RemoveWishlist(Integer wid,HttpSession session){
		List<GoodsOverall> WishGOlist=(List<GoodsOverall>) session.getAttribute("WishGOlist");
		for(int i=0;i<WishGOlist.size();i++){
			if(wid.equals(WishGOlist.get(i).getWishlist().getId())){
				wishlistService.remove(wid);
				WishGOlist.remove(i);
			}
		}
		session.setAttribute("WishGOlist", WishGOlist);
		return "redirect:/wishlist.html";
	}
	
	@RequestMapping("wishtoCart")
	public String wishtoCart(Integer wid,Integer uid,HttpSession session){
		List<GoodsOverall> WishGOlist=(List<GoodsOverall>) session.getAttribute("WishGOlist");
		for(int i=0;i<WishGOlist.size();i++){
			if(wid.equals(WishGOlist.get(i).getWishlist().getId())){
				wishlistService.addtoCart(WishGOlist.get(i),uid,wid);
				WishGOlist.remove(i);
			}
		}
		session.setAttribute("WishGOlist", WishGOlist);
		return "redirect:/wishlist.html";
	}
	
	
	
	
	
	
}
