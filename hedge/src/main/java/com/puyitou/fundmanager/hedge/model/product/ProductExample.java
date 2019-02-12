package com.puyitou.fundmanager.hedge.model.product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductExample() {
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

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyIsNull() {
            addCriterion("special_supply is null");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyIsNotNull() {
            addCriterion("special_supply is not null");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyEqualTo(Integer value) {
            addCriterion("special_supply =", value, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyNotEqualTo(Integer value) {
            addCriterion("special_supply <>", value, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyGreaterThan(Integer value) {
            addCriterion("special_supply >", value, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyGreaterThanOrEqualTo(Integer value) {
            addCriterion("special_supply >=", value, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyLessThan(Integer value) {
            addCriterion("special_supply <", value, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyLessThanOrEqualTo(Integer value) {
            addCriterion("special_supply <=", value, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyIn(List<Integer> values) {
            addCriterion("special_supply in", values, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyNotIn(List<Integer> values) {
            addCriterion("special_supply not in", values, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyBetween(Integer value1, Integer value2) {
            addCriterion("special_supply between", value1, value2, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andSpecialSupplyNotBetween(Integer value1, Integer value2) {
            addCriterion("special_supply not between", value1, value2, "specialSupply");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNull() {
            addCriterion("product_type is null");
            return (Criteria) this;
        }

        public Criteria andProductTypeIsNotNull() {
            addCriterion("product_type is not null");
            return (Criteria) this;
        }

        public Criteria andProductTypeEqualTo(Integer value) {
            addCriterion("product_type =", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotEqualTo(Integer value) {
            addCriterion("product_type <>", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThan(Integer value) {
            addCriterion("product_type >", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_type >=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThan(Integer value) {
            addCriterion("product_type <", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeLessThanOrEqualTo(Integer value) {
            addCriterion("product_type <=", value, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeIn(List<Integer> values) {
            addCriterion("product_type in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotIn(List<Integer> values) {
            addCriterion("product_type not in", values, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeBetween(Integer value1, Integer value2) {
            addCriterion("product_type between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andProductTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("product_type not between", value1, value2, "productType");
            return (Criteria) this;
        }

        public Criteria andOperationWayIsNull() {
            addCriterion("operation_way is null");
            return (Criteria) this;
        }

        public Criteria andOperationWayIsNotNull() {
            addCriterion("operation_way is not null");
            return (Criteria) this;
        }

        public Criteria andOperationWayEqualTo(Integer value) {
            addCriterion("operation_way =", value, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayNotEqualTo(Integer value) {
            addCriterion("operation_way <>", value, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayGreaterThan(Integer value) {
            addCriterion("operation_way >", value, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("operation_way >=", value, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayLessThan(Integer value) {
            addCriterion("operation_way <", value, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayLessThanOrEqualTo(Integer value) {
            addCriterion("operation_way <=", value, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayIn(List<Integer> values) {
            addCriterion("operation_way in", values, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayNotIn(List<Integer> values) {
            addCriterion("operation_way not in", values, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayBetween(Integer value1, Integer value2) {
            addCriterion("operation_way between", value1, value2, "operationWay");
            return (Criteria) this;
        }

        public Criteria andOperationWayNotBetween(Integer value1, Integer value2) {
            addCriterion("operation_way not between", value1, value2, "operationWay");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeIsNull() {
            addCriterion("period_lock_up_type is null");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeIsNotNull() {
            addCriterion("period_lock_up_type is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeEqualTo(Integer value) {
            addCriterion("period_lock_up_type =", value, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeNotEqualTo(Integer value) {
            addCriterion("period_lock_up_type <>", value, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeGreaterThan(Integer value) {
            addCriterion("period_lock_up_type >", value, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_lock_up_type >=", value, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeLessThan(Integer value) {
            addCriterion("period_lock_up_type <", value, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeLessThanOrEqualTo(Integer value) {
            addCriterion("period_lock_up_type <=", value, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeIn(List<Integer> values) {
            addCriterion("period_lock_up_type in", values, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeNotIn(List<Integer> values) {
            addCriterion("period_lock_up_type not in", values, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeBetween(Integer value1, Integer value2) {
            addCriterion("period_lock_up_type between", value1, value2, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("period_lock_up_type not between", value1, value2, "periodLockUpType");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeIsNull() {
            addCriterion("period_lock_up_time is null");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeIsNotNull() {
            addCriterion("period_lock_up_time is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeEqualTo(Integer value) {
            addCriterion("period_lock_up_time =", value, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeNotEqualTo(Integer value) {
            addCriterion("period_lock_up_time <>", value, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeGreaterThan(Integer value) {
            addCriterion("period_lock_up_time >", value, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_lock_up_time >=", value, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeLessThan(Integer value) {
            addCriterion("period_lock_up_time <", value, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeLessThanOrEqualTo(Integer value) {
            addCriterion("period_lock_up_time <=", value, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeIn(List<Integer> values) {
            addCriterion("period_lock_up_time in", values, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeNotIn(List<Integer> values) {
            addCriterion("period_lock_up_time not in", values, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeBetween(Integer value1, Integer value2) {
            addCriterion("period_lock_up_time between", value1, value2, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodLockUpTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("period_lock_up_time not between", value1, value2, "periodLockUpTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeIsNull() {
            addCriterion("period_float_type is null");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeIsNotNull() {
            addCriterion("period_float_type is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeEqualTo(Integer value) {
            addCriterion("period_float_type =", value, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeNotEqualTo(Integer value) {
            addCriterion("period_float_type <>", value, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeGreaterThan(Integer value) {
            addCriterion("period_float_type >", value, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_float_type >=", value, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeLessThan(Integer value) {
            addCriterion("period_float_type <", value, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeLessThanOrEqualTo(Integer value) {
            addCriterion("period_float_type <=", value, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeIn(List<Integer> values) {
            addCriterion("period_float_type in", values, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeNotIn(List<Integer> values) {
            addCriterion("period_float_type not in", values, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeBetween(Integer value1, Integer value2) {
            addCriterion("period_float_type between", value1, value2, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("period_float_type not between", value1, value2, "periodFloatType");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeIsNull() {
            addCriterion("period_float_time is null");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeIsNotNull() {
            addCriterion("period_float_time is not null");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeEqualTo(Integer value) {
            addCriterion("period_float_time =", value, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeNotEqualTo(Integer value) {
            addCriterion("period_float_time <>", value, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeGreaterThan(Integer value) {
            addCriterion("period_float_time >", value, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("period_float_time >=", value, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeLessThan(Integer value) {
            addCriterion("period_float_time <", value, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeLessThanOrEqualTo(Integer value) {
            addCriterion("period_float_time <=", value, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeIn(List<Integer> values) {
            addCriterion("period_float_time in", values, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeNotIn(List<Integer> values) {
            addCriterion("period_float_time not in", values, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeBetween(Integer value1, Integer value2) {
            addCriterion("period_float_time between", value1, value2, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andPeriodFloatTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("period_float_time not between", value1, value2, "periodFloatTime");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(Long value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(Long value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(Long value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(Long value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(Long value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<Long> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<Long> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(Long value1, Long value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(Long value1, Long value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountIsNull() {
            addCriterion("total_head_count is null");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountIsNotNull() {
            addCriterion("total_head_count is not null");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountEqualTo(Integer value) {
            addCriterion("total_head_count =", value, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountNotEqualTo(Integer value) {
            addCriterion("total_head_count <>", value, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountGreaterThan(Integer value) {
            addCriterion("total_head_count >", value, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("total_head_count >=", value, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountLessThan(Integer value) {
            addCriterion("total_head_count <", value, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountLessThanOrEqualTo(Integer value) {
            addCriterion("total_head_count <=", value, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountIn(List<Integer> values) {
            addCriterion("total_head_count in", values, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountNotIn(List<Integer> values) {
            addCriterion("total_head_count not in", values, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountBetween(Integer value1, Integer value2) {
            addCriterion("total_head_count between", value1, value2, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andTotalHeadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("total_head_count not between", value1, value2, "totalHeadCount");
            return (Criteria) this;
        }

        public Criteria andCanRedeemIsNull() {
            addCriterion("can_redeem is null");
            return (Criteria) this;
        }

        public Criteria andCanRedeemIsNotNull() {
            addCriterion("can_redeem is not null");
            return (Criteria) this;
        }

        public Criteria andCanRedeemEqualTo(Integer value) {
            addCriterion("can_redeem =", value, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemNotEqualTo(Integer value) {
            addCriterion("can_redeem <>", value, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemGreaterThan(Integer value) {
            addCriterion("can_redeem >", value, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemGreaterThanOrEqualTo(Integer value) {
            addCriterion("can_redeem >=", value, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemLessThan(Integer value) {
            addCriterion("can_redeem <", value, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemLessThanOrEqualTo(Integer value) {
            addCriterion("can_redeem <=", value, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemIn(List<Integer> values) {
            addCriterion("can_redeem in", values, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemNotIn(List<Integer> values) {
            addCriterion("can_redeem not in", values, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemBetween(Integer value1, Integer value2) {
            addCriterion("can_redeem between", value1, value2, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andCanRedeemNotBetween(Integer value1, Integer value2) {
            addCriterion("can_redeem not between", value1, value2, "canRedeem");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountIsNull() {
            addCriterion("min_invest_amount is null");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountIsNotNull() {
            addCriterion("min_invest_amount is not null");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountEqualTo(Integer value) {
            addCriterion("min_invest_amount =", value, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountNotEqualTo(Integer value) {
            addCriterion("min_invest_amount <>", value, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountGreaterThan(Integer value) {
            addCriterion("min_invest_amount >", value, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_invest_amount >=", value, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountLessThan(Integer value) {
            addCriterion("min_invest_amount <", value, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountLessThanOrEqualTo(Integer value) {
            addCriterion("min_invest_amount <=", value, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountIn(List<Integer> values) {
            addCriterion("min_invest_amount in", values, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountNotIn(List<Integer> values) {
            addCriterion("min_invest_amount not in", values, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountBetween(Integer value1, Integer value2) {
            addCriterion("min_invest_amount between", value1, value2, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andMinInvestAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("min_invest_amount not between", value1, value2, "minInvestAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountIsNull() {
            addCriterion("increase_amount is null");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountIsNotNull() {
            addCriterion("increase_amount is not null");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountEqualTo(Integer value) {
            addCriterion("increase_amount =", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountNotEqualTo(Integer value) {
            addCriterion("increase_amount <>", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountGreaterThan(Integer value) {
            addCriterion("increase_amount >", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("increase_amount >=", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountLessThan(Integer value) {
            addCriterion("increase_amount <", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountLessThanOrEqualTo(Integer value) {
            addCriterion("increase_amount <=", value, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountIn(List<Integer> values) {
            addCriterion("increase_amount in", values, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountNotIn(List<Integer> values) {
            addCriterion("increase_amount not in", values, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountBetween(Integer value1, Integer value2) {
            addCriterion("increase_amount between", value1, value2, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andIncreaseAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("increase_amount not between", value1, value2, "increaseAmount");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNull() {
            addCriterion("establish_date is null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIsNotNull() {
            addCriterion("establish_date is not null");
            return (Criteria) this;
        }

        public Criteria andEstablishDateEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date =", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date <>", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("establish_date >", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date >=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThan(Date value) {
            addCriterionForJDBCDate("establish_date <", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("establish_date <=", value, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateIn(List<Date> values) {
            addCriterionForJDBCDate("establish_date in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("establish_date not in", values, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("establish_date between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andEstablishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("establish_date not between", value1, value2, "establishDate");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNull() {
            addCriterion("open_type is null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIsNotNull() {
            addCriterion("open_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpenTypeEqualTo(Integer value) {
            addCriterion("open_type =", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotEqualTo(Integer value) {
            addCriterion("open_type <>", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThan(Integer value) {
            addCriterion("open_type >", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_type >=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThan(Integer value) {
            addCriterion("open_type <", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeLessThanOrEqualTo(Integer value) {
            addCriterion("open_type <=", value, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeIn(List<Integer> values) {
            addCriterion("open_type in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotIn(List<Integer> values) {
            addCriterion("open_type not in", values, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeBetween(Integer value1, Integer value2) {
            addCriterion("open_type between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("open_type not between", value1, value2, "openType");
            return (Criteria) this;
        }

        public Criteria andOpenMonthIsNull() {
            addCriterion("open_month is null");
            return (Criteria) this;
        }

        public Criteria andOpenMonthIsNotNull() {
            addCriterion("open_month is not null");
            return (Criteria) this;
        }

        public Criteria andOpenMonthEqualTo(Integer value) {
            addCriterion("open_month =", value, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthNotEqualTo(Integer value) {
            addCriterion("open_month <>", value, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthGreaterThan(Integer value) {
            addCriterion("open_month >", value, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_month >=", value, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthLessThan(Integer value) {
            addCriterion("open_month <", value, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthLessThanOrEqualTo(Integer value) {
            addCriterion("open_month <=", value, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthIn(List<Integer> values) {
            addCriterion("open_month in", values, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthNotIn(List<Integer> values) {
            addCriterion("open_month not in", values, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthBetween(Integer value1, Integer value2) {
            addCriterion("open_month between", value1, value2, "openMonth");
            return (Criteria) this;
        }

        public Criteria andOpenMonthNotBetween(Integer value1, Integer value2) {
            addCriterion("open_month not between", value1, value2, "openMonth");
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

        public Criteria andOpenDateEqualTo(Integer value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(Integer value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(Integer value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(Integer value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(Integer value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<Integer> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<Integer> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(Integer value1, Integer value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(Integer value1, Integer value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
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

        public Criteria andOpenRaisePeriodIsNull() {
            addCriterion("open_raise_period is null");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodIsNotNull() {
            addCriterion("open_raise_period is not null");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodEqualTo(Integer value) {
            addCriterion("open_raise_period =", value, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodNotEqualTo(Integer value) {
            addCriterion("open_raise_period <>", value, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodGreaterThan(Integer value) {
            addCriterion("open_raise_period >", value, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodGreaterThanOrEqualTo(Integer value) {
            addCriterion("open_raise_period >=", value, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodLessThan(Integer value) {
            addCriterion("open_raise_period <", value, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodLessThanOrEqualTo(Integer value) {
            addCriterion("open_raise_period <=", value, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodIn(List<Integer> values) {
            addCriterion("open_raise_period in", values, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodNotIn(List<Integer> values) {
            addCriterion("open_raise_period not in", values, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodBetween(Integer value1, Integer value2) {
            addCriterion("open_raise_period between", value1, value2, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andOpenRaisePeriodNotBetween(Integer value1, Integer value2) {
            addCriterion("open_raise_period not between", value1, value2, "openRaisePeriod");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateIsNull() {
            addCriterion("raise_finish_date is null");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateIsNotNull() {
            addCriterion("raise_finish_date is not null");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateEqualTo(Date value) {
            addCriterionForJDBCDate("raise_finish_date =", value, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("raise_finish_date <>", value, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateGreaterThan(Date value) {
            addCriterionForJDBCDate("raise_finish_date >", value, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_finish_date >=", value, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateLessThan(Date value) {
            addCriterionForJDBCDate("raise_finish_date <", value, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("raise_finish_date <=", value, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateIn(List<Date> values) {
            addCriterionForJDBCDate("raise_finish_date in", values, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("raise_finish_date not in", values, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_finish_date between", value1, value2, "raiseFinishDate");
            return (Criteria) this;
        }

        public Criteria andRaiseFinishDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("raise_finish_date not between", value1, value2, "raiseFinishDate");
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

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterionForJDBCDate("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterionForJDBCDate("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterionForJDBCDate("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterionForJDBCDate("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("pay_date not between", value1, value2, "payDate");
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

        public Criteria andStockAmountIsNull() {
            addCriterion("stock_amount is null");
            return (Criteria) this;
        }

        public Criteria andStockAmountIsNotNull() {
            addCriterion("stock_amount is not null");
            return (Criteria) this;
        }

        public Criteria andStockAmountEqualTo(Integer value) {
            addCriterion("stock_amount =", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotEqualTo(Integer value) {
            addCriterion("stock_amount <>", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThan(Integer value) {
            addCriterion("stock_amount >", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_amount >=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThan(Integer value) {
            addCriterion("stock_amount <", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountLessThanOrEqualTo(Integer value) {
            addCriterion("stock_amount <=", value, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountIn(List<Integer> values) {
            addCriterion("stock_amount in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotIn(List<Integer> values) {
            addCriterion("stock_amount not in", values, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountBetween(Integer value1, Integer value2) {
            addCriterion("stock_amount between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_amount not between", value1, value2, "stockAmount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountIsNull() {
            addCriterion("stock_head_count is null");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountIsNotNull() {
            addCriterion("stock_head_count is not null");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountEqualTo(Integer value) {
            addCriterion("stock_head_count =", value, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountNotEqualTo(Integer value) {
            addCriterion("stock_head_count <>", value, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountGreaterThan(Integer value) {
            addCriterion("stock_head_count >", value, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("stock_head_count >=", value, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountLessThan(Integer value) {
            addCriterion("stock_head_count <", value, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountLessThanOrEqualTo(Integer value) {
            addCriterion("stock_head_count <=", value, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountIn(List<Integer> values) {
            addCriterion("stock_head_count in", values, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountNotIn(List<Integer> values) {
            addCriterion("stock_head_count not in", values, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountBetween(Integer value1, Integer value2) {
            addCriterion("stock_head_count between", value1, value2, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andStockHeadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("stock_head_count not between", value1, value2, "stockHeadCount");
            return (Criteria) this;
        }

        public Criteria andHomepageShowIsNull() {
            addCriterion("homepage_show is null");
            return (Criteria) this;
        }

        public Criteria andHomepageShowIsNotNull() {
            addCriterion("homepage_show is not null");
            return (Criteria) this;
        }

        public Criteria andHomepageShowEqualTo(Integer value) {
            addCriterion("homepage_show =", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowNotEqualTo(Integer value) {
            addCriterion("homepage_show <>", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowGreaterThan(Integer value) {
            addCriterion("homepage_show >", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowGreaterThanOrEqualTo(Integer value) {
            addCriterion("homepage_show >=", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowLessThan(Integer value) {
            addCriterion("homepage_show <", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowLessThanOrEqualTo(Integer value) {
            addCriterion("homepage_show <=", value, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowIn(List<Integer> values) {
            addCriterion("homepage_show in", values, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowNotIn(List<Integer> values) {
            addCriterion("homepage_show not in", values, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowBetween(Integer value1, Integer value2) {
            addCriterion("homepage_show between", value1, value2, "homepageShow");
            return (Criteria) this;
        }

        public Criteria andHomepageShowNotBetween(Integer value1, Integer value2) {
            addCriterion("homepage_show not between", value1, value2, "homepageShow");
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