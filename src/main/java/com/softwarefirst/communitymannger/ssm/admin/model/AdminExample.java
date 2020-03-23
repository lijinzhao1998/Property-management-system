package com.softwarefirst.communitymannger.ssm.admin.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public AdminExample() {
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

        public Criteria andAdmPasswordIsNull() {
            addCriterion("adm_password is null");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordIsNotNull() {
            addCriterion("adm_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordEqualTo(String value) {
            addCriterion("adm_password =", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotEqualTo(String value) {
            addCriterion("adm_password <>", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordGreaterThan(String value) {
            addCriterion("adm_password >", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("adm_password >=", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLessThan(String value) {
            addCriterion("adm_password <", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLessThanOrEqualTo(String value) {
            addCriterion("adm_password <=", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordLike(String value) {
            addCriterion("adm_password like", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotLike(String value) {
            addCriterion("adm_password not like", value, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordIn(List<String> values) {
            addCriterion("adm_password in", values, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotIn(List<String> values) {
            addCriterion("adm_password not in", values, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordBetween(String value1, String value2) {
            addCriterion("adm_password between", value1, value2, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmPasswordNotBetween(String value1, String value2) {
            addCriterion("adm_password not between", value1, value2, "admPassword");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameIsNull() {
            addCriterion("adm_username is null");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameIsNotNull() {
            addCriterion("adm_username is not null");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameEqualTo(String value) {
            addCriterion("adm_username =", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotEqualTo(String value) {
            addCriterion("adm_username <>", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameGreaterThan(String value) {
            addCriterion("adm_username >", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("adm_username >=", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameLessThan(String value) {
            addCriterion("adm_username <", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameLessThanOrEqualTo(String value) {
            addCriterion("adm_username <=", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameLike(String value) {
            addCriterion("adm_username like", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotLike(String value) {
            addCriterion("adm_username not like", value, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameIn(List<String> values) {
            addCriterion("adm_username in", values, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotIn(List<String> values) {
            addCriterion("adm_username not in", values, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameBetween(String value1, String value2) {
            addCriterion("adm_username between", value1, value2, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmUsernameNotBetween(String value1, String value2) {
            addCriterion("adm_username not between", value1, value2, "admUsername");
            return (Criteria) this;
        }

        public Criteria andAdmVnameIsNull() {
            addCriterion("adm_vname is null");
            return (Criteria) this;
        }

        public Criteria andAdmVnameIsNotNull() {
            addCriterion("adm_vname is not null");
            return (Criteria) this;
        }

        public Criteria andAdmVnameEqualTo(String value) {
            addCriterion("adm_vname =", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameNotEqualTo(String value) {
            addCriterion("adm_vname <>", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameGreaterThan(String value) {
            addCriterion("adm_vname >", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameGreaterThanOrEqualTo(String value) {
            addCriterion("adm_vname >=", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameLessThan(String value) {
            addCriterion("adm_vname <", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameLessThanOrEqualTo(String value) {
            addCriterion("adm_vname <=", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameLike(String value) {
            addCriterion("adm_vname like", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameNotLike(String value) {
            addCriterion("adm_vname not like", value, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameIn(List<String> values) {
            addCriterion("adm_vname in", values, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameNotIn(List<String> values) {
            addCriterion("adm_vname not in", values, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameBetween(String value1, String value2) {
            addCriterion("adm_vname between", value1, value2, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmVnameNotBetween(String value1, String value2) {
            addCriterion("adm_vname not between", value1, value2, "admVname");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberIsNull() {
            addCriterion("adm_jobnumber is null");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberIsNotNull() {
            addCriterion("adm_jobnumber is not null");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberEqualTo(String value) {
            addCriterion("adm_jobnumber =", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberNotEqualTo(String value) {
            addCriterion("adm_jobnumber <>", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberGreaterThan(String value) {
            addCriterion("adm_jobnumber >", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberGreaterThanOrEqualTo(String value) {
            addCriterion("adm_jobnumber >=", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberLessThan(String value) {
            addCriterion("adm_jobnumber <", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberLessThanOrEqualTo(String value) {
            addCriterion("adm_jobnumber <=", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberLike(String value) {
            addCriterion("adm_jobnumber like", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberNotLike(String value) {
            addCriterion("adm_jobnumber not like", value, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberIn(List<String> values) {
            addCriterion("adm_jobnumber in", values, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberNotIn(List<String> values) {
            addCriterion("adm_jobnumber not in", values, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberBetween(String value1, String value2) {
            addCriterion("adm_jobnumber between", value1, value2, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmJobnumberNotBetween(String value1, String value2) {
            addCriterion("adm_jobnumber not between", value1, value2, "admJobnumber");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameIsNull() {
            addCriterion("adm_realname is null");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameIsNotNull() {
            addCriterion("adm_realname is not null");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameEqualTo(String value) {
            addCriterion("adm_realname =", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameNotEqualTo(String value) {
            addCriterion("adm_realname <>", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameGreaterThan(String value) {
            addCriterion("adm_realname >", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameGreaterThanOrEqualTo(String value) {
            addCriterion("adm_realname >=", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameLessThan(String value) {
            addCriterion("adm_realname <", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameLessThanOrEqualTo(String value) {
            addCriterion("adm_realname <=", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameLike(String value) {
            addCriterion("adm_realname like", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameNotLike(String value) {
            addCriterion("adm_realname not like", value, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameIn(List<String> values) {
            addCriterion("adm_realname in", values, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameNotIn(List<String> values) {
            addCriterion("adm_realname not in", values, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameBetween(String value1, String value2) {
            addCriterion("adm_realname between", value1, value2, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmRealnameNotBetween(String value1, String value2) {
            addCriterion("adm_realname not between", value1, value2, "admRealname");
            return (Criteria) this;
        }

        public Criteria andAdmSexIsNull() {
            addCriterion("adm_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdmSexIsNotNull() {
            addCriterion("adm_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdmSexEqualTo(String value) {
            addCriterion("adm_sex =", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotEqualTo(String value) {
            addCriterion("adm_sex <>", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexGreaterThan(String value) {
            addCriterion("adm_sex >", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexGreaterThanOrEqualTo(String value) {
            addCriterion("adm_sex >=", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexLessThan(String value) {
            addCriterion("adm_sex <", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexLessThanOrEqualTo(String value) {
            addCriterion("adm_sex <=", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexLike(String value) {
            addCriterion("adm_sex like", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotLike(String value) {
            addCriterion("adm_sex not like", value, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexIn(List<String> values) {
            addCriterion("adm_sex in", values, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotIn(List<String> values) {
            addCriterion("adm_sex not in", values, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexBetween(String value1, String value2) {
            addCriterion("adm_sex between", value1, value2, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmSexNotBetween(String value1, String value2) {
            addCriterion("adm_sex not between", value1, value2, "admSex");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneIsNull() {
            addCriterion("adm_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneIsNotNull() {
            addCriterion("adm_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneEqualTo(String value) {
            addCriterion("adm_phone =", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotEqualTo(String value) {
            addCriterion("adm_phone <>", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneGreaterThan(String value) {
            addCriterion("adm_phone >", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("adm_phone >=", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneLessThan(String value) {
            addCriterion("adm_phone <", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneLessThanOrEqualTo(String value) {
            addCriterion("adm_phone <=", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneLike(String value) {
            addCriterion("adm_phone like", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotLike(String value) {
            addCriterion("adm_phone not like", value, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneIn(List<String> values) {
            addCriterion("adm_phone in", values, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotIn(List<String> values) {
            addCriterion("adm_phone not in", values, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneBetween(String value1, String value2) {
            addCriterion("adm_phone between", value1, value2, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmPhoneNotBetween(String value1, String value2) {
            addCriterion("adm_phone not between", value1, value2, "admPhone");
            return (Criteria) this;
        }

        public Criteria andAdmLoginIsNull() {
            addCriterion("adm_login is null");
            return (Criteria) this;
        }

        public Criteria andAdmLoginIsNotNull() {
            addCriterion("adm_login is not null");
            return (Criteria) this;
        }

        public Criteria andAdmLoginEqualTo(String value) {
            addCriterion("adm_login =", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginNotEqualTo(String value) {
            addCriterion("adm_login <>", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginGreaterThan(String value) {
            addCriterion("adm_login >", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginGreaterThanOrEqualTo(String value) {
            addCriterion("adm_login >=", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginLessThan(String value) {
            addCriterion("adm_login <", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginLessThanOrEqualTo(String value) {
            addCriterion("adm_login <=", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginLike(String value) {
            addCriterion("adm_login like", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginNotLike(String value) {
            addCriterion("adm_login not like", value, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginIn(List<String> values) {
            addCriterion("adm_login in", values, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginNotIn(List<String> values) {
            addCriterion("adm_login not in", values, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginBetween(String value1, String value2) {
            addCriterion("adm_login between", value1, value2, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLoginNotBetween(String value1, String value2) {
            addCriterion("adm_login not between", value1, value2, "admLogin");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeIsNull() {
            addCriterion("adm_logintime is null");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeIsNotNull() {
            addCriterion("adm_logintime is not null");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeEqualTo(Date value) {
            addCriterionForJDBCDate("adm_logintime =", value, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("adm_logintime <>", value, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeGreaterThan(Date value) {
            addCriterionForJDBCDate("adm_logintime >", value, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adm_logintime >=", value, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeLessThan(Date value) {
            addCriterionForJDBCDate("adm_logintime <", value, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adm_logintime <=", value, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeIn(List<Date> values) {
            addCriterionForJDBCDate("adm_logintime in", values, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("adm_logintime not in", values, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adm_logintime between", value1, value2, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmLogintimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adm_logintime not between", value1, value2, "admLogintime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateIsNull() {
            addCriterion("adm_update is null");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateIsNotNull() {
            addCriterion("adm_update is not null");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateEqualTo(String value) {
            addCriterion("adm_update =", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateNotEqualTo(String value) {
            addCriterion("adm_update <>", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateGreaterThan(String value) {
            addCriterion("adm_update >", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateGreaterThanOrEqualTo(String value) {
            addCriterion("adm_update >=", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateLessThan(String value) {
            addCriterion("adm_update <", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateLessThanOrEqualTo(String value) {
            addCriterion("adm_update <=", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateLike(String value) {
            addCriterion("adm_update like", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateNotLike(String value) {
            addCriterion("adm_update not like", value, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateIn(List<String> values) {
            addCriterion("adm_update in", values, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateNotIn(List<String> values) {
            addCriterion("adm_update not in", values, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateBetween(String value1, String value2) {
            addCriterion("adm_update between", value1, value2, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdateNotBetween(String value1, String value2) {
            addCriterion("adm_update not between", value1, value2, "admUpdate");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeIsNull() {
            addCriterion("adm_updatetime is null");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeIsNotNull() {
            addCriterion("adm_updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeEqualTo(Date value) {
            addCriterionForJDBCDate("adm_updatetime =", value, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("adm_updatetime <>", value, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeGreaterThan(Date value) {
            addCriterionForJDBCDate("adm_updatetime >", value, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adm_updatetime >=", value, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeLessThan(Date value) {
            addCriterionForJDBCDate("adm_updatetime <", value, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("adm_updatetime <=", value, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeIn(List<Date> values) {
            addCriterionForJDBCDate("adm_updatetime in", values, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("adm_updatetime not in", values, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adm_updatetime between", value1, value2, "admUpdatetime");
            return (Criteria) this;
        }

        public Criteria andAdmUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("adm_updatetime not between", value1, value2, "admUpdatetime");
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