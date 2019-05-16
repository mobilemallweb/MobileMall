package yc.MobileMall.mybean;

import java.util.Arrays;
import java.util.Date;

public class TransactionExtends {
		private Integer id;
		
	    private String goodsId;

	    private Integer userId;

	    private Integer receiverId;

	    private Integer totalprice;
	    
	    private Date transdate;

	    private Date estimatedtime;

	    private Integer isreceipt;
	    
	    private String[] goodsName;     //商品名
	    
	    private Integer[] goodsNum;		//商品数量

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getGoodsId() {
			return goodsId;
		}

		public void setGoodsId(String goodsId) {
			this.goodsId = goodsId;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		public Integer getReceiverId() {
			return receiverId;
		}

		public void setReceiverId(Integer receiverId) {
			this.receiverId = receiverId;
		}

		public Integer getTotalprice() {
			return totalprice;
		}

		public void setTotalprice(Integer totalprice) {
			this.totalprice = totalprice;
		}

		public Date getTransdate() {
			return transdate;
		}

		public void setTransdate(Date transdate) {
			this.transdate = transdate;
		}

		public Date getEstimatedtime() {
			return estimatedtime;
		}

		public void setEstimatedtime(Date estimatedtime) {
			this.estimatedtime = estimatedtime;
		}

		public Integer getIsreceipt() {
			return isreceipt;
		}

		public void setIsreceipt(Integer isreceipt) {
			this.isreceipt = isreceipt;
		}

		public Integer[] getGoodsNum() {
			return goodsNum;
		}

		public void setGoodsNum(Integer[] goodsNum) {
			this.goodsNum = goodsNum;
		}

		public String[] getGoodsName() {
			return goodsName;
		}

		public void setGoodsName(String[] goodsName) {
			this.goodsName = goodsName;
		}

		@Override
		public String toString() {
			return "TransactionExtends [id=" + id + ", goodsId=" + goodsId + ", userId=" + userId + ", receiverId="
					+ receiverId + ", totalprice=" + totalprice + ", transdate=" + transdate + ", estimatedtime="
					+ estimatedtime + ", isreceipt=" + isreceipt + ", goodsName=" + Arrays.toString(goodsName)
					+ ", goodsNum=" + Arrays.toString(goodsNum) + "]";
		}

		
	    
}
