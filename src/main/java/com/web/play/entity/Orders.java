package com.web.play.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Orders)实体类
 *
 * @author makejava
 * @since 2020-07-10 15:52:39
 */
public class Orders implements Serializable {
    private static final long serialVersionUID = -20336680868732974L;
    /**
    * 订单id
    */
    private String orderId;
    /**
    * 用户id
    */
    private Integer userId;
    /**
    * 实付金额。精确到2位小数;单位:元。如:200.07，表示:200元7分
    */
    private String payment;
    /**
    * 支付类型，1、微信，2、支付宝
    */
    private Integer paymentType;
    /**
    * 状态：0、未付款，1、已付款，2、未发货，3、已发货，4、交易成功，5、交易关闭
    */
    private Integer status;
    /**
    * 邮费。精确到2位小数;单位:元。如:200.07，表示:200元7分
    */
    private String postFee;
    /**
    * 订单创建时间
    */
    private Date createTime;
    /**
    * 订单更新时间
    */
    private Date updateTime;
    
    private Integer orderMount;
    /**
    * 付款时间
    */
    private Date paymentTime;
    /**
    * 交易完成时间
    */
    private Date endTime;
    /**
    * 交易关闭时间
    */
    private Date closeTime;
    /**
    * 物流名称
    */
    private String shippingName;
    /**
    * 物流单号
    */
    private String shippingCode;
    /**
    * 买家留言
    */
    private String buyerMessage;
    /**
    * 买家是否已经评价
    */
    private Integer buyerRate;


    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPostFee() {
        return postFee;
    }

    public void setPostFee(String postFee) {
        this.postFee = postFee;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getOrderMount() {
        return orderMount;
    }

    public void setOrderMount(Integer orderMount) {
        this.orderMount = orderMount;
    }

    public Date getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getShippingName() {
        return shippingName;
    }

    public void setShippingName(String shippingName) {
        this.shippingName = shippingName;
    }

    public String getShippingCode() {
        return shippingCode;
    }

    public void setShippingCode(String shippingCode) {
        this.shippingCode = shippingCode;
    }

    public String getBuyerMessage() {
        return buyerMessage;
    }

    public void setBuyerMessage(String buyerMessage) {
        this.buyerMessage = buyerMessage;
    }

    public Integer getBuyerRate() {
        return buyerRate;
    }

    public void setBuyerRate(Integer buyerRate) {
        this.buyerRate = buyerRate;
    }

}