package com.puyitou.fundmanager.hedge.model.product;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    private String id;

    private String name;

    private Integer specialSupply;

    private Integer productType;

    private Integer operationWay;

    private Integer periodLockUpType;

    private Integer periodLockUpTime;

    private Integer periodFloatType;

    private Integer periodFloatTime;

    private Long totalAmount;

    private Integer totalHeadCount;

    private Integer canRedeem;

    private Integer minInvestAmount;

    private Integer increaseAmount;

    private Date establishDate;

    private Integer openType;

    private Integer openMonth;

    private Integer openDate;

    private Integer openCanPurchase;

    private Integer openCanRedeem;

    private Integer openRaisePeriod;

    private Date raiseFinishDate;

    private Date maturityDate;

    private Date payDate;

    private Integer accumulatedAmount;

    private Integer accumulatedHeadCount;

    private Integer stockAmount;

    private Integer stockHeadCount;

    private Integer homepageShow;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSpecialSupply() {
        return specialSupply;
    }

    public void setSpecialSupply(Integer specialSupply) {
        this.specialSupply = specialSupply;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getOperationWay() {
        return operationWay;
    }

    public void setOperationWay(Integer operationWay) {
        this.operationWay = operationWay;
    }

    public Integer getPeriodLockUpType() {
        return periodLockUpType;
    }

    public void setPeriodLockUpType(Integer periodLockUpType) {
        this.periodLockUpType = periodLockUpType;
    }

    public Integer getPeriodLockUpTime() {
        return periodLockUpTime;
    }

    public void setPeriodLockUpTime(Integer periodLockUpTime) {
        this.periodLockUpTime = periodLockUpTime;
    }

    public Integer getPeriodFloatType() {
        return periodFloatType;
    }

    public void setPeriodFloatType(Integer periodFloatType) {
        this.periodFloatType = periodFloatType;
    }

    public Integer getPeriodFloatTime() {
        return periodFloatTime;
    }

    public void setPeriodFloatTime(Integer periodFloatTime) {
        this.periodFloatTime = periodFloatTime;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getTotalHeadCount() {
        return totalHeadCount;
    }

    public void setTotalHeadCount(Integer totalHeadCount) {
        this.totalHeadCount = totalHeadCount;
    }

    public Integer getCanRedeem() {
        return canRedeem;
    }

    public void setCanRedeem(Integer canRedeem) {
        this.canRedeem = canRedeem;
    }

    public Integer getMinInvestAmount() {
        return minInvestAmount;
    }

    public void setMinInvestAmount(Integer minInvestAmount) {
        this.minInvestAmount = minInvestAmount;
    }

    public Integer getIncreaseAmount() {
        return increaseAmount;
    }

    public void setIncreaseAmount(Integer increaseAmount) {
        this.increaseAmount = increaseAmount;
    }

    public Date getEstablishDate() {
        return establishDate;
    }

    public void setEstablishDate(Date establishDate) {
        this.establishDate = establishDate;
    }

    public Integer getOpenType() {
        return openType;
    }

    public void setOpenType(Integer openType) {
        this.openType = openType;
    }

    public Integer getOpenMonth() {
        return openMonth;
    }

    public void setOpenMonth(Integer openMonth) {
        this.openMonth = openMonth;
    }

    public Integer getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Integer openDate) {
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

    public Integer getOpenRaisePeriod() {
        return openRaisePeriod;
    }

    public void setOpenRaisePeriod(Integer openRaisePeriod) {
        this.openRaisePeriod = openRaisePeriod;
    }

    public Date getRaiseFinishDate() {
        return raiseFinishDate;
    }

    public void setRaiseFinishDate(Date raiseFinishDate) {
        this.raiseFinishDate = raiseFinishDate;
    }

    public Date getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(Date maturityDate) {
        this.maturityDate = maturityDate;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
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

    public Integer getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(Integer stockAmount) {
        this.stockAmount = stockAmount;
    }

    public Integer getStockHeadCount() {
        return stockHeadCount;
    }

    public void setStockHeadCount(Integer stockHeadCount) {
        this.stockHeadCount = stockHeadCount;
    }

    public Integer getHomepageShow() {
        return homepageShow;
    }

    public void setHomepageShow(Integer homepageShow) {
        this.homepageShow = homepageShow;
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