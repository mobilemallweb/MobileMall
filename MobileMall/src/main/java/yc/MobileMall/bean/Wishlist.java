package yc.MobileMall.bean;

public class Wishlist {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wishlist.id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wishlist.goods_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wishlist.goodsnum
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer goodsnum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column wishlist.user_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    private Integer userId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wishlist.id
     *
     * @return the value of wishlist.id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wishlist.id
     *
     * @param id the value for wishlist.id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wishlist.goods_id
     *
     * @return the value of wishlist.goods_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wishlist.goods_id
     *
     * @param goodsId the value for wishlist.goods_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wishlist.goodsnum
     *
     * @return the value of wishlist.goodsnum
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getGoodsnum() {
        return goodsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wishlist.goodsnum
     *
     * @param goodsnum the value for wishlist.goodsnum
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setGoodsnum(Integer goodsnum) {
        this.goodsnum = goodsnum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column wishlist.user_id
     *
     * @return the value of wishlist.user_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column wishlist.user_id
     *
     * @param userId the value for wishlist.user_id
     *
     * @mbg.generated Wed May 15 21:50:59 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}