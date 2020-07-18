package com.qf.pojo;

import java.util.Date;

public class TbGoods {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.goodsid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer goodsid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.goods_name
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String goodsName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.real_price
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Double realPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.discount
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Double discount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.ttm
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Date ttm;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.weight
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String weight;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.specification
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String specification;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.packages
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String packages;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.brand
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String brand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.expiration_date
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Date expirationDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.size
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private String size;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.stock
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer stock;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.goods_status
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer goodsStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.sales
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer sales;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column tb_goods.catalog_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    private Integer catalogId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.goodsid
     *
     * @return the value of tb_goods.goodsid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getGoodsid() {
        return goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.goodsid
     *
     * @param goodsid the value for tb_goods.goodsid
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setGoodsid(Integer goodsid) {
        this.goodsid = goodsid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.goods_name
     *
     * @return the value of tb_goods.goods_name
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getGoodsName() {
        return goodsName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.goods_name
     *
     * @param goodsName the value for tb_goods.goods_name
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.real_price
     *
     * @return the value of tb_goods.real_price
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Double getRealPrice() {
        return realPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.real_price
     *
     * @param realPrice the value for tb_goods.real_price
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setRealPrice(Double realPrice) {
        this.realPrice = realPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.discount
     *
     * @return the value of tb_goods.discount
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Double getDiscount() {
        return discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.discount
     *
     * @param discount the value for tb_goods.discount
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.ttm
     *
     * @return the value of tb_goods.ttm
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Date getTtm() {
        return ttm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.ttm
     *
     * @param ttm the value for tb_goods.ttm
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setTtm(Date ttm) {
        this.ttm = ttm;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.weight
     *
     * @return the value of tb_goods.weight
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getWeight() {
        return weight;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.weight
     *
     * @param weight the value for tb_goods.weight
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.specification
     *
     * @return the value of tb_goods.specification
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getSpecification() {
        return specification;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.specification
     *
     * @param specification the value for tb_goods.specification
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.packages
     *
     * @return the value of tb_goods.packages
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getPackages() {
        return packages;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.packages
     *
     * @param packages the value for tb_goods.packages
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setPackages(String packages) {
        this.packages = packages == null ? null : packages.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.brand
     *
     * @return the value of tb_goods.brand
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getBrand() {
        return brand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.brand
     *
     * @param brand the value for tb_goods.brand
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.expiration_date
     *
     * @return the value of tb_goods.expiration_date
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Date getExpirationDate() {
        return expirationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.expiration_date
     *
     * @param expirationDate the value for tb_goods.expiration_date
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.size
     *
     * @return the value of tb_goods.size
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public String getSize() {
        return size;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.size
     *
     * @param size the value for tb_goods.size
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.stock
     *
     * @return the value of tb_goods.stock
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getStock() {
        return stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.stock
     *
     * @param stock the value for tb_goods.stock
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setStock(Integer stock) {
        this.stock = stock;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.goods_status
     *
     * @return the value of tb_goods.goods_status
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getGoodsStatus() {
        return goodsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.goods_status
     *
     * @param goodsStatus the value for tb_goods.goods_status
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setGoodsStatus(Integer goodsStatus) {
        this.goodsStatus = goodsStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.sales
     *
     * @return the value of tb_goods.sales
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.sales
     *
     * @param sales the value for tb_goods.sales
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column tb_goods.catalog_id
     *
     * @return the value of tb_goods.catalog_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public Integer getCatalogId() {
        return catalogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column tb_goods.catalog_id
     *
     * @param catalogId the value for tb_goods.catalog_id
     *
     * @mbg.generated Tue Jul 14 22:53:58 CST 2020
     */
    public void setCatalogId(Integer catalogId) {
        this.catalogId = catalogId;
    }
}