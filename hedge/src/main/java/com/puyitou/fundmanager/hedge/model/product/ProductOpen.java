package com.puyitou.fundmanager.hedge.model.product;

import java.util.Date;

public class ProductOpen {
    private String id;

    private String productId;

    private Integer productOpenType;

    private Date raiseStartDate;

    private Date raiseEndDate;

    private Date openDate;

    private Integer openCanPurchase;

    private Integer openCanRedeem;

    private Date expectedMaturityDate;

    private Date maturityDate;

    private Integer accumulatedAmount;

    private Integer accumulatedHeadCount;

    private Integer state;

    private Long createTime;

    private Long updateTime;

    private Long deleteTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public Integer getProductOpenType() {
        return productOpenType;
    }

    public void setProductOpenType(Integer productOpenType) {
        this.productOpenType = productOpenType;
    }

    public Date getRaiseStartDate() {
        return raiseStartDate;
    }

    public void setRaiseStartDate(Date raiseStartDate) {
        this.raiseStartDate = raiseStartDate;
    }

    public Date getRaiseEndDate() {
        return raiseEndDate;
    }

    public void setRaiseEndDate(Date raiseEndDate) {
        this.raiseEndDate = raiseEndDate;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Integer getOpenCanPurchase() {
        return openCanPurchase;
    }

    public void setOpenCanPurchase(Integer openCanPurchase) {
        this.openCanPurchase = openCanPurchase;
    }

    public Integer getOpenCanRedeem() {
        return openCanRedeem;
    }

    public void setOpenCanRedeem(Integer openCanRedeem) {
        this.openCanRedeem = openCanRedeem;
    }

    public Date getExpectedMaturityDate() {
        return expectedMaturityDate;
    }

    public void setExpectedMaturityDate(Date expectedMaturityDate) {
        this.expectedMaturityDate = expectedMaturityDate;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Integer getAccumulatedAmount() {
        return accumulatedAmount;
    }

    public void setAccumulatedAmount(Integer accumulatedAmount) {
        this.accumulatedAmount = accumulatedAmount;
    }

    public Integer getAccumulatedHeadCount() {
        return accumulatedHeadCount;
    }

    public void setAccumulatedHeadCount(Integer accumulatedHeadCount) {
        this.accumulatedHeadCount = accumulatedHeadCount;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public Long getDeleteTime() {
        return deleteTime;
    }

    public void setDeleteTime(Long deleteTime) {
        this.deleteTime = deleteTime;
    }
}