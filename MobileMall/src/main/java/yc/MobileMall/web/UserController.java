package yc.MobileMall.web;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;

import yc.MobileMall.bean.User;
import yc.MobileMall.utils.BizException;
import yc.MobileMall.utils.UserService;

@Transactional
@Controller
public class UserController {
	
	@Autowired
	private UserService uService;
	
	@InitBinder
	protected void initDate(WebDataBinder binder){
		SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
	}
	
	/////////登录
	@PostMapping(value="login")
	public String login(String AandE,String password,Map<String,String> map,HttpSession session){
		User user = new User();
		user.setPassword(password);
		if(AandE.contains("@qq.com")){
			user.setEmail(AandE.trim());
		}else{
			user.setAccount(AandE.trim());
		}
		try {
			User lgedUser=uService.getLogin(user);
			session.setAttribute("lgedUser", lgedUser);
			return "redirect:/main.html";
		} catch (BizException e) {
			map.put("loginMsg", e.getMessage());
			return "login";
		}
	}
	
	/////////注册用户，并发送邮件到用户邮箱
	@PostMapping(value="userRegist")
	public String regist(User user,String password1,String password2,Map<String,Object> map){
		if(!password1.equals(password2)) {
			map.put("registerMsg", "二次输入的密码不一致");
			return "register";
		}
		user.setPassword(password1);
		try {
			uService.getRegister(user);
			return "redirect:/login.html";
		} catch (BizException e) {
			map.put("registerMsg", e.getMessage());
			return "register";
		}
	}
	
}
