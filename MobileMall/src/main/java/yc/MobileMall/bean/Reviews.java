package yc.MobileMall.bean;

import java.util.Date;

public class Reviews {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reviews.id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reviews.goods_id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    private Integer goodsId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reviews.user_id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reviews.date
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    private Date date;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reviews.describe
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    private String describe;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column reviews.point
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    private Integer point;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reviews.id
     *
     * @return the value of reviews.id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reviews.id
     *
     * @param id the value for reviews.id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reviews.goods_id
     *
     * @return the value of reviews.goods_id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reviews.goods_id
     *
     * @param goodsId the value for reviews.goods_id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reviews.user_id
     *
     * @return the value of reviews.user_id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reviews.user_id
     *
     * @param userId the value for reviews.user_id
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reviews.date
     *
     * @return the value of reviews.date
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reviews.date
     *
     * @param date the value for reviews.date
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reviews.describe
     *
     * @return the value of reviews.describe
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reviews.describe
     *
     * @param describe the value for reviews.describe
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public void setDescribe(String describe) {
        this.describe = describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column reviews.point
     *
     * @return the value of reviews.point
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public Integer getPoint() {
        return point;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column reviews.point
     *
     * @param point the value for reviews.point
     *
     * @mbg.generated Tue Apr 30 19:28:52 CST 2019
     */
    public void setPoint(Integer point) {
        this.point = point;
    }
}