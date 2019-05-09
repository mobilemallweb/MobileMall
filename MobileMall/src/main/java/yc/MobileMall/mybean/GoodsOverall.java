package yc.MobileMall.mybean;

import java.util.Arrays;

public class GoodsOverall {
	private Integer id;

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
    
    private String[] goodsClass;    //类别
    
    private String[] size; 		//尺寸
    
    private String[] src;     //图片地址

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String[] getGoodsClass() {
		return goodsClass;
	}

	public void setGoodsClass(String[] goodsClass) {
		this.goodsClass = goodsClass;
	}

	public String[] getSize() {
		return size;
	}

	public void setSize(String[] size) {
		this.size = size;
	}

	public String[] getSrc() {
		return src;
	}

	public void setSrc(String[] src) {
		this.src = src;
	}

	@Override
	public String toString() {
		return "GoodsOverall [id=" + id + ", name=" + name + ", price=" + price + ", disPrice=" + disPrice + ", brands="
				+ brands + ", productCode=" + productCode + ", weight=" + weight + ", rewardPoints=" + rewardPoints
				+ ", availability=" + availability + ", goosdes=" + goosdes + ", description=" + description
				+ ", classId=" + classId + ", reviews=" + reviews + ", salesnumId=" + salesnumId + ", goodsClass="
				+ Arrays.toString(goodsClass) + ", size=" + Arrays.toString(size) + ", src=" + Arrays.toString(src)
				+ "]";
	}
}
