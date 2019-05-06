package yc.MobileMall.mybean;

public class ShoppedCart {
		private Integer goodsid;

	    private String name;

	    private Integer price;

	    private Integer disPrice;

	    private String brands;

	    private Integer productCode;

	    private Integer weight;

	    private Integer rewardPoints;

	    private Integer availability;

	    private String goosdes;

	    private String description;

	    private Integer classId;

	    private Integer reviews;

	    private Integer salesnumId;
	    
	    private Integer cartid;

	    private Integer goodsnum;

	    private Integer userId;

	    private Integer totalprice;  //总价
	    
		public Integer getTotalprice() {
			return totalprice;
		}

		public void setTotalprice(Integer totalprice) {
			this.totalprice = totalprice;
		}

		public Integer getGoodsid() {
			return goodsid;
		}

		public void setGoodsid(Integer goodsid) {
			this.goodsid = goodsid;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getPrice() {
			return price;
		}

		public void setPrice(Integer price) {
			this.price = price;
		}

		public Integer getDisPrice() {
			return disPrice;
		}

		public void setDisPrice(Integer disPrice) {
			this.disPrice = disPrice;
		}

		public String getBrands() {
			return brands;
		}

		public void setBrands(String brands) {
			this.brands = brands;
		}

		public Integer getProductCode() {
			return productCode;
		}

		public void setProductCode(Integer productCode) {
			this.productCode = productCode;
		}

		public Integer getWeight() {
			return weight;
		}

		public void setWeight(Integer weight) {
			this.weight = weight;
		}

		public Integer getRewardPoints() {
			return rewardPoints;
		}

		public void setRewardPoints(Integer rewardPoints) {
			this.rewardPoints = rewardPoints;
		}

		public Integer getAvailability() {
			return availability;
		}

		public void setAvailability(Integer availability) {
			this.availability = availability;
		}

		public String getGoosdes() {
			return goosdes;
		}

		public void setGoosdes(String goosdes) {
			this.goosdes = goosdes;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public Integer getClassId() {
			return classId;
		}

		public void setClassId(Integer classId) {
			this.classId = classId;
		}

		public Integer getReviews() {
			return reviews;
		}

		public void setReviews(Integer reviews) {
			this.reviews = reviews;
		}

		public Integer getSalesnumId() {
			return salesnumId;
		}

		public void setSalesnumId(Integer salesnumId) {
			this.salesnumId = salesnumId;
		}

		public Integer getCartid() {
			return cartid;
		}

		public void setCartid(Integer cartid) {
			this.cartid = cartid;
		}

		public Integer getGoodsnum() {
			return goodsnum;
		}

		public void setGoodsnum(Integer goodsnum) {
			this.goodsnum = goodsnum;
		}

		public Integer getUserId() {
			return userId;
		}

		public void setUserId(Integer userId) {
			this.userId = userId;
		}

		@Override
		public String toString() {
			return "ShoppedCart [goodsid=" + goodsid + ", name=" + name + ", price=" + price + ", disPrice=" + disPrice
					+ ", brands=" + brands + ", productCode=" + productCode + ", weight=" + weight + ", rewardPoints="
					+ rewardPoints + ", availability=" + availability + ", goosdes=" + goosdes + ", description="
					+ description + ", classId=" + classId + ", reviews=" + reviews + ", salesnumId=" + salesnumId
					+ ", cartid=" + cartid + ", goodsnum=" + goodsnum + ", userId=" + userId + "]";
		}
		

}
