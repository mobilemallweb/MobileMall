package yc.MobileMall.mybean;

//支付宝订单信息
public class PayOrder {
	private Integer  out_trade_no;  //订单号
	
	private Integer total_amount;  //金额
	
	private String subject;   //订单名
	
	private String body;		//描述

	public Integer getOut_trade_no() {
		return out_trade_no;
	}

	public void setOut_trade_no(Integer out_trade_no) {
		this.out_trade_no = out_trade_no;
	}

	public Integer getTotal_amount() {
		return total_amount;
	}

	public void setTotal_amount(Integer total_amount) {
		this.total_amount = total_amount;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
	
}
