package com.softwarefirst.communitymannger.ssm.user.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OwnerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public OwnerExample() {
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

        public Criteria andOwNameIsNull() {
            addCriterion("ow_name is null");
            return (Criteria) this;
        }

        public Criteria andOwNameIsNotNull() {
            addCriterion("ow_name is not null");
            return (Criteria) this;
        }

        public Criteria andOwNameEqualTo(String value) {
            addCriterion("ow_name =", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameNotEqualTo(String value) {
            addCriterion("ow_name <>", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameGreaterThan(String value) {
            addCriterion("ow_name >", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameGreaterThanOrEqualTo(String value) {
            addCriterion("ow_name >=", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameLessThan(String value) {
            addCriterion("ow_name <", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameLessThanOrEqualTo(String value) {
            addCriterion("ow_name <=", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameLike(String value) {
            addCriterion("ow_name like", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameNotLike(String value) {
            addCriterion("ow_name not like", value, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameIn(List<String> values) {
            addCriterion("ow_name in", values, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameNotIn(List<String> values) {
            addCriterion("ow_name not in", values, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameBetween(String value1, String value2) {
            addCriterion("ow_name between", value1, value2, "owName");
            return (Criteria) this;
        }

        public Criteria andOwNameNotBetween(String value1, String value2) {
            addCriterion("ow_name not between", value1, value2, "owName");
            return (Criteria) this;
        }

        public Criteria andOwSexIsNull() {
            addCriterion("ow_sex is null");
            return (Criteria) this;
        }

        public Criteria andOwSexIsNotNull() {
            addCriterion("ow_sex is not null");
            return (Criteria) this;
        }

        public Criteria andOwSexEqualTo(String value) {
            addCriterion("ow_sex =", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexNotEqualTo(String value) {
            addCriterion("ow_sex <>", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexGreaterThan(String value) {
            addCriterion("ow_sex >", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexGreaterThanOrEqualTo(String value) {
            addCriterion("ow_sex >=", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexLessThan(String value) {
            addCriterion("ow_sex <", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexLessThanOrEqualTo(String value) {
            addCriterion("ow_sex <=", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexLike(String value) {
            addCriterion("ow_sex like", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexNotLike(String value) {
            addCriterion("ow_sex not like", value, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexIn(List<String> values) {
            addCriterion("ow_sex in", values, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexNotIn(List<String> values) {
            addCriterion("ow_sex not in", values, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexBetween(String value1, String value2) {
            addCriterion("ow_sex between", value1, value2, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwSexNotBetween(String value1, String value2) {
            addCriterion("ow_sex not between", value1, value2, "owSex");
            return (Criteria) this;
        }

        public Criteria andOwPhoneIsNull() {
            addCriterion("ow_phone is null");
            return (Criteria) this;
        }

        public Criteria andOwPhoneIsNotNull() {
            addCriterion("ow_phone is not null");
            return (Criteria) this;
        }

        public Criteria andOwPhoneEqualTo(String value) {
            addCriterion("ow_phone =", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneNotEqualTo(String value) {
            addCriterion("ow_phone <>", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneGreaterThan(String value) {
            addCriterion("ow_phone >", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("ow_phone >=", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneLessThan(String value) {
            addCriterion("ow_phone <", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneLessThanOrEqualTo(String value) {
            addCriterion("ow_phone <=", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneLike(String value) {
            addCriterion("ow_phone like", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneNotLike(String value) {
            addCriterion("ow_phone not like", value, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneIn(List<String> values) {
            addCriterion("ow_phone in", values, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneNotIn(List<String> values) {
            addCriterion("ow_phone not in", values, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneBetween(String value1, String value2) {
            addCriterion("ow_phone between", value1, value2, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwPhoneNotBetween(String value1, String value2) {
            addCriterion("ow_phone not between", value1, value2, "owPhone");
            return (Criteria) this;
        }

        public Criteria andOwLoginIsNull() {
            addCriterion("ow_login is null");
            return (Criteria) this;
        }

        public Criteria andOwLoginIsNotNull() {
            addCriterion("ow_login is not null");
            return (Criteria) this;
        }

        public Criteria andOwLoginEqualTo(String value) {
            addCriterion("ow_login =", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginNotEqualTo(String value) {
            addCriterion("ow_login <>", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginGreaterThan(String value) {
            addCriterion("ow_login >", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginGreaterThanOrEqualTo(String value) {
            addCriterion("ow_login >=", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginLessThan(String value) {
            addCriterion("ow_login <", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginLessThanOrEqualTo(String value) {
            addCriterion("ow_login <=", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginLike(String value) {
            addCriterion("ow_login like", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginNotLike(String value) {
            addCriterion("ow_login not like", value, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginIn(List<String> values) {
            addCriterion("ow_login in", values, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginNotIn(List<String> values) {
            addCriterion("ow_login not in", values, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginBetween(String value1, String value2) {
            addCriterion("ow_login between", value1, value2, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLoginNotBetween(String value1, String value2) {
            addCriterion("ow_login not between", value1, value2, "owLogin");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeIsNull() {
            addCriterion("ow_logintime is null");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeIsNotNull() {
            addCriterion("ow_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("ow_logintime =", value, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ow_logintime <>", value, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ow_logintime >", value, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ow_logintime >=", value, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("ow_logintime <", value, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ow_logintime <=", value, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("ow_logintime in", values, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ow_logintime not in", values, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ow_logintime between", value1, value2, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ow_logintime not between", value1, value2, "owLogintime");
            return (Criteria) this;
        }

        public Criteria andOwUpdateIsNull() {
            addCriterion("ow_update is null");
            return (Criteria) this;
        }

        public Criteria andOwUpdateIsNotNull() {
            addCriterion("ow_update is not null");
            return (Criteria) this;
        }

        public Criteria andOwUpdateEqualTo(String value) {
            addCriterion("ow_update =", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateNotEqualTo(String value) {
            addCriterion("ow_update <>", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateGreaterThan(String value) {
            addCriterion("ow_update >", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("ow_update >=", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateLessThan(String value) {
            addCriterion("ow_update <", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateLessThanOrEqualTo(String value) {
            addCriterion("ow_update <=", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateLike(String value) {
            addCriterion("ow_update like", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateNotLike(String value) {
            addCriterion("ow_update not like", value, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateIn(List<String> values) {
            addCriterion("ow_update in", values, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateNotIn(List<String> values) {
            addCriterion("ow_update not in", values, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateBetween(String value1, String value2) {
            addCriterion("ow_update between", value1, value2, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdateNotBetween(String value1, String value2) {
            addCriterion("ow_update not between", value1, value2, "owUpdate");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeIsNull() {
            addCriterion("ow_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeIsNotNull() {
            addCriterion("ow_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("ow_updatetime =", value, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("ow_updatetime <>", value, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("ow_updatetime >", value, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ow_updatetime >=", value, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("ow_updatetime <", value, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("ow_updatetime <=", value, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("ow_updatetime in", values, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("ow_updatetime not in", values, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ow_updatetime between", value1, value2, "owUpdatetime");
            return (Criteria) this;
        }

        public Criteria andOwUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("ow_updatetime not between", value1, value2, "owUpdatetime");
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