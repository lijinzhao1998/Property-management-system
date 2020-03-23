package com.softwarefirst.communitymannger.ssm.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class NoticeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public NoticeExample() {
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

        public Criteria andNoNumberIsNull() {
            addCriterion("no_number is null");
            return (Criteria) this;
        }

        public Criteria andNoNumberIsNotNull() {
            addCriterion("no_number is not null");
            return (Criteria) this;
        }

        public Criteria andNoNumberEqualTo(String value) {
            addCriterion("no_number =", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberNotEqualTo(String value) {
            addCriterion("no_number <>", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberGreaterThan(String value) {
            addCriterion("no_number >", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberGreaterThanOrEqualTo(String value) {
            addCriterion("no_number >=", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberLessThan(String value) {
            addCriterion("no_number <", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberLessThanOrEqualTo(String value) {
            addCriterion("no_number <=", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberLike(String value) {
            addCriterion("no_number like", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberNotLike(String value) {
            addCriterion("no_number not like", value, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberIn(List<String> values) {
            addCriterion("no_number in", values, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberNotIn(List<String> values) {
            addCriterion("no_number not in", values, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberBetween(String value1, String value2) {
            addCriterion("no_number between", value1, value2, "noNumber");
            return (Criteria) this;
        }

        public Criteria andNoNumberNotBetween(String value1, String value2) {
            addCriterion("no_number not between", value1, value2, "noNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberIsNull() {
            addCriterion("adm_number is null");
            return (Criteria) this;
        }

        public Criteria andAdmNumberIsNotNull() {
            addCriterion("adm_number is not null");
            return (Criteria) this;
        }

        public Criteria andAdmNumberEqualTo(String value) {
            addCriterion("adm_number =", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberNotEqualTo(String value) {
            addCriterion("adm_number <>", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberGreaterThan(String value) {
            addCriterion("adm_number >", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberGreaterThanOrEqualTo(String value) {
            addCriterion("adm_number >=", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberLessThan(String value) {
            addCriterion("adm_number <", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberLessThanOrEqualTo(String value) {
            addCriterion("adm_number <=", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberLike(String value) {
            addCriterion("adm_number like", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberNotLike(String value) {
            addCriterion("adm_number not like", value, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberIn(List<String> values) {
            addCriterion("adm_number in", values, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberNotIn(List<String> values) {
            addCriterion("adm_number not in", values, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberBetween(String value1, String value2) {
            addCriterion("adm_number between", value1, value2, "admNumber");
            return (Criteria) this;
        }

        public Criteria andAdmNumberNotBetween(String value1, String value2) {
            addCriterion("adm_number not between", value1, value2, "admNumber");
            return (Criteria) this;
        }

        public Criteria andNoTitleIsNull() {
            addCriterion("no_title is null");
            return (Criteria) this;
        }

        public Criteria andNoTitleIsNotNull() {
            addCriterion("no_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoTitleEqualTo(String value) {
            addCriterion("no_title =", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotEqualTo(String value) {
            addCriterion("no_title <>", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleGreaterThan(String value) {
            addCriterion("no_title >", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleGreaterThanOrEqualTo(String value) {
            addCriterion("no_title >=", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleLessThan(String value) {
            addCriterion("no_title <", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleLessThanOrEqualTo(String value) {
            addCriterion("no_title <=", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleLike(String value) {
            addCriterion("no_title like", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotLike(String value) {
            addCriterion("no_title not like", value, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleIn(List<String> values) {
            addCriterion("no_title in", values, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotIn(List<String> values) {
            addCriterion("no_title not in", values, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleBetween(String value1, String value2) {
            addCriterion("no_title between", value1, value2, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoTitleNotBetween(String value1, String value2) {
            addCriterion("no_title not between", value1, value2, "noTitle");
            return (Criteria) this;
        }

        public Criteria andNoDetailsIsNull() {
            addCriterion("no_details is null");
            return (Criteria) this;
        }

        public Criteria andNoDetailsIsNotNull() {
            addCriterion("no_details is not null");
            return (Criteria) this;
        }

        public Criteria andNoDetailsEqualTo(String value) {
            addCriterion("no_details =", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsNotEqualTo(String value) {
            addCriterion("no_details <>", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsGreaterThan(String value) {
            addCriterion("no_details >", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsGreaterThanOrEqualTo(String value) {
            addCriterion("no_details >=", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsLessThan(String value) {
            addCriterion("no_details <", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsLessThanOrEqualTo(String value) {
            addCriterion("no_details <=", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsLike(String value) {
            addCriterion("no_details like", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsNotLike(String value) {
            addCriterion("no_details not like", value, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsIn(List<String> values) {
            addCriterion("no_details in", values, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsNotIn(List<String> values) {
            addCriterion("no_details not in", values, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsBetween(String value1, String value2) {
            addCriterion("no_details between", value1, value2, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoDetailsNotBetween(String value1, String value2) {
            addCriterion("no_details not between", value1, value2, "noDetails");
            return (Criteria) this;
        }

        public Criteria andNoPtimeIsNull() {
            addCriterion("no_ptime is null");
            return (Criteria) this;
        }

        public Criteria andNoPtimeIsNotNull() {
            addCriterion("no_ptime is not null");
            return (Criteria) this;
        }

        public Criteria andNoPtimeEqualTo(Date value) {
            addCriterionForJDBCDate("no_ptime =", value, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("no_ptime <>", value, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeGreaterThan(Date value) {
            addCriterionForJDBCDate("no_ptime >", value, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("no_ptime >=", value, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeLessThan(Date value) {
            addCriterionForJDBCDate("no_ptime <", value, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("no_ptime <=", value, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeIn(List<Date> values) {
            addCriterionForJDBCDate("no_ptime in", values, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("no_ptime not in", values, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("no_ptime between", value1, value2, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoPtimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("no_ptime not between", value1, value2, "noPtime");
            return (Criteria) this;
        }

        public Criteria andNoLoginIsNull() {
            addCriterion("no_login is null");
            return (Criteria) this;
        }

        public Criteria andNoLoginIsNotNull() {
            addCriterion("no_login is not null");
            return (Criteria) this;
        }

        public Criteria andNoLoginEqualTo(String value) {
            addCriterion("no_login =", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginNotEqualTo(String value) {
            addCriterion("no_login <>", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginGreaterThan(String value) {
            addCriterion("no_login >", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginGreaterThanOrEqualTo(String value) {
            addCriterion("no_login >=", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginLessThan(String value) {
            addCriterion("no_login <", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginLessThanOrEqualTo(String value) {
            addCriterion("no_login <=", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginLike(String value) {
            addCriterion("no_login like", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginNotLike(String value) {
            addCriterion("no_login not like", value, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginIn(List<String> values) {
            addCriterion("no_login in", values, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginNotIn(List<String> values) {
            addCriterion("no_login not in", values, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginBetween(String value1, String value2) {
            addCriterion("no_login between", value1, value2, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLoginNotBetween(String value1, String value2) {
            addCriterion("no_login not between", value1, value2, "noLogin");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeIsNull() {
            addCriterion("no_logintime is null");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeIsNotNull() {
            addCriterion("no_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("no_logintime =", value, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("no_logintime <>", value, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("no_logintime >", value, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("no_logintime >=", value, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("no_logintime <", value, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("no_logintime <=", value, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("no_logintime in", values, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("no_logintime not in", values, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("no_logintime between", value1, value2, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("no_logintime not between", value1, value2, "noLogintime");
            return (Criteria) this;
        }

        public Criteria andNoUpdateIsNull() {
            addCriterion("no_update is null");
            return (Criteria) this;
        }

        public Criteria andNoUpdateIsNotNull() {
            addCriterion("no_update is not null");
            return (Criteria) this;
        }

        public Criteria andNoUpdateEqualTo(String value) {
            addCriterion("no_update =", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateNotEqualTo(String value) {
            addCriterion("no_update <>", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateGreaterThan(String value) {
            addCriterion("no_update >", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("no_update >=", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateLessThan(String value) {
            addCriterion("no_update <", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateLessThanOrEqualTo(String value) {
            addCriterion("no_update <=", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateLike(String value) {
            addCriterion("no_update like", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateNotLike(String value) {
            addCriterion("no_update not like", value, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateIn(List<String> values) {
            addCriterion("no_update in", values, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateNotIn(List<String> values) {
            addCriterion("no_update not in", values, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateBetween(String value1, String value2) {
            addCriterion("no_update between", value1, value2, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdateNotBetween(String value1, String value2) {
            addCriterion("no_update not between", value1, value2, "noUpdate");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeIsNull() {
            addCriterion("no_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeIsNotNull() {
            addCriterion("no_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("no_updatetime =", value, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("no_updatetime <>", value, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("no_updatetime >", value, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("no_updatetime >=", value, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("no_updatetime <", value, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("no_updatetime <=", value, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("no_updatetime in", values, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("no_updatetime not in", values, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("no_updatetime between", value1, value2, "noUpdatetime");
            return (Criteria) this;
        }

        public Criteria andNoUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("no_updatetime not between", value1, value2, "noUpdatetime");
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