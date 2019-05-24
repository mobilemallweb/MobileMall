package yc.MobileMall.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yc.MobileMall.mybean.GoodsOverall;
import yc.MobileMall.utils.ShopListService;

@Controller
public class ShopListController {
	@Autowired
	private ShopListService shopListService;
	
	@RequestMapping("shop-fullwidth.html")
	public String toShopFullWidth(HttpSession session){
		//获取商品信息，图片，类别，评分     （尺码，数量详情页查询）
		List<GoodsOverall> listGoods=shopListService.selectAllGoods();  
		
		session.setAttribute("listGoods", listGoods);
		return "shop-fullwidth";
	}
}
