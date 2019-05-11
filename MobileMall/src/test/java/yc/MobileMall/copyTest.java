package yc.MobileMall;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yc.MobileMall.bean.Goods;
import yc.MobileMall.mybean.GoodsOverall;
import yc.MobileMall.mybean.ShoppedCart;
import yc.MobileMall.utils.GoodsService;
import yc.MobileMall.utils.ShopListService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class copyTest {
	@Autowired
	private GoodsService goodsService;
	
	@Test
	public void getCart(){
		List<ShoppedCart> list=goodsService.getShopCatGoods(1);
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
	}
	
	@Test
	public void testCopy(){
		List<ShoppedCart> listGoods=goodsService.getShopCatGoods(1);  //查询物品
		System.out.println(listGoods.get(0).getTotalprice());
	}
	
	@Test
	public void test2(){
		goodsService.getGoods(1);
	}
	
	@Test  //测试购物车数量更改
	public void test3(){
		goodsService.updateCart(1, 99);
	}
	
	@Autowired
	private ShopListService sls;
	@Test  //测试商品信息
	public void test4(){
		
		List<GoodsOverall> list=sls.selectAllGoods();
		System.out.println(list.get(1));
	}
	
}
