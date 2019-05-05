package yc.MobileMall.utils;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.User;
import yc.MobileMall.bean.UserExample;
import yc.MobileMall.bean.UserExample.Criteria;
import yc.MobileMall.dao.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper usermapper;
	
	@Autowired
	private PostEmail postEmail;
	
	public User getLogin(User user) throws BizException {
		UserExample uem=new UserExample();
		Criteria cri=uem.createCriteria();
		if(user.getAccount()!=null){
			cri.andAccountEqualTo(user.getAccount()).andPasswordEqualTo(user.getPassword());
		}else{
			cri.andEmailEqualTo(user.getEmail()).andPasswordEqualTo(user.getPassword());
		}
		
		List<User> list=usermapper.selectByExample(uem);   //查询
		if(list.size()<1){
			throw new BizException("账号或者密码错误");
		}else{
			return list.get(0);
		}
	}

	public void getRegister(User user) throws BizException {
		user.setIntegral(0);
		user.setIsblacklist(0);
		Random rm=new Random();
		int account=100000+rm.nextInt(99999999);
		user.setAccount(account+"");
		if(usermapper.insert(user)<1){
			throw new BizException("用户创建失败");
		}else{
//			postEmail.sendMail(user.getEmail(), "Mobile Mall", 
//					"wolcome to Mobile Mall,your account is "+account);
		}
	}
	
	
}
