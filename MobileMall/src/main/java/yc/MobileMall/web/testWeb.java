package yc.MobileMall.web;

import java.util.Arrays;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class testWeb {
	@GetMapping("hello")
	@ResponseBody
	public String hello(){
		return "hello world";
	}
	
	/*@GetMapping("seccess")
	public String seccess(Map<String,Object> map){
		map.put("a", "<h2>AAA</h2>");
		map.put("b","<h3>BBB</h3>");
		map.put("user", Arrays.asList("zhangsan","lisi","wangwu"));
		return "about";
	}*/
	
}
