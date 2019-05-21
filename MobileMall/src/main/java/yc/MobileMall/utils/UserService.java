package yc.MobileMall.utils;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import yc.MobileMall.bean.Goods;
import yc.MobileMall.bean.Receiver;
import yc.MobileMall.bean.ReceiverExample;
import yc.MobileMall.bean.Transaction;
import yc.MobileMall.bean.TransactionExample;
import yc.MobileMall.bean.User;
import yc.MobileMall.bean.UserExample;
import yc.MobileMall.bean.UserExample.Criteria;
import yc.MobileMall.dao.GoodsMapper;
import yc.MobileMall.dao.ReceiverMapper;
import yc.MobileMall.dao.TransactionMapper;
import yc.MobileMall.dao.UserMapper;
import yc.MobileMall.mybean.TransactionExtends;
import yc.MobileMall.mybean.UserExtends;

@Service
public class UserService {
	@Autowired
	private UserMapper usermapper; 
	
	@Autowired
	private PostEmail postEmail;  //发送邮件
	
	@Autowired
	private TransactionMapper transactionMapper;	//收货信息
	
	@Autowired
	private ReceiverMapper receiverMapper;	//收货人mapper
	
	@Autowired
	private GoodsMapper goodsMapper;
	
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
	
	/**
	 * 获取用户订单信息
	 * @param uid 
	 * @return 
	 */
	public List<TransactionExtends> getReceiptMessage(Integer uid) {
		//获取订单信息
		TransactionExample te=new TransactionExample();
		yc.MobileMall.bean.TransactionExample.Criteria cri=te.createCriteria();
		cri.andUserIdEqualTo(uid);
		List<Transaction> list=transactionMapper.selectByExample(te);
	//保存在拓展订单中
		//获取相同id个数，保存为数量
		List<TransactionExtends> tsteList=new ArrayList<TransactionExtends>();
		for(int i=0;i<list.size();i++){
			TransactionExtends TE=new TransactionExtends();
			BeanUtils.copyProperties(list.get(i), TE);
			
			tsteList.add(TE);
		}
		setGsId(tsteList);
		return tsteList;
	}
	
	//获取所有id,从而获取商品名,获取对应的数量
	public void setGsId(List<TransactionExtends> tsteList){
		int size=tsteList.size();
		for(int i=0;i<size;i++){
			TransactionExtends te=tsteList.get(i);
			String[] ss=te.getGoodsId().split(",");
			
			String gdid="";
			String gdnum="";
			for(int j=1;j<ss.length;j++){
				if(! ss[j].equals(ss[j-1])){
					int x=te.getGoodsId().length()-te.getGoodsId().replaceAll(ss[j],"").length();
					x=x/ss[j].length();
					gdid=gdid+","+ss[j];
					gdnum=gdnum+","+x;
				}
			}
			
			String[] str1=gdid.split(",");
			String[] str2=gdnum.split(",");
			Integer[] gids=new Integer[str1.length-1];
			Integer[] gnums=new Integer[str2.length-1];
			for(int k=1;k<str1.length;k++){
				gids[k-1]=Integer.parseInt(str1[k]);
				gnums[k-1]=Integer.parseInt(str2[k]);
			}
			
			String[] names=getGoodsname(gids);
			tsteList.get(i).setGoodsName(names);
			tsteList.get(i).setGoodsNum(gnums);
		}
	}
	
	//传id数组 获取对应的goodsname
	public String[] getGoodsname(Integer[] gids){
		int len=gids.length;
		String[] names=new String[len];
		for(int i=0;i<len;i++){
			Goods gd=goodsMapper.selectByPrimaryKey(gids[i]);
			names[i]=gd.getName();
		}
		return names;
	}
	
	/**
	 * 传入订单id，修改
	 * @param transid
	 * @throws BizException 
	 */
	public void setReceipt(Integer transid) throws BizException {
		Transaction record=transactionMapper.selectByPrimaryKey(transid);
		record.setIsreceipt(2);
		int i=transactionMapper.updateByPrimaryKey(record);
		if(i<0){
			throw new BizException("系统繁忙!!");
		}
	}
	
	/**
	 * 修改用户信息，先判断是否有值改变
	 * @param session
	 * @param req
	 * @throws BizException 
	 */
	public User updatelgedUser(HttpSession session, HttpServletRequest req) throws BizException {
		User oldUser=(User) session.getAttribute("lgedUser");
		
		String email=req.getParameter("email");
		if(! email.equals(oldUser.getEmail())){
			if(checkemail(email)){
				throw new BizException("邮箱已存在，修改失败。。。");
			}
			oldUser.setEmail(email);
		}
		
		String sex=req.getParameter("sex");
		String firstName=req.getParameter("firstName");
		String lastName=req.getParameter("lastName");
		String newPwd=req.getParameter("password2");
		String confirmPwd=req.getParameter("securityCode");
		String birthday=req.getParameter("birthday");
		
		Date date=java.sql.Date.valueOf(birthday);
		
		if(! sex.isEmpty() &&! oldUser.getSex().equals(sex)){
			oldUser.setSex(sex);
		}
		if(! firstName.equals(oldUser.getFirstName())){
			oldUser.setFirstName(firstName);
		}
		if(! lastName.equals(oldUser.getLastName())){
			oldUser.setLastName(lastName);
		}
		if(! newPwd.equals(oldUser.getPassword()) && confirmPwd.equals(oldUser.getSecurityCode())){
			oldUser.setPassword(newPwd);
		}
		if(! birthday.equals(oldUser.getBirthday())){
			oldUser.setBirthday(date);
		}
		
		int i=usermapper.updateByPrimaryKeySelective(oldUser);
		if(i>0){
			return oldUser;
		}else{
			throw new BizException("修改失败！！");
		}
	}

	/**
	 * 判断邮箱是否已存在
	 * @param email
	 * @return 存在true，不存在false
	 */
	private boolean checkemail(String email) {
		UserExample example=new UserExample();
		yc.MobileMall.bean.UserExample.Criteria cri=example.createCriteria();
		cri.andEmailEqualTo(email);
		List<User> listusers=usermapper.selectByExample(example);
		
		if(listusers.size()>0){
			return true;
		}
		return false;
	}
	
	
	
	
}
