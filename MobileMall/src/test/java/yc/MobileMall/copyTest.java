package yc.MobileMall;

import java.sql.Date;
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
import yc.MobileMall.mybean.UserExtends;
import yc.MobileMall.utils.BizException;
import yc.MobileMall.utils.GoodsService;
import yc.MobileMall.utils.ReceiverService;
import yc.MobileMall.utils.ShopListService;
import yc.MobileMall.utils.UserService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class copyTest {
	@Autowired
	private GoodsService goodsService;
	
	@Autowired
	private ReceiverService rs;
	
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
	
	@Autowired
	private UserService us;
	
	@Test
	public void testcheckoutlist(){
		UserExtends ue=us.getThisUser(1);
		System.out.println(ue);
	}
	
	@Test
	public void tetsDate(){
		System.err.println(new Date(System.currentTimeMillis()));
	}
	
	
	@Test
	public void addBuy() throws BizException{
		/*for(int i=0;i<2;i++){
			if(i>0){
				rs.addNewCartPay(i);
			}
		}*/
		rs.addNewCartPay("1,2");
	}
	
}
