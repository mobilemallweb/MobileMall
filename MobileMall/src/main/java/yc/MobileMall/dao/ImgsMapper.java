package yc.MobileMall.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yc.MobileMall.bean.Imgs;
import yc.MobileMall.bean.ImgsExample;

public interface ImgsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    long countByExample(ImgsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int deleteByExample(ImgsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int insert(Imgs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int insertSelective(Imgs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    List<Imgs> selectByExample(ImgsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    Imgs selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int updateByExampleSelective(@Param("record") Imgs record, @Param("example") ImgsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int updateByExample(@Param("record") Imgs record, @Param("example") ImgsExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int updateByPrimaryKeySelective(Imgs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table imgs
     *
     * @mbg.generated Sun May 05 20:09:59 CST 2019
     */
    int updateByPrimaryKey(Imgs record);
}