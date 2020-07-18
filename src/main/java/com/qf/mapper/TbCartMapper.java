package com.qf.mapper;

import com.qf.pojo.TbCart;
import com.qf.pojo.TbCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCartMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    long countByExample(TbCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByExample(TbCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByPrimaryKey(Integer cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insert(TbCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insertSelective(TbCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    List<TbCart> selectByExample(TbCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    TbCart selectByPrimaryKey(Integer cartid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbCart record, @Param("example") TbCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExample(@Param("record") TbCart record, @Param("example") TbCartExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKeySelective(TbCart record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_cart
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKey(TbCart record);
}