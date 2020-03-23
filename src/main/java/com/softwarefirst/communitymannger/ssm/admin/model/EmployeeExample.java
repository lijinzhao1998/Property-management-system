package com.softwarefirst.communitymannger.ssm.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class EmployeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public EmployeeExample() {
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

        public Criteria andEmSexIsNull() {
            addCriterion("em_sex is null");
            return (Criteria) this;
        }

        public Criteria andEmSexIsNotNull() {
            addCriterion("em_sex is not null");
            return (Criteria) this;
        }

        public Criteria andEmSexEqualTo(String value) {
            addCriterion("em_sex =", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotEqualTo(String value) {
            addCriterion("em_sex <>", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexGreaterThan(String value) {
            addCriterion("em_sex >", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexGreaterThanOrEqualTo(String value) {
            addCriterion("em_sex >=", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexLessThan(String value) {
            addCriterion("em_sex <", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexLessThanOrEqualTo(String value) {
            addCriterion("em_sex <=", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexLike(String value) {
            addCriterion("em_sex like", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotLike(String value) {
            addCriterion("em_sex not like", value, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexIn(List<String> values) {
            addCriterion("em_sex in", values, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotIn(List<String> values) {
            addCriterion("em_sex not in", values, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexBetween(String value1, String value2) {
            addCriterion("em_sex between", value1, value2, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmSexNotBetween(String value1, String value2) {
            addCriterion("em_sex not between", value1, value2, "emSex");
            return (Criteria) this;
        }

        public Criteria andEmPhoneIsNull() {
            addCriterion("em_phone is null");
            return (Criteria) this;
        }

        public Criteria andEmPhoneIsNotNull() {
            addCriterion("em_phone is not null");
            return (Criteria) this;
        }

        public Criteria andEmPhoneEqualTo(String value) {
            addCriterion("em_phone =", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotEqualTo(String value) {
            addCriterion("em_phone <>", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneGreaterThan(String value) {
            addCriterion("em_phone >", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("em_phone >=", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneLessThan(String value) {
            addCriterion("em_phone <", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneLessThanOrEqualTo(String value) {
            addCriterion("em_phone <=", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneLike(String value) {
            addCriterion("em_phone like", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotLike(String value) {
            addCriterion("em_phone not like", value, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneIn(List<String> values) {
            addCriterion("em_phone in", values, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotIn(List<String> values) {
            addCriterion("em_phone not in", values, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneBetween(String value1, String value2) {
            addCriterion("em_phone between", value1, value2, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmPhoneNotBetween(String value1, String value2) {
            addCriterion("em_phone not between", value1, value2, "emPhone");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNull() {
            addCriterion("em_name is null");
            return (Criteria) this;
        }

        public Criteria andEmNameIsNotNull() {
            addCriterion("em_name is not null");
            return (Criteria) this;
        }

        public Criteria andEmNameEqualTo(String value) {
            addCriterion("em_name =", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotEqualTo(String value) {
            addCriterion("em_name <>", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThan(String value) {
            addCriterion("em_name >", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameGreaterThanOrEqualTo(String value) {
            addCriterion("em_name >=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThan(String value) {
            addCriterion("em_name <", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLessThanOrEqualTo(String value) {
            addCriterion("em_name <=", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameLike(String value) {
            addCriterion("em_name like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotLike(String value) {
            addCriterion("em_name not like", value, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameIn(List<String> values) {
            addCriterion("em_name in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotIn(List<String> values) {
            addCriterion("em_name not in", values, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameBetween(String value1, String value2) {
            addCriterion("em_name between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andEmNameNotBetween(String value1, String value2) {
            addCriterion("em_name not between", value1, value2, "emName");
            return (Criteria) this;
        }

        public Criteria andEmPostIsNull() {
            addCriterion("em_post is null");
            return (Criteria) this;
        }

        public Criteria andEmPostIsNotNull() {
            addCriterion("em_post is not null");
            return (Criteria) this;
        }

        public Criteria andEmPostEqualTo(String value) {
            addCriterion("em_post =", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostNotEqualTo(String value) {
            addCriterion("em_post <>", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostGreaterThan(String value) {
            addCriterion("em_post >", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostGreaterThanOrEqualTo(String value) {
            addCriterion("em_post >=", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostLessThan(String value) {
            addCriterion("em_post <", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostLessThanOrEqualTo(String value) {
            addCriterion("em_post <=", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostLike(String value) {
            addCriterion("em_post like", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostNotLike(String value) {
            addCriterion("em_post not like", value, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostIn(List<String> values) {
            addCriterion("em_post in", values, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostNotIn(List<String> values) {
            addCriterion("em_post not in", values, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostBetween(String value1, String value2) {
            addCriterion("em_post between", value1, value2, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmPostNotBetween(String value1, String value2) {
            addCriterion("em_post not between", value1, value2, "emPost");
            return (Criteria) this;
        }

        public Criteria andEmLoginIsNull() {
            addCriterion("em_login is null");
            return (Criteria) this;
        }

        public Criteria andEmLoginIsNotNull() {
            addCriterion("em_login is not null");
            return (Criteria) this;
        }

        public Criteria andEmLoginEqualTo(String value) {
            addCriterion("em_login =", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginNotEqualTo(String value) {
            addCriterion("em_login <>", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginGreaterThan(String value) {
            addCriterion("em_login >", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginGreaterThanOrEqualTo(String value) {
            addCriterion("em_login >=", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginLessThan(String value) {
            addCriterion("em_login <", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginLessThanOrEqualTo(String value) {
            addCriterion("em_login <=", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginLike(String value) {
            addCriterion("em_login like", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginNotLike(String value) {
            addCriterion("em_login not like", value, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginIn(List<String> values) {
            addCriterion("em_login in", values, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginNotIn(List<String> values) {
            addCriterion("em_login not in", values, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginBetween(String value1, String value2) {
            addCriterion("em_login between", value1, value2, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLoginNotBetween(String value1, String value2) {
            addCriterion("em_login not between", value1, value2, "emLogin");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeIsNull() {
            addCriterion("em_logintime is null");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeIsNotNull() {
            addCriterion("em_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("em_logintime =", value, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("em_logintime <>", value, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("em_logintime >", value, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("em_logintime >=", value, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("em_logintime <", value, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("em_logintime <=", value, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("em_logintime in", values, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("em_logintime not in", values, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("em_logintime between", value1, value2, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("em_logintime not between", value1, value2, "emLogintime");
            return (Criteria) this;
        }

        public Criteria andEmUpdateIsNull() {
            addCriterion("em_update is null");
            return (Criteria) this;
        }

        public Criteria andEmUpdateIsNotNull() {
            addCriterion("em_update is not null");
            return (Criteria) this;
        }

        public Criteria andEmUpdateEqualTo(String value) {
            addCriterion("em_update =", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateNotEqualTo(String value) {
            addCriterion("em_update <>", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateGreaterThan(String value) {
            addCriterion("em_update >", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("em_update >=", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateLessThan(String value) {
            addCriterion("em_update <", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateLessThanOrEqualTo(String value) {
            addCriterion("em_update <=", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateLike(String value) {
            addCriterion("em_update like", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateNotLike(String value) {
            addCriterion("em_update not like", value, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateIn(List<String> values) {
            addCriterion("em_update in", values, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateNotIn(List<String> values) {
            addCriterion("em_update not in", values, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateBetween(String value1, String value2) {
            addCriterion("em_update between", value1, value2, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdateNotBetween(String value1, String value2) {
            addCriterion("em_update not between", value1, value2, "emUpdate");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeIsNull() {
            addCriterion("em_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeIsNotNull() {
            addCriterion("em_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("em_updatetime =", value, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("em_updatetime <>", value, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("em_updatetime >", value, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("em_updatetime >=", value, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("em_updatetime <", value, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("em_updatetime <=", value, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("em_updatetime in", values, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("em_updatetime not in", values, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("em_updatetime between", value1, value2, "emUpdatetime");
            return (Criteria) this;
        }

        public Criteria andEmUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("em_updatetime not between", value1, value2, "emUpdatetime");
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