package yc.MobileMall.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import yc.MobileMall.bean.Transaction;
import yc.MobileMall.bean.TransactionExample;

public interface TransactionMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    long countByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int deleteByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int insert(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int insertSelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    List<Transaction> selectByExample(TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    Transaction selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int updateByExampleSelective(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int updateByExample(@Param("record") Transaction record, @Param("example") TransactionExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int updateByPrimaryKeySelective(Transaction record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table transaction
     *
     * @mbg.generated Sun May 19 10:39:54 CST 2019
     */
    int updateByPrimaryKey(Transaction record);
}