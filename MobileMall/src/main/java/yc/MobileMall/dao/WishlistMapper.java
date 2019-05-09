package yc.MobileMall.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yc.MobileMall.bean.Wishlist;
import yc.MobileMall.bean.WishlistExample;

public interface WishlistMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    long countByExample(WishlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int deleteByExample(WishlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int insert(Wishlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int insertSelective(Wishlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    List<Wishlist> selectByExample(WishlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    Wishlist selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int updateByExampleSelective(@Param("record") Wishlist record, @Param("example") WishlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int updateByExample(@Param("record") Wishlist record, @Param("example") WishlistExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int updateByPrimaryKeySelective(Wishlist record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table wishlist
     *
     * @mbg.generated Thu May 09 20:53:02 CST 2019
     */
    int updateByPrimaryKey(Wishlist record);
}