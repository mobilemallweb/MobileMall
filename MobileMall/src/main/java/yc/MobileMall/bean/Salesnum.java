package yc.MobileMall.bean;

public class Salesnum {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salesnum.id
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column salesnum.goods_sales_number
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    private Integer goodsSalesNumber;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salesnum.id
     *
     * @return the value of salesnum.id
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salesnum.id
     *
     * @param id the value for salesnum.id
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column salesnum.goods_sales_number
     *
     * @return the value of salesnum.goods_sales_number
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    public Integer getGoodsSalesNumber() {
        return goodsSalesNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column salesnum.goods_sales_number
     *
     * @param goodsSalesNumber the value for salesnum.goods_sales_number
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    public void setGoodsSalesNumber(Integer goodsSalesNumber) {
        this.goodsSalesNumber = goodsSalesNumber;
    }
}