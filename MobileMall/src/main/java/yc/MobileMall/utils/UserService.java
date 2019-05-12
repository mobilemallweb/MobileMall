package yc.MobileMall.utils;

import java.util.List;
import java.util.Random;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.Receiver;
import yc.MobileMall.bean.ReceiverExample;
import yc.MobileMall.bean.User;
import yc.MobileMall.bean.UserExample;
import yc.MobileMall.bean.UserExample.Criteria;
import yc.MobileMall.dao.ReceiverMapper;
import yc.MobileMall.dao.UserMapper;
import yc.MobileMall.mybean.UserExtends;

@Service
public class UserService {
	@Autowired
	private UserMapper usermapper; 
	
	@Autowired
	private PostEmail postEmail;  //发送邮件
	
	@Autowired
	private ReceiverMapper receiverMapper;	//收货人mapper
	
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
		
	//先查询邮箱是否已经注册过	
		UserExample example=new UserExample();
		Criteria cr=example.createCriteria();
		cr.andEmailEqualTo(user.getEmail());
		List<User> ulist=usermapper.selectByExample(example);
		if(ulist.size()>0){
			throw new BizException("邮箱已经被使用！");
		}else if(usermapper.insert(user)<1){
			throw new BizException("用户创建失败！");
		}else{		//创建成功，发送邮件
			postEmail.sendMail(user.getEmail(), "欢迎您加入ororus购物", "你的用户账号为："+account+",让我们一起买买买...");
		}
	}
	
	/**
	 * 通过用户id查询，用户
	 * @param userId
	 * @return
	 */
	public UserExtends getThisUser(Integer userId) {
		UserExtends ue=new UserExtends();
		User user=usermapper.selectByPrimaryKey(userId);	//查询user数据
		BeanUtils.copyProperties(user, ue);
		
		ReceiverExample re=new ReceiverExample();			//查询对应收货信息
		yc.MobileMall.bean.ReceiverExample.Criteria cri=re.createCriteria();
		cri.andUserIdEqualTo(userId);
		List<Receiver> listRec=receiverMapper.selectByExample(re);
		
		Receiver[] recs=listRec.toArray(new Receiver[listRec.size()]);
		ue.setReceivers(recs);
		
		return ue;
	}
	
	
}
