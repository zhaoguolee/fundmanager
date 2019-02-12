package com.puyitou.fundmanager.hedge.model.payment;

import java.math.BigDecimal;

public class Refund {
    private String id;

    private String paymentId;

    private String fileStorageId;

    private String idCard;

    private BigDecimal refundAmount;

    private String bankName;

    private String agencyId;

    private String subAgencyId;

    private String comment;

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

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId == null ? null : paymentId.trim();
    }

    public String getFileStorageId() {
        return fileStorageId;
    }

    public void setFileStorageId(String fileStorageId) {
        this.fileStorageId = fileStorageId == null ? null : fileStorageId.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getAgencyId() {
        return agencyId;
    }

    public void setAgencyId(String agencyId) {
        this.agencyId = agencyId == null ? null : agencyId.trim();
    }

    public String getSubAgencyId() {
        return subAgencyId;
    }

    public void setSubAgencyId(String subAgencyId) {
        this.subAgencyId = subAgencyId == null ? null : subAgencyId.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
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