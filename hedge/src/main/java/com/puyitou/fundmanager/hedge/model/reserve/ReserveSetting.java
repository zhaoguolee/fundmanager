package com.puyitou.fundmanager.hedge.model.reserve;

import java.math.BigDecimal;
import java.util.Date;

public class ReserveSetting {
    private Long id;

    private String productId;

    private String productOpenId;

    private Integer onsale;

    private BigDecimal reserveAmount;

    private Integer reserveHeadCount;

    private Date startTime;

    private Date endTime;

    private Long startDate;

    private Integer reserveState;

    private Long createTime;

    private Long updateTime;

    private Long deleteTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    public String getProductOpenId() {
        return productOpenId;
    }

    public void setProductOpenId(String productOpenId) {
        this.productOpenId = productOpenId == null ? null : productOpenId.trim();
    }

    public Integer getOnsale() {
        return onsale;
    }

    public void setOnsale(Integer onsale) {
        this.onsale = onsale;
    }

    public BigDecimal getReserveAmount() {
        return reserveAmount;
    }

    public void setReserveAmount(BigDecimal reserveAmount) {
        this.reserveAmount = reserveAmount;
    }

    public Integer getReserveHeadCount() {
        return reserveHeadCount;
    }

    public void setReserveHeadCount(Integer reserveHeadCount) {
        this.reserveHeadCount = reserveHeadCount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Long getStartDate() {
        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }

    public Integer getReserveState() {
        return reserveState;
    }

    public void setReserveState(Integer reserveState) {
        this.reserveState = reserveState;
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