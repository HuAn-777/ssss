package com.xuecheng.xcservicemanagecourse.pojo;

import java.util.ArrayList;
import java.util.List;

public class CourseBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CourseBaseExample() {
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

        public Criteria andUsersIsNull() {
            addCriterion("users is null");
            return (Criteria) this;
        }

        public Criteria andUsersIsNotNull() {
            addCriterion("users is not null");
            return (Criteria) this;
        }

        public Criteria andUsersEqualTo(String value) {
            addCriterion("users =", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotEqualTo(String value) {
            addCriterion("users <>", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersGreaterThan(String value) {
            addCriterion("users >", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersGreaterThanOrEqualTo(String value) {
            addCriterion("users >=", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLessThan(String value) {
            addCriterion("users <", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLessThanOrEqualTo(String value) {
            addCriterion("users <=", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersLike(String value) {
            addCriterion("users like", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotLike(String value) {
            addCriterion("users not like", value, "users");
            return (Criteria) this;
        }

        public Criteria andUsersIn(List<String> values) {
            addCriterion("users in", values, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotIn(List<String> values) {
            addCriterion("users not in", values, "users");
            return (Criteria) this;
        }

        public Criteria andUsersBetween(String value1, String value2) {
            addCriterion("users between", value1, value2, "users");
            return (Criteria) this;
        }

        public Criteria andUsersNotBetween(String value1, String value2) {
            addCriterion("users not between", value1, value2, "users");
            return (Criteria) this;
        }

        public Criteria andMtIsNull() {
            addCriterion("mt is null");
            return (Criteria) this;
        }

        public Criteria andMtIsNotNull() {
            addCriterion("mt is not null");
            return (Criteria) this;
        }

        public Criteria andMtEqualTo(String value) {
            addCriterion("mt =", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtNotEqualTo(String value) {
            addCriterion("mt <>", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtGreaterThan(String value) {
            addCriterion("mt >", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtGreaterThanOrEqualTo(String value) {
            addCriterion("mt >=", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtLessThan(String value) {
            addCriterion("mt <", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtLessThanOrEqualTo(String value) {
            addCriterion("mt <=", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtLike(String value) {
            addCriterion("mt like", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtNotLike(String value) {
            addCriterion("mt not like", value, "mt");
            return (Criteria) this;
        }

        public Criteria andMtIn(List<String> values) {
            addCriterion("mt in", values, "mt");
            return (Criteria) this;
        }

        public Criteria andMtNotIn(List<String> values) {
            addCriterion("mt not in", values, "mt");
            return (Criteria) this;
        }

        public Criteria andMtBetween(String value1, String value2) {
            addCriterion("mt between", value1, value2, "mt");
            return (Criteria) this;
        }

        public Criteria andMtNotBetween(String value1, String value2) {
            addCriterion("mt not between", value1, value2, "mt");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(String value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(String value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(String value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(String value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(String value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(String value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLike(String value) {
            addCriterion("grade like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotLike(String value) {
            addCriterion("grade not like", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<String> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<String> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(String value1, String value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(String value1, String value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andStudymodelIsNull() {
            addCriterion("studymodel is null");
            return (Criteria) this;
        }

        public Criteria andStudymodelIsNotNull() {
            addCriterion("studymodel is not null");
            return (Criteria) this;
        }

        public Criteria andStudymodelEqualTo(String value) {
            addCriterion("studymodel =", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelNotEqualTo(String value) {
            addCriterion("studymodel <>", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelGreaterThan(String value) {
            addCriterion("studymodel >", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelGreaterThanOrEqualTo(String value) {
            addCriterion("studymodel >=", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelLessThan(String value) {
            addCriterion("studymodel <", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelLessThanOrEqualTo(String value) {
            addCriterion("studymodel <=", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelLike(String value) {
            addCriterion("studymodel like", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelNotLike(String value) {
            addCriterion("studymodel not like", value, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelIn(List<String> values) {
            addCriterion("studymodel in", values, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelNotIn(List<String> values) {
            addCriterion("studymodel not in", values, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelBetween(String value1, String value2) {
            addCriterion("studymodel between", value1, value2, "studymodel");
            return (Criteria) this;
        }

        public Criteria andStudymodelNotBetween(String value1, String value2) {
            addCriterion("studymodel not between", value1, value2, "studymodel");
            return (Criteria) this;
        }

        public Criteria andTeachmodeIsNull() {
            addCriterion("teachmode is null");
            return (Criteria) this;
        }

        public Criteria andTeachmodeIsNotNull() {
            addCriterion("teachmode is not null");
            return (Criteria) this;
        }

        public Criteria andTeachmodeEqualTo(String value) {
            addCriterion("teachmode =", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeNotEqualTo(String value) {
            addCriterion("teachmode <>", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeGreaterThan(String value) {
            addCriterion("teachmode >", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeGreaterThanOrEqualTo(String value) {
            addCriterion("teachmode >=", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeLessThan(String value) {
            addCriterion("teachmode <", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeLessThanOrEqualTo(String value) {
            addCriterion("teachmode <=", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeLike(String value) {
            addCriterion("teachmode like", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeNotLike(String value) {
            addCriterion("teachmode not like", value, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeIn(List<String> values) {
            addCriterion("teachmode in", values, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeNotIn(List<String> values) {
            addCriterion("teachmode not in", values, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeBetween(String value1, String value2) {
            addCriterion("teachmode between", value1, value2, "teachmode");
            return (Criteria) this;
        }

        public Criteria andTeachmodeNotBetween(String value1, String value2) {
            addCriterion("teachmode not between", value1, value2, "teachmode");
            return (Criteria) this;
        }

        public Criteria andStIsNull() {
            addCriterion("st is null");
            return (Criteria) this;
        }

        public Criteria andStIsNotNull() {
            addCriterion("st is not null");
            return (Criteria) this;
        }

        public Criteria andStEqualTo(String value) {
            addCriterion("st =", value, "st");
            return (Criteria) this;
        }

        public Criteria andStNotEqualTo(String value) {
            addCriterion("st <>", value, "st");
            return (Criteria) this;
        }

        public Criteria andStGreaterThan(String value) {
            addCriterion("st >", value, "st");
            return (Criteria) this;
        }

        public Criteria andStGreaterThanOrEqualTo(String value) {
            addCriterion("st >=", value, "st");
            return (Criteria) this;
        }

        public Criteria andStLessThan(String value) {
            addCriterion("st <", value, "st");
            return (Criteria) this;
        }

        public Criteria andStLessThanOrEqualTo(String value) {
            addCriterion("st <=", value, "st");
            return (Criteria) this;
        }

        public Criteria andStLike(String value) {
            addCriterion("st like", value, "st");
            return (Criteria) this;
        }

        public Criteria andStNotLike(String value) {
            addCriterion("st not like", value, "st");
            return (Criteria) this;
        }

        public Criteria andStIn(List<String> values) {
            addCriterion("st in", values, "st");
            return (Criteria) this;
        }

        public Criteria andStNotIn(List<String> values) {
            addCriterion("st not in", values, "st");
            return (Criteria) this;
        }

        public Criteria andStBetween(String value1, String value2) {
            addCriterion("st between", value1, value2, "st");
            return (Criteria) this;
        }

        public Criteria andStNotBetween(String value1, String value2) {
            addCriterion("st not between", value1, value2, "st");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNull() {
            addCriterion("company_id is null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIsNotNull() {
            addCriterion("company_id is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyIdEqualTo(String value) {
            addCriterion("company_id =", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotEqualTo(String value) {
            addCriterion("company_id <>", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThan(String value) {
            addCriterion("company_id >", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdGreaterThanOrEqualTo(String value) {
            addCriterion("company_id >=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThan(String value) {
            addCriterion("company_id <", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLessThanOrEqualTo(String value) {
            addCriterion("company_id <=", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdLike(String value) {
            addCriterion("company_id like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotLike(String value) {
            addCriterion("company_id not like", value, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdIn(List<String> values) {
            addCriterion("company_id in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotIn(List<String> values) {
            addCriterion("company_id not in", values, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdBetween(String value1, String value2) {
            addCriterion("company_id between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andCompanyIdNotBetween(String value1, String value2) {
            addCriterion("company_id not between", value1, value2, "companyId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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