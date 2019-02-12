package com.puyitou.fundmanager.hedge.model.product;

import java.util.ArrayList;
import java.util.List;

public class ProductExtendExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExtendExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(String value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(String value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(String value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(String value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(String value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(String value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLike(String value) {
            addCriterion("product_id like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotLike(String value) {
            addCriterion("product_id not like", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<String> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<String> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(String value1, String value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(String value1, String value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andRecordNumberIsNull() {
            addCriterion("record_number is null");
            return (Criteria) this;
        }

        public Criteria andRecordNumberIsNotNull() {
            addCriterion("record_number is not null");
            return (Criteria) this;
        }

        public Criteria andRecordNumberEqualTo(String value) {
            addCriterion("record_number =", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberNotEqualTo(String value) {
            addCriterion("record_number <>", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberGreaterThan(String value) {
            addCriterion("record_number >", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberGreaterThanOrEqualTo(String value) {
            addCriterion("record_number >=", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberLessThan(String value) {
            addCriterion("record_number <", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberLessThanOrEqualTo(String value) {
            addCriterion("record_number <=", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberLike(String value) {
            addCriterion("record_number like", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberNotLike(String value) {
            addCriterion("record_number not like", value, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberIn(List<String> values) {
            addCriterion("record_number in", values, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberNotIn(List<String> values) {
            addCriterion("record_number not in", values, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberBetween(String value1, String value2) {
            addCriterion("record_number between", value1, value2, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRecordNumberNotBetween(String value1, String value2) {
            addCriterion("record_number not between", value1, value2, "recordNumber");
            return (Criteria) this;
        }

        public Criteria andRankingIsNull() {
            addCriterion("ranking is null");
            return (Criteria) this;
        }

        public Criteria andRankingIsNotNull() {
            addCriterion("ranking is not null");
            return (Criteria) this;
        }

        public Criteria andRankingEqualTo(Integer value) {
            addCriterion("ranking =", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotEqualTo(Integer value) {
            addCriterion("ranking <>", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThan(Integer value) {
            addCriterion("ranking >", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking >=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThan(Integer value) {
            addCriterion("ranking <", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingLessThanOrEqualTo(Integer value) {
            addCriterion("ranking <=", value, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingIn(List<Integer> values) {
            addCriterion("ranking in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotIn(List<Integer> values) {
            addCriterion("ranking not in", values, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingBetween(Integer value1, Integer value2) {
            addCriterion("ranking between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking not between", value1, value2, "ranking");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityIsNull() {
            addCriterion("ranking_priority is null");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityIsNotNull() {
            addCriterion("ranking_priority is not null");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityEqualTo(Integer value) {
            addCriterion("ranking_priority =", value, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityNotEqualTo(Integer value) {
            addCriterion("ranking_priority <>", value, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityGreaterThan(Integer value) {
            addCriterion("ranking_priority >", value, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking_priority >=", value, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityLessThan(Integer value) {
            addCriterion("ranking_priority <", value, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityLessThanOrEqualTo(Integer value) {
            addCriterion("ranking_priority <=", value, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityIn(List<Integer> values) {
            addCriterion("ranking_priority in", values, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityNotIn(List<Integer> values) {
            addCriterion("ranking_priority not in", values, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityBetween(Integer value1, Integer value2) {
            addCriterion("ranking_priority between", value1, value2, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPriorityNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking_priority not between", value1, value2, "rankingPriority");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorIsNull() {
            addCriterion("ranking_posterior is null");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorIsNotNull() {
            addCriterion("ranking_posterior is not null");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorEqualTo(Integer value) {
            addCriterion("ranking_posterior =", value, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorNotEqualTo(Integer value) {
            addCriterion("ranking_posterior <>", value, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorGreaterThan(Integer value) {
            addCriterion("ranking_posterior >", value, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorGreaterThanOrEqualTo(Integer value) {
            addCriterion("ranking_posterior >=", value, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorLessThan(Integer value) {
            addCriterion("ranking_posterior <", value, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorLessThanOrEqualTo(Integer value) {
            addCriterion("ranking_posterior <=", value, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorIn(List<Integer> values) {
            addCriterion("ranking_posterior in", values, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorNotIn(List<Integer> values) {
            addCriterion("ranking_posterior not in", values, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorBetween(Integer value1, Integer value2) {
            addCriterion("ranking_posterior between", value1, value2, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andRankingPosteriorNotBetween(Integer value1, Integer value2) {
            addCriterion("ranking_posterior not between", value1, value2, "rankingPosterior");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionIsNull() {
            addCriterion("profit_distribution is null");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionIsNotNull() {
            addCriterion("profit_distribution is not null");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionEqualTo(Integer value) {
            addCriterion("profit_distribution =", value, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionNotEqualTo(Integer value) {
            addCriterion("profit_distribution <>", value, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionGreaterThan(Integer value) {
            addCriterion("profit_distribution >", value, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionGreaterThanOrEqualTo(Integer value) {
            addCriterion("profit_distribution >=", value, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionLessThan(Integer value) {
            addCriterion("profit_distribution <", value, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionLessThanOrEqualTo(Integer value) {
            addCriterion("profit_distribution <=", value, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionIn(List<Integer> values) {
            addCriterion("profit_distribution in", values, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionNotIn(List<Integer> values) {
            addCriterion("profit_distribution not in", values, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionBetween(Integer value1, Integer value2) {
            addCriterion("profit_distribution between", value1, value2, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andProfitDistributionNotBetween(Integer value1, Integer value2) {
            addCriterion("profit_distribution not between", value1, value2, "profitDistribution");
            return (Criteria) this;
        }

        public Criteria andCustodianIsNull() {
            addCriterion("custodian is null");
            return (Criteria) this;
        }

        public Criteria andCustodianIsNotNull() {
            addCriterion("custodian is not null");
            return (Criteria) this;
        }

        public Criteria andCustodianEqualTo(String value) {
            addCriterion("custodian =", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotEqualTo(String value) {
            addCriterion("custodian <>", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianGreaterThan(String value) {
            addCriterion("custodian >", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianGreaterThanOrEqualTo(String value) {
            addCriterion("custodian >=", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianLessThan(String value) {
            addCriterion("custodian <", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianLessThanOrEqualTo(String value) {
            addCriterion("custodian <=", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianLike(String value) {
            addCriterion("custodian like", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotLike(String value) {
            addCriterion("custodian not like", value, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianIn(List<String> values) {
            addCriterion("custodian in", values, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotIn(List<String> values) {
            addCriterion("custodian not in", values, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianBetween(String value1, String value2) {
            addCriterion("custodian between", value1, value2, "custodian");
            return (Criteria) this;
        }

        public Criteria andCustodianNotBetween(String value1, String value2) {
            addCriterion("custodian not between", value1, value2, "custodian");
            return (Criteria) this;
        }

        public Criteria andOutsourcingIsNull() {
            addCriterion("outsourcing is null");
            return (Criteria) this;
        }

        public Criteria andOutsourcingIsNotNull() {
            addCriterion("outsourcing is not null");
            return (Criteria) this;
        }

        public Criteria andOutsourcingEqualTo(String value) {
            addCriterion("outsourcing =", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNotEqualTo(String value) {
            addCriterion("outsourcing <>", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingGreaterThan(String value) {
            addCriterion("outsourcing >", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingGreaterThanOrEqualTo(String value) {
            addCriterion("outsourcing >=", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingLessThan(String value) {
            addCriterion("outsourcing <", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingLessThanOrEqualTo(String value) {
            addCriterion("outsourcing <=", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingLike(String value) {
            addCriterion("outsourcing like", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNotLike(String value) {
            addCriterion("outsourcing not like", value, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingIn(List<String> values) {
            addCriterion("outsourcing in", values, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNotIn(List<String> values) {
            addCriterion("outsourcing not in", values, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingBetween(String value1, String value2) {
            addCriterion("outsourcing between", value1, value2, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andOutsourcingNotBetween(String value1, String value2) {
            addCriterion("outsourcing not between", value1, value2, "outsourcing");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankUserIsNull() {
            addCriterion("bank_user is null");
            return (Criteria) this;
        }

        public Criteria andBankUserIsNotNull() {
            addCriterion("bank_user is not null");
            return (Criteria) this;
        }

        public Criteria andBankUserEqualTo(String value) {
            addCriterion("bank_user =", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotEqualTo(String value) {
            addCriterion("bank_user <>", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserGreaterThan(String value) {
            addCriterion("bank_user >", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserGreaterThanOrEqualTo(String value) {
            addCriterion("bank_user >=", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserLessThan(String value) {
            addCriterion("bank_user <", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserLessThanOrEqualTo(String value) {
            addCriterion("bank_user <=", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserLike(String value) {
            addCriterion("bank_user like", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotLike(String value) {
            addCriterion("bank_user not like", value, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserIn(List<String> values) {
            addCriterion("bank_user in", values, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotIn(List<String> values) {
            addCriterion("bank_user not in", values, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserBetween(String value1, String value2) {
            addCriterion("bank_user between", value1, value2, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankUserNotBetween(String value1, String value2) {
            addCriterion("bank_user not between", value1, value2, "bankUser");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNull() {
            addCriterion("bank_account is null");
            return (Criteria) this;
        }

        public Criteria andBankAccountIsNotNull() {
            addCriterion("bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andBankAccountEqualTo(String value) {
            addCriterion("bank_account =", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotEqualTo(String value) {
            addCriterion("bank_account <>", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThan(String value) {
            addCriterion("bank_account >", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("bank_account >=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThan(String value) {
            addCriterion("bank_account <", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLessThanOrEqualTo(String value) {
            addCriterion("bank_account <=", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountLike(String value) {
            addCriterion("bank_account like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotLike(String value) {
            addCriterion("bank_account not like", value, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountIn(List<String> values) {
            addCriterion("bank_account in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotIn(List<String> values) {
            addCriterion("bank_account not in", values, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountBetween(String value1, String value2) {
            addCriterion("bank_account between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andBankAccountNotBetween(String value1, String value2) {
            addCriterion("bank_account not between", value1, value2, "bankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountIsNull() {
            addCriterion("large_bank_account is null");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountIsNotNull() {
            addCriterion("large_bank_account is not null");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountEqualTo(String value) {
            addCriterion("large_bank_account =", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountNotEqualTo(String value) {
            addCriterion("large_bank_account <>", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountGreaterThan(String value) {
            addCriterion("large_bank_account >", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountGreaterThanOrEqualTo(String value) {
            addCriterion("large_bank_account >=", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountLessThan(String value) {
            addCriterion("large_bank_account <", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountLessThanOrEqualTo(String value) {
            addCriterion("large_bank_account <=", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountLike(String value) {
            addCriterion("large_bank_account like", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountNotLike(String value) {
            addCriterion("large_bank_account not like", value, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountIn(List<String> values) {
            addCriterion("large_bank_account in", values, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountNotIn(List<String> values) {
            addCriterion("large_bank_account not in", values, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountBetween(String value1, String value2) {
            addCriterion("large_bank_account between", value1, value2, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andLargeBankAccountNotBetween(String value1, String value2) {
            addCriterion("large_bank_account not between", value1, value2, "largeBankAccount");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerIsNull() {
            addCriterion("risk_level_manager is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerIsNotNull() {
            addCriterion("risk_level_manager is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerEqualTo(Integer value) {
            addCriterion("risk_level_manager =", value, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerNotEqualTo(Integer value) {
            addCriterion("risk_level_manager <>", value, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerGreaterThan(Integer value) {
            addCriterion("risk_level_manager >", value, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_level_manager >=", value, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerLessThan(Integer value) {
            addCriterion("risk_level_manager <", value, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerLessThanOrEqualTo(Integer value) {
            addCriterion("risk_level_manager <=", value, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerIn(List<Integer> values) {
            addCriterion("risk_level_manager in", values, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerNotIn(List<Integer> values) {
            addCriterion("risk_level_manager not in", values, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerBetween(Integer value1, Integer value2) {
            addCriterion("risk_level_manager between", value1, value2, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelManagerNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_level_manager not between", value1, value2, "riskLevelManager");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellIsNull() {
            addCriterion("risk_level_sell is null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellIsNotNull() {
            addCriterion("risk_level_sell is not null");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellEqualTo(Integer value) {
            addCriterion("risk_level_sell =", value, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellNotEqualTo(Integer value) {
            addCriterion("risk_level_sell <>", value, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellGreaterThan(Integer value) {
            addCriterion("risk_level_sell >", value, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellGreaterThanOrEqualTo(Integer value) {
            addCriterion("risk_level_sell >=", value, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellLessThan(Integer value) {
            addCriterion("risk_level_sell <", value, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellLessThanOrEqualTo(Integer value) {
            addCriterion("risk_level_sell <=", value, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellIn(List<Integer> values) {
            addCriterion("risk_level_sell in", values, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellNotIn(List<Integer> values) {
            addCriterion("risk_level_sell not in", values, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellBetween(Integer value1, Integer value2) {
            addCriterion("risk_level_sell between", value1, value2, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andRiskLevelSellNotBetween(Integer value1, Integer value2) {
            addCriterion("risk_level_sell not between", value1, value2, "riskLevelSell");
            return (Criteria) this;
        }

        public Criteria andPayCommentIsNull() {
            addCriterion("pay_comment is null");
            return (Criteria) this;
        }

        public Criteria andPayCommentIsNotNull() {
            addCriterion("pay_comment is not null");
            return (Criteria) this;
        }

        public Criteria andPayCommentEqualTo(String value) {
            addCriterion("pay_comment =", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotEqualTo(String value) {
            addCriterion("pay_comment <>", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentGreaterThan(String value) {
            addCriterion("pay_comment >", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentGreaterThanOrEqualTo(String value) {
            addCriterion("pay_comment >=", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentLessThan(String value) {
            addCriterion("pay_comment <", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentLessThanOrEqualTo(String value) {
            addCriterion("pay_comment <=", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentLike(String value) {
            addCriterion("pay_comment like", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotLike(String value) {
            addCriterion("pay_comment not like", value, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentIn(List<String> values) {
            addCriterion("pay_comment in", values, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotIn(List<String> values) {
            addCriterion("pay_comment not in", values, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentBetween(String value1, String value2) {
            addCriterion("pay_comment between", value1, value2, "payComment");
            return (Criteria) this;
        }

        public Criteria andPayCommentNotBetween(String value1, String value2) {
            addCriterion("pay_comment not between", value1, value2, "payComment");
            return (Criteria) this;
        }

        public Criteria andCommentIsNull() {
            addCriterion("comment is null");
            return (Criteria) this;
        }

        public Criteria andCommentIsNotNull() {
            addCriterion("comment is not null");
            return (Criteria) this;
        }

        public Criteria andCommentEqualTo(String value) {
            addCriterion("comment =", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotEqualTo(String value) {
            addCriterion("comment <>", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThan(String value) {
            addCriterion("comment >", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentGreaterThanOrEqualTo(String value) {
            addCriterion("comment >=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThan(String value) {
            addCriterion("comment <", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLessThanOrEqualTo(String value) {
            addCriterion("comment <=", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentLike(String value) {
            addCriterion("comment like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotLike(String value) {
            addCriterion("comment not like", value, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentIn(List<String> values) {
            addCriterion("comment in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotIn(List<String> values) {
            addCriterion("comment not in", values, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentBetween(String value1, String value2) {
            addCriterion("comment between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andCommentNotBetween(String value1, String value2) {
            addCriterion("comment not between", value1, value2, "comment");
            return (Criteria) this;
        }

        public Criteria andSellModeIsNull() {
            addCriterion("sell_mode is null");
            return (Criteria) this;
        }

        public Criteria andSellModeIsNotNull() {
            addCriterion("sell_mode is not null");
            return (Criteria) this;
        }

        public Criteria andSellModeEqualTo(String value) {
            addCriterion("sell_mode =", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeNotEqualTo(String value) {
            addCriterion("sell_mode <>", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeGreaterThan(String value) {
            addCriterion("sell_mode >", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeGreaterThanOrEqualTo(String value) {
            addCriterion("sell_mode >=", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeLessThan(String value) {
            addCriterion("sell_mode <", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeLessThanOrEqualTo(String value) {
            addCriterion("sell_mode <=", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeLike(String value) {
            addCriterion("sell_mode like", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeNotLike(String value) {
            addCriterion("sell_mode not like", value, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeIn(List<String> values) {
            addCriterion("sell_mode in", values, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeNotIn(List<String> values) {
            addCriterion("sell_mode not in", values, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeBetween(String value1, String value2) {
            addCriterion("sell_mode between", value1, value2, "sellMode");
            return (Criteria) this;
        }

        public Criteria andSellModeNotBetween(String value1, String value2) {
            addCriterion("sell_mode not between", value1, value2, "sellMode");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Long value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Long value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Long value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Long value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Long value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Long> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Long> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Long value1, Long value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Long value1, Long value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Long value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Long value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Long value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Long value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Long value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Long> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Long> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Long value1, Long value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Long value1, Long value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Long value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Long value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Long value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Long value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Long value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Long> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Long> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Long value1, Long value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Long value1, Long value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}