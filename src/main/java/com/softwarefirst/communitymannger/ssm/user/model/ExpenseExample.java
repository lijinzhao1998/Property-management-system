package com.softwarefirst.communitymannger.ssm.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ExpenseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public ExpenseExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andExNumberIsNull() {
            addCriterion("ex_number is null");
            return (Criteria) this;
        }

        public Criteria andExNumberIsNotNull() {
            addCriterion("ex_number is not null");
            return (Criteria) this;
        }

        public Criteria andExNumberEqualTo(String value) {
            addCriterion("ex_number =", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberNotEqualTo(String value) {
            addCriterion("ex_number <>", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberGreaterThan(String value) {
            addCriterion("ex_number >", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ex_number >=", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberLessThan(String value) {
            addCriterion("ex_number <", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberLessThanOrEqualTo(String value) {
            addCriterion("ex_number <=", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberLike(String value) {
            addCriterion("ex_number like", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberNotLike(String value) {
            addCriterion("ex_number not like", value, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberIn(List<String> values) {
            addCriterion("ex_number in", values, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberNotIn(List<String> values) {
            addCriterion("ex_number not in", values, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberBetween(String value1, String value2) {
            addCriterion("ex_number between", value1, value2, "exNumber");
            return (Criteria) this;
        }

        public Criteria andExNumberNotBetween(String value1, String value2) {
            addCriterion("ex_number not between", value1, value2, "exNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberIsNull() {
            addCriterion("ow_number is null");
            return (Criteria) this;
        }

        public Criteria andOwNumberIsNotNull() {
            addCriterion("ow_number is not null");
            return (Criteria) this;
        }

        public Criteria andOwNumberEqualTo(String value) {
            addCriterion("ow_number =", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberNotEqualTo(String value) {
            addCriterion("ow_number <>", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberGreaterThan(String value) {
            addCriterion("ow_number >", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ow_number >=", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberLessThan(String value) {
            addCriterion("ow_number <", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberLessThanOrEqualTo(String value) {
            addCriterion("ow_number <=", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberLike(String value) {
            addCriterion("ow_number like", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberNotLike(String value) {
            addCriterion("ow_number not like", value, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberIn(List<String> values) {
            addCriterion("ow_number in", values, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberNotIn(List<String> values) {
            addCriterion("ow_number not in", values, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberBetween(String value1, String value2) {
            addCriterion("ow_number between", value1, value2, "owNumber");
            return (Criteria) this;
        }

        public Criteria andOwNumberNotBetween(String value1, String value2) {
            addCriterion("ow_number not between", value1, value2, "owNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberIsNull() {
            addCriterion("em_number is null");
            return (Criteria) this;
        }

        public Criteria andEmNumberIsNotNull() {
            addCriterion("em_number is not null");
            return (Criteria) this;
        }

        public Criteria andEmNumberEqualTo(String value) {
            addCriterion("em_number =", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberNotEqualTo(String value) {
            addCriterion("em_number <>", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberGreaterThan(String value) {
            addCriterion("em_number >", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberGreaterThanOrEqualTo(String value) {
            addCriterion("em_number >=", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberLessThan(String value) {
            addCriterion("em_number <", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberLessThanOrEqualTo(String value) {
            addCriterion("em_number <=", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberLike(String value) {
            addCriterion("em_number like", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberNotLike(String value) {
            addCriterion("em_number not like", value, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberIn(List<String> values) {
            addCriterion("em_number in", values, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberNotIn(List<String> values) {
            addCriterion("em_number not in", values, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberBetween(String value1, String value2) {
            addCriterion("em_number between", value1, value2, "emNumber");
            return (Criteria) this;
        }

        public Criteria andEmNumberNotBetween(String value1, String value2) {
            addCriterion("em_number not between", value1, value2, "emNumber");
            return (Criteria) this;
        }

        public Criteria andExCostIsNull() {
            addCriterion("ex_cost is null");
            return (Criteria) this;
        }

        public Criteria andExCostIsNotNull() {
            addCriterion("ex_cost is not null");
            return (Criteria) this;
        }

        public Criteria andExCostEqualTo(String value) {
            addCriterion("ex_cost =", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostNotEqualTo(String value) {
            addCriterion("ex_cost <>", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostGreaterThan(String value) {
            addCriterion("ex_cost >", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostGreaterThanOrEqualTo(String value) {
            addCriterion("ex_cost >=", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostLessThan(String value) {
            addCriterion("ex_cost <", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostLessThanOrEqualTo(String value) {
            addCriterion("ex_cost <=", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostLike(String value) {
            addCriterion("ex_cost like", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostNotLike(String value) {
            addCriterion("ex_cost not like", value, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostIn(List<String> values) {
            addCriterion("ex_cost in", values, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostNotIn(List<String> values) {
            addCriterion("ex_cost not in", values, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostBetween(String value1, String value2) {
            addCriterion("ex_cost between", value1, value2, "exCost");
            return (Criteria) this;
        }

        public Criteria andExCostNotBetween(String value1, String value2) {
            addCriterion("ex_cost not between", value1, value2, "exCost");
            return (Criteria) this;
        }

        public Criteria andExTypeIsNull() {
            addCriterion("ex_type is null");
            return (Criteria) this;
        }

        public Criteria andExTypeIsNotNull() {
            addCriterion("ex_type is not null");
            return (Criteria) this;
        }

        public Criteria andExTypeEqualTo(String value) {
            addCriterion("ex_type =", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotEqualTo(String value) {
            addCriterion("ex_type <>", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeGreaterThan(String value) {
            addCriterion("ex_type >", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ex_type >=", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLessThan(String value) {
            addCriterion("ex_type <", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLessThanOrEqualTo(String value) {
            addCriterion("ex_type <=", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeLike(String value) {
            addCriterion("ex_type like", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotLike(String value) {
            addCriterion("ex_type not like", value, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeIn(List<String> values) {
            addCriterion("ex_type in", values, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotIn(List<String> values) {
            addCriterion("ex_type not in", values, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeBetween(String value1, String value2) {
            addCriterion("ex_type between", value1, value2, "exType");
            return (Criteria) this;
        }

        public Criteria andExTypeNotBetween(String value1, String value2) {
            addCriterion("ex_type not between", value1, value2, "exType");
            return (Criteria) this;
        }

        public Criteria andExDetailsIsNull() {
            addCriterion("ex_details is null");
            return (Criteria) this;
        }

        public Criteria andExDetailsIsNotNull() {
            addCriterion("ex_details is not null");
            return (Criteria) this;
        }

        public Criteria andExDetailsEqualTo(Date value) {
            addCriterionForJDBCDate("ex_details =", value, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsNotEqualTo(Date value) {
            addCriterionForJDBCDate("ex_details <>", value, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsGreaterThan(Date value) {
            addCriterionForJDBCDate("ex_details >", value, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ex_details >=", value, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsLessThan(Date value) {
            addCriterionForJDBCDate("ex_details <", value, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ex_details <=", value, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsIn(List<Date> values) {
            addCriterionForJDBCDate("ex_details in", values, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsNotIn(List<Date> values) {
            addCriterionForJDBCDate("ex_details not in", values, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ex_details between", value1, value2, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExDetailsNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ex_details not between", value1, value2, "exDetails");
            return (Criteria) this;
        }

        public Criteria andExPayIsNull() {
            addCriterion("ex_pay is null");
            return (Criteria) this;
        }

        public Criteria andExPayIsNotNull() {
            addCriterion("ex_pay is not null");
            return (Criteria) this;
        }

        public Criteria andExPayEqualTo(String value) {
            addCriterion("ex_pay =", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayNotEqualTo(String value) {
            addCriterion("ex_pay <>", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayGreaterThan(String value) {
            addCriterion("ex_pay >", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayGreaterThanOrEqualTo(String value) {
            addCriterion("ex_pay >=", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayLessThan(String value) {
            addCriterion("ex_pay <", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayLessThanOrEqualTo(String value) {
            addCriterion("ex_pay <=", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayLike(String value) {
            addCriterion("ex_pay like", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayNotLike(String value) {
            addCriterion("ex_pay not like", value, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayIn(List<String> values) {
            addCriterion("ex_pay in", values, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayNotIn(List<String> values) {
            addCriterion("ex_pay not in", values, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayBetween(String value1, String value2) {
            addCriterion("ex_pay between", value1, value2, "exPay");
            return (Criteria) this;
        }

        public Criteria andExPayNotBetween(String value1, String value2) {
            addCriterion("ex_pay not between", value1, value2, "exPay");
            return (Criteria) this;
        }

        public Criteria andExStateIsNull() {
            addCriterion("ex_state is null");
            return (Criteria) this;
        }

        public Criteria andExStateIsNotNull() {
            addCriterion("ex_state is not null");
            return (Criteria) this;
        }

        public Criteria andExStateEqualTo(String value) {
            addCriterion("ex_state =", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateNotEqualTo(String value) {
            addCriterion("ex_state <>", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateGreaterThan(String value) {
            addCriterion("ex_state >", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateGreaterThanOrEqualTo(String value) {
            addCriterion("ex_state >=", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateLessThan(String value) {
            addCriterion("ex_state <", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateLessThanOrEqualTo(String value) {
            addCriterion("ex_state <=", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateLike(String value) {
            addCriterion("ex_state like", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateNotLike(String value) {
            addCriterion("ex_state not like", value, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateIn(List<String> values) {
            addCriterion("ex_state in", values, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateNotIn(List<String> values) {
            addCriterion("ex_state not in", values, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateBetween(String value1, String value2) {
            addCriterion("ex_state between", value1, value2, "exState");
            return (Criteria) this;
        }

        public Criteria andExStateNotBetween(String value1, String value2) {
            addCriterion("ex_state not between", value1, value2, "exState");
            return (Criteria) this;
        }

        public Criteria andExLoginIsNull() {
            addCriterion("ex_login is null");
            return (Criteria) this;
        }

        public Criteria andExLoginIsNotNull() {
            addCriterion("ex_login is not null");
            return (Criteria) this;
        }

        public Criteria andExLoginEqualTo(String value) {
            addCriterion("ex_login =", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginNotEqualTo(String value) {
            addCriterion("ex_login <>", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginGreaterThan(String value) {
            addCriterion("ex_login >", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginGreaterThanOrEqualTo(String value) {
            addCriterion("ex_login >=", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginLessThan(String value) {
            addCriterion("ex_login <", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginLessThanOrEqualTo(String value) {
            addCriterion("ex_login <=", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginLike(String value) {
            addCriterion("ex_login like", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginNotLike(String value) {
            addCriterion("ex_login not like", value, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginIn(List<String> values) {
            addCriterion("ex_login in", values, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginNotIn(List<String> values) {
            addCriterion("ex_login not in", values, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginBetween(String value1, String value2) {
            addCriterion("ex_login between", value1, value2, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLoginNotBetween(String value1, String value2) {
            addCriterion("ex_login not between", value1, value2, "exLogin");
            return (Criteria) this;
        }

        public Criteria andExLogintimeIsNull() {
            addCriterion("ex_logintime is null");
            return (Criteria) this;
        }

        public Criteria andExLogintimeIsNotNull() {
            addCriterion("ex_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andExLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("ex_logintime =", value, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ex_logintime <>", value, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ex_logintime >", value, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ex_logintime >=", value, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("ex_logintime <", value, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ex_logintime <=", value, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("ex_logintime in", values, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ex_logintime not in", values, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ex_logintime between", value1, value2, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ex_logintime not between", value1, value2, "exLogintime");
            return (Criteria) this;
        }

        public Criteria andExUpdateIsNull() {
            addCriterion("ex_update is null");
            return (Criteria) this;
        }

        public Criteria andExUpdateIsNotNull() {
            addCriterion("ex_update is not null");
            return (Criteria) this;
        }

        public Criteria andExUpdateEqualTo(String value) {
            addCriterion("ex_update =", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateNotEqualTo(String value) {
            addCriterion("ex_update <>", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateGreaterThan(String value) {
            addCriterion("ex_update >", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("ex_update >=", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateLessThan(String value) {
            addCriterion("ex_update <", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateLessThanOrEqualTo(String value) {
            addCriterion("ex_update <=", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateLike(String value) {
            addCriterion("ex_update like", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateNotLike(String value) {
            addCriterion("ex_update not like", value, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateIn(List<String> values) {
            addCriterion("ex_update in", values, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateNotIn(List<String> values) {
            addCriterion("ex_update not in", values, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateBetween(String value1, String value2) {
            addCriterion("ex_update between", value1, value2, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdateNotBetween(String value1, String value2) {
            addCriterion("ex_update not between", value1, value2, "exUpdate");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeIsNull() {
            addCriterion("ex_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeIsNotNull() {
            addCriterion("ex_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("ex_updatetime =", value, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ex_updatetime <>", value, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ex_updatetime >", value, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ex_updatetime >=", value, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("ex_updatetime <", value, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ex_updatetime <=", value, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("ex_updatetime in", values, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ex_updatetime not in", values, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ex_updatetime between", value1, value2, "exUpdatetime");
            return (Criteria) this;
        }

        public Criteria andExUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ex_updatetime not between", value1, value2, "exUpdatetime");
            return (Criteria) this;
        }
    }

    /**
     */
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