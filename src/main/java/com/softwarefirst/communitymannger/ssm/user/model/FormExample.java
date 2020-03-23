package com.softwarefirst.communitymannger.ssm.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FormExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public FormExample() {
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

        public Criteria andFoNumberIsNull() {
            addCriterion("fo_number is null");
            return (Criteria) this;
        }

        public Criteria andFoNumberIsNotNull() {
            addCriterion("fo_number is not null");
            return (Criteria) this;
        }

        public Criteria andFoNumberEqualTo(String value) {
            addCriterion("fo_number =", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberNotEqualTo(String value) {
            addCriterion("fo_number <>", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberGreaterThan(String value) {
            addCriterion("fo_number >", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("fo_number >=", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberLessThan(String value) {
            addCriterion("fo_number <", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberLessThanOrEqualTo(String value) {
            addCriterion("fo_number <=", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberLike(String value) {
            addCriterion("fo_number like", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberNotLike(String value) {
            addCriterion("fo_number not like", value, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberIn(List<String> values) {
            addCriterion("fo_number in", values, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberNotIn(List<String> values) {
            addCriterion("fo_number not in", values, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberBetween(String value1, String value2) {
            addCriterion("fo_number between", value1, value2, "foNumber");
            return (Criteria) this;
        }

        public Criteria andFoNumberNotBetween(String value1, String value2) {
            addCriterion("fo_number not between", value1, value2, "foNumber");
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

        public Criteria andFoTypeIsNull() {
            addCriterion("fo_type is null");
            return (Criteria) this;
        }

        public Criteria andFoTypeIsNotNull() {
            addCriterion("fo_type is not null");
            return (Criteria) this;
        }

        public Criteria andFoTypeEqualTo(String value) {
            addCriterion("fo_type =", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeNotEqualTo(String value) {
            addCriterion("fo_type <>", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeGreaterThan(String value) {
            addCriterion("fo_type >", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("fo_type >=", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeLessThan(String value) {
            addCriterion("fo_type <", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeLessThanOrEqualTo(String value) {
            addCriterion("fo_type <=", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeLike(String value) {
            addCriterion("fo_type like", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeNotLike(String value) {
            addCriterion("fo_type not like", value, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeIn(List<String> values) {
            addCriterion("fo_type in", values, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeNotIn(List<String> values) {
            addCriterion("fo_type not in", values, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeBetween(String value1, String value2) {
            addCriterion("fo_type between", value1, value2, "foType");
            return (Criteria) this;
        }

        public Criteria andFoTypeNotBetween(String value1, String value2) {
            addCriterion("fo_type not between", value1, value2, "foType");
            return (Criteria) this;
        }

        public Criteria andFoStateIsNull() {
            addCriterion("fo_state is null");
            return (Criteria) this;
        }

        public Criteria andFoStateIsNotNull() {
            addCriterion("fo_state is not null");
            return (Criteria) this;
        }

        public Criteria andFoStateEqualTo(String value) {
            addCriterion("fo_state =", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateNotEqualTo(String value) {
            addCriterion("fo_state <>", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateGreaterThan(String value) {
            addCriterion("fo_state >", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateGreaterThanOrEqualTo(String value) {
            addCriterion("fo_state >=", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateLessThan(String value) {
            addCriterion("fo_state <", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateLessThanOrEqualTo(String value) {
            addCriterion("fo_state <=", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateLike(String value) {
            addCriterion("fo_state like", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateNotLike(String value) {
            addCriterion("fo_state not like", value, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateIn(List<String> values) {
            addCriterion("fo_state in", values, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateNotIn(List<String> values) {
            addCriterion("fo_state not in", values, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateBetween(String value1, String value2) {
            addCriterion("fo_state between", value1, value2, "foState");
            return (Criteria) this;
        }

        public Criteria andFoStateNotBetween(String value1, String value2) {
            addCriterion("fo_state not between", value1, value2, "foState");
            return (Criteria) this;
        }

        public Criteria andFoNoteIsNull() {
            addCriterion("fo_note is null");
            return (Criteria) this;
        }

        public Criteria andFoNoteIsNotNull() {
            addCriterion("fo_note is not null");
            return (Criteria) this;
        }

        public Criteria andFoNoteEqualTo(String value) {
            addCriterion("fo_note =", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteNotEqualTo(String value) {
            addCriterion("fo_note <>", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteGreaterThan(String value) {
            addCriterion("fo_note >", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteGreaterThanOrEqualTo(String value) {
            addCriterion("fo_note >=", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteLessThan(String value) {
            addCriterion("fo_note <", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteLessThanOrEqualTo(String value) {
            addCriterion("fo_note <=", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteLike(String value) {
            addCriterion("fo_note like", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteNotLike(String value) {
            addCriterion("fo_note not like", value, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteIn(List<String> values) {
            addCriterion("fo_note in", values, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteNotIn(List<String> values) {
            addCriterion("fo_note not in", values, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteBetween(String value1, String value2) {
            addCriterion("fo_note between", value1, value2, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoNoteNotBetween(String value1, String value2) {
            addCriterion("fo_note not between", value1, value2, "foNote");
            return (Criteria) this;
        }

        public Criteria andFoPtimeIsNull() {
            addCriterion("fo_ptime is null");
            return (Criteria) this;
        }

        public Criteria andFoPtimeIsNotNull() {
            addCriterion("fo_ptime is not null");
            return (Criteria) this;
        }

        public Criteria andFoPtimeEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ptime =", value, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ptime <>", value, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fo_ptime >", value, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ptime >=", value, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeLessThan(Date value) {
            addCriterionForJDBCDate("fo_ptime <", value, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ptime <=", value, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeIn(List<Date> values) {
            addCriterionForJDBCDate("fo_ptime in", values, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fo_ptime not in", values, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_ptime between", value1, value2, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoPtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_ptime not between", value1, value2, "foPtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeIsNull() {
            addCriterion("fo_ftime is null");
            return (Criteria) this;
        }

        public Criteria andFoFtimeIsNotNull() {
            addCriterion("fo_ftime is not null");
            return (Criteria) this;
        }

        public Criteria andFoFtimeEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ftime =", value, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ftime <>", value, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fo_ftime >", value, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ftime >=", value, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeLessThan(Date value) {
            addCriterionForJDBCDate("fo_ftime <", value, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_ftime <=", value, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeIn(List<Date> values) {
            addCriterionForJDBCDate("fo_ftime in", values, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fo_ftime not in", values, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_ftime between", value1, value2, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoFtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_ftime not between", value1, value2, "foFtime");
            return (Criteria) this;
        }

        public Criteria andFoLoginIsNull() {
            addCriterion("fo_login is null");
            return (Criteria) this;
        }

        public Criteria andFoLoginIsNotNull() {
            addCriterion("fo_login is not null");
            return (Criteria) this;
        }

        public Criteria andFoLoginEqualTo(String value) {
            addCriterion("fo_login =", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginNotEqualTo(String value) {
            addCriterion("fo_login <>", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginGreaterThan(String value) {
            addCriterion("fo_login >", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginGreaterThanOrEqualTo(String value) {
            addCriterion("fo_login >=", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginLessThan(String value) {
            addCriterion("fo_login <", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginLessThanOrEqualTo(String value) {
            addCriterion("fo_login <=", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginLike(String value) {
            addCriterion("fo_login like", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginNotLike(String value) {
            addCriterion("fo_login not like", value, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginIn(List<String> values) {
            addCriterion("fo_login in", values, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginNotIn(List<String> values) {
            addCriterion("fo_login not in", values, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginBetween(String value1, String value2) {
            addCriterion("fo_login between", value1, value2, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLoginNotBetween(String value1, String value2) {
            addCriterion("fo_login not between", value1, value2, "foLogin");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeIsNull() {
            addCriterion("fo_logintime is null");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeIsNotNull() {
            addCriterion("fo_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("fo_logintime =", value, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fo_logintime <>", value, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fo_logintime >", value, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_logintime >=", value, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("fo_logintime <", value, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_logintime <=", value, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("fo_logintime in", values, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fo_logintime not in", values, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_logintime between", value1, value2, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_logintime not between", value1, value2, "foLogintime");
            return (Criteria) this;
        }

        public Criteria andFoUpdateIsNull() {
            addCriterion("fo_update is null");
            return (Criteria) this;
        }

        public Criteria andFoUpdateIsNotNull() {
            addCriterion("fo_update is not null");
            return (Criteria) this;
        }

        public Criteria andFoUpdateEqualTo(String value) {
            addCriterion("fo_update =", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateNotEqualTo(String value) {
            addCriterion("fo_update <>", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateGreaterThan(String value) {
            addCriterion("fo_update >", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("fo_update >=", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateLessThan(String value) {
            addCriterion("fo_update <", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateLessThanOrEqualTo(String value) {
            addCriterion("fo_update <=", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateLike(String value) {
            addCriterion("fo_update like", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateNotLike(String value) {
            addCriterion("fo_update not like", value, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateIn(List<String> values) {
            addCriterion("fo_update in", values, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateNotIn(List<String> values) {
            addCriterion("fo_update not in", values, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateBetween(String value1, String value2) {
            addCriterion("fo_update between", value1, value2, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdateNotBetween(String value1, String value2) {
            addCriterion("fo_update not between", value1, value2, "foUpdate");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeIsNull() {
            addCriterion("fo_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeIsNotNull() {
            addCriterion("fo_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("fo_updatetime =", value, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("fo_updatetime <>", value, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("fo_updatetime >", value, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_updatetime >=", value, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("fo_updatetime <", value, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fo_updatetime <=", value, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("fo_updatetime in", values, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("fo_updatetime not in", values, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_updatetime between", value1, value2, "foUpdatetime");
            return (Criteria) this;
        }

        public Criteria andFoUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fo_updatetime not between", value1, value2, "foUpdatetime");
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