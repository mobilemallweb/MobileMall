package yc.MobileMall.web;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import yc.MobileMall.bean.User;
import yc.MobileMall.mybean.TransactionExtends;
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
		if(AandE.contains("@qq.com")){     //////////////////////////////用户邮箱必须@qq.com结尾
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
	
	/**
	 * 获取用户收货信息,并返回
	 * @return
	 */
	@RequestMapping("ReceiptMsg")
	@ResponseBody
	public void getReceiptMsg(HttpSession session){
		User user=(User) session.getAttribute("lgedUser");
		Integer uid=user.getId();
		List<TransactionExtends> tlist=uService.getReceiptMessage(uid);
		List<TransactionExtends> tlist2=new ArrayList<TransactionExtends>();
		for(int i=0;i<tlist.size();i++){
			if(tlist.get(i).getIsreceipt() ==null){
				tlist2.add(tlist.get(i));
			}
		}
		session.setAttribute("transList", tlist2);		//将信息保存在session中
	}
	
	/**
	 * 
	 */
	@RequestMapping("ConfirmReceipt")
	public String setConfirmReceipt(Integer transid){
		try {
			uService.setReceipt(transid);
		} catch (BizException e) {
			e.printStackTrace();
		}
		return "my-account";
	}
}
