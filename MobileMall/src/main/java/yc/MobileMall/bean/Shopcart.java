package yc.MobileMall.bean;

public class Shopcart {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.goods_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.goodsnum
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer goodsnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shopcart.user_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.id
     *
     * @return the value of shopcart.id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.id
     *
     * @param id the value for shopcart.id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.goods_id
     *
     * @return the value of shopcart.goods_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.goods_id
     *
     * @param goodsId the value for shopcart.goods_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.goodsnum
     *
     * @return the value of shopcart.goodsnum
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.goodsnum
     *
     * @param goodsnum the value for shopcart.goodsnum
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shopcart.user_id
     *
     * @return the value of shopcart.user_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shopcart.user_id
     *
     * @param userId the value for shopcart.user_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}