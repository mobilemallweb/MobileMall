package yc.MobileMall.mybean;

import java.util.Arrays;
import java.util.Date;

import yc.MobileMall.bean.Receiver;
import yc.MobileMall.bean.Shopcart;
import yc.MobileMall.bean.Wishlist;

public class UserExtends {
	private Integer id;

    private String account;

    private String sex;

    private Date birthday;

    private String firstName;

    private String lastName;

    private String email;

    private String password;

    private Integer integral;

    private String securityCode;

    private Integer isblacklist;
    
    private Shopcart shopcart;			//对应的购物车，基bean
    
    private Receiver[] receivers;		//收货信息，多个
    
    private Wishlist[] wishlists;		//收藏商品,多个

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getIntegral() {
		return integral;
	}

	public void setIntegral(Integer integral) {
		this.integral = integral;
	}

	public String getSecurityCode() {
		return securityCode;
	}

	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}

	public Integer getIsblacklist() {
		return isblacklist;
	}

	public void setIsblacklist(Integer isblacklist) {
		this.isblacklist = isblacklist;
	}

	public Shopcart getShopcart() {
		return shopcart;
	}

	public void setShopcart(Shopcart shopcart) {
		this.shopcart = shopcart;
	}

	public Receiver[] getReceivers() {
		return receivers;
	}

	public void setReceivers(Receiver[] receivers) {
		this.receivers = receivers;
	}

	public Wishlist[] getWishlists() {
		return wishlists;
	}

	public void setWishlists(Wishlist[] wishlists) {
		this.wishlists = wishlists;
	}

	@Override
	public String toString() {
		return "UserExtends [id=" + id + ", account=" + account + ", sex=" + sex + ", birthday=" + birthday
				+ ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", password=" + password
				+ ", integral=" + integral + ", securityCode=" + securityCode + ", isblacklist=" + isblacklist
				+ ", shopcart=" + shopcart + ", receivers=" + Arrays.toString(receivers) + ", wishlists="
				+ Arrays.toString(wishlists) + "]";
	}
    
    
}
