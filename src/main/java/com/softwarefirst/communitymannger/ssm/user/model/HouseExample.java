package com.softwarefirst.communitymannger.ssm.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class HouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public HouseExample() {
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

        public Criteria andHoNumberIsNull() {
            addCriterion("ho_number is null");
            return (Criteria) this;
        }

        public Criteria andHoNumberIsNotNull() {
            addCriterion("ho_number is not null");
            return (Criteria) this;
        }

        public Criteria andHoNumberEqualTo(String value) {
            addCriterion("ho_number =", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberNotEqualTo(String value) {
            addCriterion("ho_number <>", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberGreaterThan(String value) {
            addCriterion("ho_number >", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("ho_number >=", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberLessThan(String value) {
            addCriterion("ho_number <", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberLessThanOrEqualTo(String value) {
            addCriterion("ho_number <=", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberLike(String value) {
            addCriterion("ho_number like", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberNotLike(String value) {
            addCriterion("ho_number not like", value, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberIn(List<String> values) {
            addCriterion("ho_number in", values, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberNotIn(List<String> values) {
            addCriterion("ho_number not in", values, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberBetween(String value1, String value2) {
            addCriterion("ho_number between", value1, value2, "hoNumber");
            return (Criteria) this;
        }

        public Criteria andHoNumberNotBetween(String value1, String value2) {
            addCriterion("ho_number not between", value1, value2, "hoNumber");
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

        public Criteria andHoCellIsNull() {
            addCriterion("ho_cell is null");
            return (Criteria) this;
        }

        public Criteria andHoCellIsNotNull() {
            addCriterion("ho_cell is not null");
            return (Criteria) this;
        }

        public Criteria andHoCellEqualTo(String value) {
            addCriterion("ho_cell =", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellNotEqualTo(String value) {
            addCriterion("ho_cell <>", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellGreaterThan(String value) {
            addCriterion("ho_cell >", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellGreaterThanOrEqualTo(String value) {
            addCriterion("ho_cell >=", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellLessThan(String value) {
            addCriterion("ho_cell <", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellLessThanOrEqualTo(String value) {
            addCriterion("ho_cell <=", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellLike(String value) {
            addCriterion("ho_cell like", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellNotLike(String value) {
            addCriterion("ho_cell not like", value, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellIn(List<String> values) {
            addCriterion("ho_cell in", values, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellNotIn(List<String> values) {
            addCriterion("ho_cell not in", values, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellBetween(String value1, String value2) {
            addCriterion("ho_cell between", value1, value2, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoCellNotBetween(String value1, String value2) {
            addCriterion("ho_cell not between", value1, value2, "hoCell");
            return (Criteria) this;
        }

        public Criteria andHoLevelIsNull() {
            addCriterion("ho_level is null");
            return (Criteria) this;
        }

        public Criteria andHoLevelIsNotNull() {
            addCriterion("ho_level is not null");
            return (Criteria) this;
        }

        public Criteria andHoLevelEqualTo(String value) {
            addCriterion("ho_level =", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelNotEqualTo(String value) {
            addCriterion("ho_level <>", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelGreaterThan(String value) {
            addCriterion("ho_level >", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelGreaterThanOrEqualTo(String value) {
            addCriterion("ho_level >=", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelLessThan(String value) {
            addCriterion("ho_level <", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelLessThanOrEqualTo(String value) {
            addCriterion("ho_level <=", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelLike(String value) {
            addCriterion("ho_level like", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelNotLike(String value) {
            addCriterion("ho_level not like", value, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelIn(List<String> values) {
            addCriterion("ho_level in", values, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelNotIn(List<String> values) {
            addCriterion("ho_level not in", values, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelBetween(String value1, String value2) {
            addCriterion("ho_level between", value1, value2, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoLevelNotBetween(String value1, String value2) {
            addCriterion("ho_level not between", value1, value2, "hoLevel");
            return (Criteria) this;
        }

        public Criteria andHoAreaIsNull() {
            addCriterion("ho_area is null");
            return (Criteria) this;
        }

        public Criteria andHoAreaIsNotNull() {
            addCriterion("ho_area is not null");
            return (Criteria) this;
        }

        public Criteria andHoAreaEqualTo(String value) {
            addCriterion("ho_area =", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaNotEqualTo(String value) {
            addCriterion("ho_area <>", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaGreaterThan(String value) {
            addCriterion("ho_area >", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ho_area >=", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaLessThan(String value) {
            addCriterion("ho_area <", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaLessThanOrEqualTo(String value) {
            addCriterion("ho_area <=", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaLike(String value) {
            addCriterion("ho_area like", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaNotLike(String value) {
            addCriterion("ho_area not like", value, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaIn(List<String> values) {
            addCriterion("ho_area in", values, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaNotIn(List<String> values) {
            addCriterion("ho_area not in", values, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaBetween(String value1, String value2) {
            addCriterion("ho_area between", value1, value2, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoAreaNotBetween(String value1, String value2) {
            addCriterion("ho_area not between", value1, value2, "hoArea");
            return (Criteria) this;
        }

        public Criteria andHoPriceIsNull() {
            addCriterion("ho_price is null");
            return (Criteria) this;
        }

        public Criteria andHoPriceIsNotNull() {
            addCriterion("ho_price is not null");
            return (Criteria) this;
        }

        public Criteria andHoPriceEqualTo(String value) {
            addCriterion("ho_price =", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceNotEqualTo(String value) {
            addCriterion("ho_price <>", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceGreaterThan(String value) {
            addCriterion("ho_price >", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceGreaterThanOrEqualTo(String value) {
            addCriterion("ho_price >=", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceLessThan(String value) {
            addCriterion("ho_price <", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceLessThanOrEqualTo(String value) {
            addCriterion("ho_price <=", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceLike(String value) {
            addCriterion("ho_price like", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceNotLike(String value) {
            addCriterion("ho_price not like", value, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceIn(List<String> values) {
            addCriterion("ho_price in", values, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceNotIn(List<String> values) {
            addCriterion("ho_price not in", values, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceBetween(String value1, String value2) {
            addCriterion("ho_price between", value1, value2, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoPriceNotBetween(String value1, String value2) {
            addCriterion("ho_price not between", value1, value2, "hoPrice");
            return (Criteria) this;
        }

        public Criteria andHoStateIsNull() {
            addCriterion("ho_state is null");
            return (Criteria) this;
        }

        public Criteria andHoStateIsNotNull() {
            addCriterion("ho_state is not null");
            return (Criteria) this;
        }

        public Criteria andHoStateEqualTo(String value) {
            addCriterion("ho_state =", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateNotEqualTo(String value) {
            addCriterion("ho_state <>", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateGreaterThan(String value) {
            addCriterion("ho_state >", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateGreaterThanOrEqualTo(String value) {
            addCriterion("ho_state >=", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateLessThan(String value) {
            addCriterion("ho_state <", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateLessThanOrEqualTo(String value) {
            addCriterion("ho_state <=", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateLike(String value) {
            addCriterion("ho_state like", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateNotLike(String value) {
            addCriterion("ho_state not like", value, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateIn(List<String> values) {
            addCriterion("ho_state in", values, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateNotIn(List<String> values) {
            addCriterion("ho_state not in", values, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateBetween(String value1, String value2) {
            addCriterion("ho_state between", value1, value2, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoStateNotBetween(String value1, String value2) {
            addCriterion("ho_state not between", value1, value2, "hoState");
            return (Criteria) this;
        }

        public Criteria andHoLoginIsNull() {
            addCriterion("ho_login is null");
            return (Criteria) this;
        }

        public Criteria andHoLoginIsNotNull() {
            addCriterion("ho_login is not null");
            return (Criteria) this;
        }

        public Criteria andHoLoginEqualTo(String value) {
            addCriterion("ho_login =", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginNotEqualTo(String value) {
            addCriterion("ho_login <>", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginGreaterThan(String value) {
            addCriterion("ho_login >", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginGreaterThanOrEqualTo(String value) {
            addCriterion("ho_login >=", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginLessThan(String value) {
            addCriterion("ho_login <", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginLessThanOrEqualTo(String value) {
            addCriterion("ho_login <=", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginLike(String value) {
            addCriterion("ho_login like", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginNotLike(String value) {
            addCriterion("ho_login not like", value, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginIn(List<String> values) {
            addCriterion("ho_login in", values, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginNotIn(List<String> values) {
            addCriterion("ho_login not in", values, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginBetween(String value1, String value2) {
            addCriterion("ho_login between", value1, value2, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLoginNotBetween(String value1, String value2) {
            addCriterion("ho_login not between", value1, value2, "hoLogin");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeIsNull() {
            addCriterion("ho_logintime is null");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeIsNotNull() {
            addCriterion("ho_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("ho_logintime =", value, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ho_logintime <>", value, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ho_logintime >", value, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ho_logintime >=", value, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("ho_logintime <", value, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ho_logintime <=", value, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("ho_logintime in", values, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ho_logintime not in", values, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ho_logintime between", value1, value2, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ho_logintime not between", value1, value2, "hoLogintime");
            return (Criteria) this;
        }

        public Criteria andHoUpdateIsNull() {
            addCriterion("ho_update is null");
            return (Criteria) this;
        }

        public Criteria andHoUpdateIsNotNull() {
            addCriterion("ho_update is not null");
            return (Criteria) this;
        }

        public Criteria andHoUpdateEqualTo(String value) {
            addCriterion("ho_update =", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateNotEqualTo(String value) {
            addCriterion("ho_update <>", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateGreaterThan(String value) {
            addCriterion("ho_update >", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("ho_update >=", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateLessThan(String value) {
            addCriterion("ho_update <", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateLessThanOrEqualTo(String value) {
            addCriterion("ho_update <=", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateLike(String value) {
            addCriterion("ho_update like", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateNotLike(String value) {
            addCriterion("ho_update not like", value, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateIn(List<String> values) {
            addCriterion("ho_update in", values, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateNotIn(List<String> values) {
            addCriterion("ho_update not in", values, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateBetween(String value1, String value2) {
            addCriterion("ho_update between", value1, value2, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdateNotBetween(String value1, String value2) {
            addCriterion("ho_update not between", value1, value2, "hoUpdate");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeIsNull() {
            addCriterion("ho_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeIsNotNull() {
            addCriterion("ho_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("ho_updatetime =", value, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ho_updatetime <>", value, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ho_updatetime >", value, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ho_updatetime >=", value, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("ho_updatetime <", value, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ho_updatetime <=", value, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("ho_updatetime in", values, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ho_updatetime not in", values, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ho_updatetime between", value1, value2, "hoUpdatetime");
            return (Criteria) this;
        }

        public Criteria andHoUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ho_updatetime not between", value1, value2, "hoUpdatetime");
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