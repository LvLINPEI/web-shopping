package com.qf.pojo;

public class TbAddress {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.addressid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer addressid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.city
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String city;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.address
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String address;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.consignee
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String consignee;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_address.tel
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String tel;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.addressid
     *
     * @return the value of tb_address.addressid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getAddressid() {
        return addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.addressid
     *
     * @param addressid the value for tb_address.addressid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setAddressid(Integer addressid) {
        this.addressid = addressid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.user_id
     *
     * @return the value of tb_address.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.user_id
     *
     * @param userId the value for tb_address.user_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.city
     *
     * @return the value of tb_address.city
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.city
     *
     * @param city the value for tb_address.city
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.address
     *
     * @return the value of tb_address.address
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.address
     *
     * @param address the value for tb_address.address
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.consignee
     *
     * @return the value of tb_address.consignee
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getConsignee() {
        return consignee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.consignee
     *
     * @param consignee the value for tb_address.consignee
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setConsignee(String consignee) {
        this.consignee = consignee == null ? null : consignee.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_address.tel
     *
     * @return the value of tb_address.tel
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_address.tel
     *
     * @param tel the value for tb_address.tel
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }
}