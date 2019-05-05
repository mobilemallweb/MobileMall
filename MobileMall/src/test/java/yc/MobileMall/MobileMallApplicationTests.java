package yc.MobileMall;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.junit4.SpringRunner;

import yc.MobileMall.bean.Shopcart;
import yc.MobileMall.bean.User;
import yc.MobileMall.bean.UserExample;
import yc.MobileMall.bean.UserExample.Criteria;
import yc.MobileMall.dao.UserMapper;
import yc.MobileMall.utils.GoodsService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MobileMallApplicationTests {
	
	@Autowired
	private UserMapper um;
	
	@Test
	public void contextLoads() {
		/*User user=new User();
		user.setPassword("123");
		user.setEmail("123@qq.com");
		um.insert(user);*/
		UserExample uem=new UserExample();
		Criteria o=uem.createCriteria();
		o.andIdEqualTo(1);
		List<User> list=um.selectByExample(uem);
		User u=list.get(0);

		if(u.getIsblacklist() != null){
			System.out.println(u.getIsblacklist());
		}else{
			System.out.println("error");
		}
	}
	
	@Test
	public void test1() {
		String s="asdascascz@asd";
		System.out.println(s.contains("."));
	}
	
	@Resource
	private JavaMailSender jms;
	@Test
	public void sendMail(){
		SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("1023998784@qq.com");   //有谁发送
        message.setTo("320685757@qq.com");		//发送给谁
        message.setSubject("主题：简单邮件");		//主题
        message.setText("测试邮件内容");			//内容
        jms.send(message);
	}
	
	@Autowired
	private GoodsService gs;
	@Test
	public void testCart() {
		Map<String,Object> map=new HashMap<String, Object>();
		gs.getShopCat(1, map);
		Shopcart s= (Shopcart) map.get("listcart");
		System.out.println(s.toString());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
