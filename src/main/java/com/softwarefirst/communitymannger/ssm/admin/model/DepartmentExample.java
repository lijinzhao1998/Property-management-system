package com.softwarefirst.communitymannger.ssm.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DepartmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public DepartmentExample() {
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

        public Criteria andDeNumberIsNull() {
            addCriterion("de_number is null");
            return (Criteria) this;
        }

        public Criteria andDeNumberIsNotNull() {
            addCriterion("de_number is not null");
            return (Criteria) this;
        }

        public Criteria andDeNumberEqualTo(String value) {
            addCriterion("de_number =", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberNotEqualTo(String value) {
            addCriterion("de_number <>", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberGreaterThan(String value) {
            addCriterion("de_number >", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberGreaterThanOrEqualTo(String value) {
            addCriterion("de_number >=", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberLessThan(String value) {
            addCriterion("de_number <", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberLessThanOrEqualTo(String value) {
            addCriterion("de_number <=", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberLike(String value) {
            addCriterion("de_number like", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberNotLike(String value) {
            addCriterion("de_number not like", value, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberIn(List<String> values) {
            addCriterion("de_number in", values, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberNotIn(List<String> values) {
            addCriterion("de_number not in", values, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberBetween(String value1, String value2) {
            addCriterion("de_number between", value1, value2, "deNumber");
            return (Criteria) this;
        }

        public Criteria andDeNumberNotBetween(String value1, String value2) {
            addCriterion("de_number not between", value1, value2, "deNumber");
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

        public Criteria andDeNameIsNull() {
            addCriterion("de_name is null");
            return (Criteria) this;
        }

        public Criteria andDeNameIsNotNull() {
            addCriterion("de_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeNameEqualTo(String value) {
            addCriterion("de_name =", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameNotEqualTo(String value) {
            addCriterion("de_name <>", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameGreaterThan(String value) {
            addCriterion("de_name >", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameGreaterThanOrEqualTo(String value) {
            addCriterion("de_name >=", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameLessThan(String value) {
            addCriterion("de_name <", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameLessThanOrEqualTo(String value) {
            addCriterion("de_name <=", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameLike(String value) {
            addCriterion("de_name like", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameNotLike(String value) {
            addCriterion("de_name not like", value, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameIn(List<String> values) {
            addCriterion("de_name in", values, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameNotIn(List<String> values) {
            addCriterion("de_name not in", values, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameBetween(String value1, String value2) {
            addCriterion("de_name between", value1, value2, "deName");
            return (Criteria) this;
        }

        public Criteria andDeNameNotBetween(String value1, String value2) {
            addCriterion("de_name not between", value1, value2, "deName");
            return (Criteria) this;
        }

        public Criteria andDePhoneIsNull() {
            addCriterion("de_phone is null");
            return (Criteria) this;
        }

        public Criteria andDePhoneIsNotNull() {
            addCriterion("de_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDePhoneEqualTo(String value) {
            addCriterion("de_phone =", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneNotEqualTo(String value) {
            addCriterion("de_phone <>", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneGreaterThan(String value) {
            addCriterion("de_phone >", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("de_phone >=", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneLessThan(String value) {
            addCriterion("de_phone <", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneLessThanOrEqualTo(String value) {
            addCriterion("de_phone <=", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneLike(String value) {
            addCriterion("de_phone like", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneNotLike(String value) {
            addCriterion("de_phone not like", value, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneIn(List<String> values) {
            addCriterion("de_phone in", values, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneNotIn(List<String> values) {
            addCriterion("de_phone not in", values, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneBetween(String value1, String value2) {
            addCriterion("de_phone between", value1, value2, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDePhoneNotBetween(String value1, String value2) {
            addCriterion("de_phone not between", value1, value2, "dePhone");
            return (Criteria) this;
        }

        public Criteria andDeLoginIsNull() {
            addCriterion("de_login is null");
            return (Criteria) this;
        }

        public Criteria andDeLoginIsNotNull() {
            addCriterion("de_login is not null");
            return (Criteria) this;
        }

        public Criteria andDeLoginEqualTo(String value) {
            addCriterion("de_login =", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginNotEqualTo(String value) {
            addCriterion("de_login <>", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginGreaterThan(String value) {
            addCriterion("de_login >", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginGreaterThanOrEqualTo(String value) {
            addCriterion("de_login >=", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginLessThan(String value) {
            addCriterion("de_login <", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginLessThanOrEqualTo(String value) {
            addCriterion("de_login <=", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginLike(String value) {
            addCriterion("de_login like", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginNotLike(String value) {
            addCriterion("de_login not like", value, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginIn(List<String> values) {
            addCriterion("de_login in", values, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginNotIn(List<String> values) {
            addCriterion("de_login not in", values, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginBetween(String value1, String value2) {
            addCriterion("de_login between", value1, value2, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLoginNotBetween(String value1, String value2) {
            addCriterion("de_login not between", value1, value2, "deLogin");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeIsNull() {
            addCriterion("de_logintime is null");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeIsNotNull() {
            addCriterion("de_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("de_logintime =", value, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("de_logintime <>", value, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("de_logintime >", value, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("de_logintime >=", value, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("de_logintime <", value, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("de_logintime <=", value, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("de_logintime in", values, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("de_logintime not in", values, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("de_logintime between", value1, value2, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("de_logintime not between", value1, value2, "deLogintime");
            return (Criteria) this;
        }

        public Criteria andDeUpdateIsNull() {
            addCriterion("de_update is null");
            return (Criteria) this;
        }

        public Criteria andDeUpdateIsNotNull() {
            addCriterion("de_update is not null");
            return (Criteria) this;
        }

        public Criteria andDeUpdateEqualTo(String value) {
            addCriterion("de_update =", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateNotEqualTo(String value) {
            addCriterion("de_update <>", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateGreaterThan(String value) {
            addCriterion("de_update >", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("de_update >=", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateLessThan(String value) {
            addCriterion("de_update <", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateLessThanOrEqualTo(String value) {
            addCriterion("de_update <=", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateLike(String value) {
            addCriterion("de_update like", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateNotLike(String value) {
            addCriterion("de_update not like", value, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateIn(List<String> values) {
            addCriterion("de_update in", values, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateNotIn(List<String> values) {
            addCriterion("de_update not in", values, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateBetween(String value1, String value2) {
            addCriterion("de_update between", value1, value2, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdateNotBetween(String value1, String value2) {
            addCriterion("de_update not between", value1, value2, "deUpdate");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeIsNull() {
            addCriterion("de_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeIsNotNull() {
            addCriterion("de_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("de_updatetime =", value, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("de_updatetime <>", value, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("de_updatetime >", value, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("de_updatetime >=", value, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("de_updatetime <", value, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("de_updatetime <=", value, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("de_updatetime in", values, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("de_updatetime not in", values, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("de_updatetime between", value1, value2, "deUpdatetime");
            return (Criteria) this;
        }

        public Criteria andDeUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("de_updatetime not between", value1, value2, "deUpdatetime");
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