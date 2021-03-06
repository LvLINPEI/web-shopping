package com.qf.mapper;

import com.qf.pojo.TbImg;
import com.qf.pojo.TbImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TbImgMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    long countByExample(TbImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByExample(TbImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int deleteByPrimaryKey(Integer imgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insert(TbImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int insertSelective(TbImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    List<TbImg> selectByExample(TbImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    TbImg selectByPrimaryKey(Integer imgid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExampleSelective(@Param("record") TbImg record, @Param("example") TbImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByExample(@Param("record") TbImg record, @Param("example") TbImgExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKeySelective(TbImg record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_img
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    int updateByPrimaryKey(TbImg record);
}