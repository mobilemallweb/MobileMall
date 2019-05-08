package yc.MobileMall.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yc.MobileMall.bean.Class;
import yc.MobileMall.bean.ClassExample;

public interface ClassMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    long countByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int deleteByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int insert(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int insertSelective(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    List<Class> selectByExample(ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    Class selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int updateByExampleSelective(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int updateByExample(@Param("record") Class record, @Param("example") ClassExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int updateByPrimaryKeySelective(Class record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table class
     *
     * @mbg.generated Wed May 08 20:46:56 CST 2019
     */
    int updateByPrimaryKey(Class record);
}