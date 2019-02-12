package com.puyitou.fundmanager.hedge.model.product;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductOpenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductOpenExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andProductOpenTypeIsNull() {
            addCriterion("product_open_type is null");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeIsNotNull() {
            addCriterion("product_open_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeEqualTo(Integer value) {
            addCriterion("product_open_type =", value, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeNotEqualTo(Integer value) {
            addCriterion("product_open_type <>", value, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeGreaterThan(Integer value) {
            addCriterion("product_open_type >", value, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_open_type >=", value, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeLessThan(Integer value) {
            addCriterion("product_open_type <", value, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_open_type <=", value, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeIn(List<Integer> values) {
            addCriterion("product_open_type in", values, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeNotIn(List<Integer> values) {
            addCriterion("product_open_type not in", values, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_open_type between", value1, value2, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andProductOpenTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_open_type not between", value1, value2, "productOpenType");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateIsNull() {
            addCriterion("raise_start_date is null");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateIsNotNull() {
            addCriterion("raise_start_date is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateEqualTo(Date value) {
            addCriterionForJDBCDate("raise_start_date =", value, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("raise_start_date <>", value, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("raise_start_date >", value, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_start_date >=", value, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateLessThan(Date value) {
            addCriterionForJDBCDate("raise_start_date <", value, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_start_date <=", value, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateIn(List<Date> values) {
            addCriterionForJDBCDate("raise_start_date in", values, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("raise_start_date not in", values, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_start_date between", value1, value2, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseStartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_start_date not between", value1, value2, "raiseStartDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateIsNull() {
            addCriterion("raise_end_date is null");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateIsNotNull() {
            addCriterion("raise_end_date is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateEqualTo(Date value) {
            addCriterionForJDBCDate("raise_end_date =", value, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("raise_end_date <>", value, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateGreaterThan(Date value) {
            addCriterionForJDBCDate("raise_end_date >", value, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_end_date >=", value, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateLessThan(Date value) {
            addCriterionForJDBCDate("raise_end_date <", value, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_end_date <=", value, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateIn(List<Date> values) {
            addCriterionForJDBCDate("raise_end_date in", values, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("raise_end_date not in", values, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_end_date between", value1, value2, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andRaiseEndDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_end_date not between", value1, value2, "raiseEndDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(Date value) {
            addCriterionForJDBCDate("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Date value) {
            addCriterionForJDBCDate("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Date value) {
            addCriterionForJDBCDate("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Date> values) {
            addCriterionForJDBCDate("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseIsNull() {
            addCriterion("open_can_purchase is null");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseIsNotNull() {
            addCriterion("open_can_purchase is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseEqualTo(Integer value) {
            addCriterion("open_can_purchase =", value, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseNotEqualTo(Integer value) {
            addCriterion("open_can_purchase <>", value, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseGreaterThan(Integer value) {
            addCriterion("open_can_purchase >", value, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_can_purchase >=", value, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseLessThan(Integer value) {
            addCriterion("open_can_purchase <", value, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseLessThanOrEqualTo(Integer value) {
            addCriterion("open_can_purchase <=", value, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseIn(List<Integer> values) {
            addCriterion("open_can_purchase in", values, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseNotIn(List<Integer> values) {
            addCriterion("open_can_purchase not in", values, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseBetween(Integer value1, Integer value2) {
            addCriterion("open_can_purchase between", value1, value2, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanPurchaseNotBetween(Integer value1, Integer value2) {
            addCriterion("open_can_purchase not between", value1, value2, "openCanPurchase");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemIsNull() {
            addCriterion("open_can_redeem is null");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemIsNotNull() {
            addCriterion("open_can_redeem is not null");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemEqualTo(Integer value) {
            addCriterion("open_can_redeem =", value, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemNotEqualTo(Integer value) {
            addCriterion("open_can_redeem <>", value, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemGreaterThan(Integer value) {
            addCriterion("open_can_redeem >", value, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_can_redeem >=", value, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemLessThan(Integer value) {
            addCriterion("open_can_redeem <", value, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemLessThanOrEqualTo(Integer value) {
            addCriterion("open_can_redeem <=", value, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemIn(List<Integer> values) {
            addCriterion("open_can_redeem in", values, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemNotIn(List<Integer> values) {
            addCriterion("open_can_redeem not in", values, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemBetween(Integer value1, Integer value2) {
            addCriterion("open_can_redeem between", value1, value2, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andOpenCanRedeemNotBetween(Integer value1, Integer value2) {
            addCriterion("open_can_redeem not between", value1, value2, "openCanRedeem");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateIsNull() {
            addCriterion("expected_maturity_date is null");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateIsNotNull() {
            addCriterion("expected_maturity_date is not null");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateEqualTo(Date value) {
            addCriterionForJDBCDate("expected_maturity_date =", value, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("expected_maturity_date <>", value, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateGreaterThan(Date value) {
            addCriterionForJDBCDate("expected_maturity_date >", value, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_maturity_date >=", value, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateLessThan(Date value) {
            addCriterionForJDBCDate("expected_maturity_date <", value, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("expected_maturity_date <=", value, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateIn(List<Date> values) {
            addCriterionForJDBCDate("expected_maturity_date in", values, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("expected_maturity_date not in", values, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_maturity_date between", value1, value2, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andExpectedMaturityDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("expected_maturity_date not between", value1, value2, "expectedMaturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateIsNull() {
            addCriterion("maturity_date is null");
            return (Criteria) this;
        }

        public Criteria andMaturityDateIsNotNull() {
            addCriterion("maturity_date is not null");
            return (Criteria) this;
        }

        public Criteria andMaturityDateEqualTo(Date value) {
            addCriterionForJDBCDate("maturity_date =", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("maturity_date <>", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateGreaterThan(Date value) {
            addCriterionForJDBCDate("maturity_date >", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maturity_date >=", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateLessThan(Date value) {
            addCriterionForJDBCDate("maturity_date <", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("maturity_date <=", value, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateIn(List<Date> values) {
            addCriterionForJDBCDate("maturity_date in", values, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("maturity_date not in", values, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maturity_date between", value1, value2, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andMaturityDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("maturity_date not between", value1, value2, "maturityDate");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountIsNull() {
            addCriterion("accumulated_amount is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountIsNotNull() {
            addCriterion("accumulated_amount is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountEqualTo(Integer value) {
            addCriterion("accumulated_amount =", value, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountNotEqualTo(Integer value) {
            addCriterion("accumulated_amount <>", value, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountGreaterThan(Integer value) {
            addCriterion("accumulated_amount >", value, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("accumulated_amount >=", value, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountLessThan(Integer value) {
            addCriterion("accumulated_amount <", value, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountLessThanOrEqualTo(Integer value) {
            addCriterion("accumulated_amount <=", value, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountIn(List<Integer> values) {
            addCriterion("accumulated_amount in", values, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountNotIn(List<Integer> values) {
            addCriterion("accumulated_amount not in", values, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountBetween(Integer value1, Integer value2) {
            addCriterion("accumulated_amount between", value1, value2, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("accumulated_amount not between", value1, value2, "accumulatedAmount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountIsNull() {
            addCriterion("accumulated_head_count is null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountIsNotNull() {
            addCriterion("accumulated_head_count is not null");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountEqualTo(Integer value) {
            addCriterion("accumulated_head_count =", value, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountNotEqualTo(Integer value) {
            addCriterion("accumulated_head_count <>", value, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountGreaterThan(Integer value) {
            addCriterion("accumulated_head_count >", value, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("accumulated_head_count >=", value, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountLessThan(Integer value) {
            addCriterion("accumulated_head_count <", value, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountLessThanOrEqualTo(Integer value) {
            addCriterion("accumulated_head_count <=", value, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountIn(List<Integer> values) {
            addCriterion("accumulated_head_count in", values, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountNotIn(List<Integer> values) {
            addCriterion("accumulated_head_count not in", values, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountBetween(Integer value1, Integer value2) {
            addCriterion("accumulated_head_count between", value1, value2, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andAccumulatedHeadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("accumulated_head_count not between", value1, value2, "accumulatedHeadCount");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
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