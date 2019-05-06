package yc.MobileMall;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import yc.MobileMall.bean.Goods;
import yc.MobileMall.mybean.ShoppedCart;
import yc.MobileMall.utils.GoodsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class copyTest {
	@Autowired
	private GoodsService goodsService;
	
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
	
	
}
