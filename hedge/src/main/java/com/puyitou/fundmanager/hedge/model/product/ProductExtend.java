package com.puyitou.fundmanager.hedge.model.product;

public class ProductExtend {
    private Long id;

    private String productId;

    private String recordNumber;

    private Integer ranking;

    private Integer rankingPriority;

    private Integer rankingPosterior;

    private Integer profitDistribution;

    private String custodian;

    private String outsourcing;

    private String bankName;

    private String bankUser;

    private String bankAccount;

    private String largeBankAccount;

    private Integer riskLevelManager;

    private Integer riskLevelSell;

    private String payComment;

    private String comment;

    private String sellMode;

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

    public String getRecordNumber() {
        return recordNumber;
    }

    public void setRecordNumber(String recordNumber) {
        this.recordNumber = recordNumber == null ? null : recordNumber.trim();
    }

    public Integer getRanking() {
        return ranking;
    }

    public void setRanking(Integer ranking) {
        this.ranking = ranking;
    }

    public Integer getRankingPriority() {
        return rankingPriority;
    }

    public void setRankingPriority(Integer rankingPriority) {
        this.rankingPriority = rankingPriority;
    }

    public Integer getRankingPosterior() {
        return rankingPosterior;
    }

    public void setRankingPosterior(Integer rankingPosterior) {
        this.rankingPosterior = rankingPosterior;
    }

    public Integer getProfitDistribution() {
        return profitDistribution;
    }

    public void setProfitDistribution(Integer profitDistribution) {
        this.profitDistribution = profitDistribution;
    }

    public String getCustodian() {
        return custodian;
    }

    public void setCustodian(String custodian) {
        this.custodian = custodian == null ? null : custodian.trim();
    }

    public String getOutsourcing() {
        return outsourcing;
    }

    public void setOutsourcing(String outsourcing) {
        this.outsourcing = outsourcing == null ? null : outsourcing.trim();
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName == null ? null : bankName.trim();
    }

    public String getBankUser() {
        return bankUser;
    }

    public void setBankUser(String bankUser) {
        this.bankUser = bankUser == null ? null : bankUser.trim();
    }

    public String getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(String bankAccount) {
        this.bankAccount = bankAccount == null ? null : bankAccount.trim();
    }

    public String getLargeBankAccount() {
        return largeBankAccount;
    }

    public void setLargeBankAccount(String largeBankAccount) {
        this.largeBankAccount = largeBankAccount == null ? null : largeBankAccount.trim();
    }

    public Integer getRiskLevelManager() {
        return riskLevelManager;
    }

    public void setRiskLevelManager(Integer riskLevelManager) {
        this.riskLevelManager = riskLevelManager;
    }

    public Integer getRiskLevelSell() {
        return riskLevelSell;
    }

    public void setRiskLevelSell(Integer riskLevelSell) {
        this.riskLevelSell = riskLevelSell;
    }

    public String getPayComment() {
        return payComment;
    }

    public void setPayComment(String payComment) {
        this.payComment = payComment == null ? null : payComment.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getSellMode() {
        return sellMode;
    }

    public void setSellMode(String sellMode) {
        this.sellMode = sellMode == null ? null : sellMode.trim();
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