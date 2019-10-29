package com.xuecheng.xcservicemanagecourse.pojo;

import java.util.ArrayList;
import java.util.List;

public class TeachplanMediaExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TeachplanMediaExample() {
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

        public Criteria andTeachplanIdIsNull() {
            addCriterion("teachplan_id is null");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdIsNotNull() {
            addCriterion("teachplan_id is not null");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdEqualTo(String value) {
            addCriterion("teachplan_id =", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdNotEqualTo(String value) {
            addCriterion("teachplan_id <>", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdGreaterThan(String value) {
            addCriterion("teachplan_id >", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdGreaterThanOrEqualTo(String value) {
            addCriterion("teachplan_id >=", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdLessThan(String value) {
            addCriterion("teachplan_id <", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdLessThanOrEqualTo(String value) {
            addCriterion("teachplan_id <=", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdLike(String value) {
            addCriterion("teachplan_id like", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdNotLike(String value) {
            addCriterion("teachplan_id not like", value, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdIn(List<String> values) {
            addCriterion("teachplan_id in", values, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdNotIn(List<String> values) {
            addCriterion("teachplan_id not in", values, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdBetween(String value1, String value2) {
            addCriterion("teachplan_id between", value1, value2, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andTeachplanIdNotBetween(String value1, String value2) {
            addCriterion("teachplan_id not between", value1, value2, "teachplanId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNull() {
            addCriterion("media_id is null");
            return (Criteria) this;
        }

        public Criteria andMediaIdIsNotNull() {
            addCriterion("media_id is not null");
            return (Criteria) this;
        }

        public Criteria andMediaIdEqualTo(String value) {
            addCriterion("media_id =", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotEqualTo(String value) {
            addCriterion("media_id <>", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThan(String value) {
            addCriterion("media_id >", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdGreaterThanOrEqualTo(String value) {
            addCriterion("media_id >=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThan(String value) {
            addCriterion("media_id <", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLessThanOrEqualTo(String value) {
            addCriterion("media_id <=", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdLike(String value) {
            addCriterion("media_id like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotLike(String value) {
            addCriterion("media_id not like", value, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdIn(List<String> values) {
            addCriterion("media_id in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotIn(List<String> values) {
            addCriterion("media_id not in", values, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdBetween(String value1, String value2) {
            addCriterion("media_id between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaIdNotBetween(String value1, String value2) {
            addCriterion("media_id not between", value1, value2, "mediaId");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameIsNull() {
            addCriterion("media_fileoriginalname is null");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameIsNotNull() {
            addCriterion("media_fileoriginalname is not null");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameEqualTo(String value) {
            addCriterion("media_fileoriginalname =", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameNotEqualTo(String value) {
            addCriterion("media_fileoriginalname <>", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameGreaterThan(String value) {
            addCriterion("media_fileoriginalname >", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameGreaterThanOrEqualTo(String value) {
            addCriterion("media_fileoriginalname >=", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameLessThan(String value) {
            addCriterion("media_fileoriginalname <", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameLessThanOrEqualTo(String value) {
            addCriterion("media_fileoriginalname <=", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameLike(String value) {
            addCriterion("media_fileoriginalname like", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameNotLike(String value) {
            addCriterion("media_fileoriginalname not like", value, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameIn(List<String> values) {
            addCriterion("media_fileoriginalname in", values, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameNotIn(List<String> values) {
            addCriterion("media_fileoriginalname not in", values, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameBetween(String value1, String value2) {
            addCriterion("media_fileoriginalname between", value1, value2, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaFileoriginalnameNotBetween(String value1, String value2) {
            addCriterion("media_fileoriginalname not between", value1, value2, "mediaFileoriginalname");
            return (Criteria) this;
        }

        public Criteria andMediaUrlIsNull() {
            addCriterion("media_url is null");
            return (Criteria) this;
        }

        public Criteria andMediaUrlIsNotNull() {
            addCriterion("media_url is not null");
            return (Criteria) this;
        }

        public Criteria andMediaUrlEqualTo(String value) {
            addCriterion("media_url =", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlNotEqualTo(String value) {
            addCriterion("media_url <>", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlGreaterThan(String value) {
            addCriterion("media_url >", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlGreaterThanOrEqualTo(String value) {
            addCriterion("media_url >=", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlLessThan(String value) {
            addCriterion("media_url <", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlLessThanOrEqualTo(String value) {
            addCriterion("media_url <=", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlLike(String value) {
            addCriterion("media_url like", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlNotLike(String value) {
            addCriterion("media_url not like", value, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlIn(List<String> values) {
            addCriterion("media_url in", values, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlNotIn(List<String> values) {
            addCriterion("media_url not in", values, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlBetween(String value1, String value2) {
            addCriterion("media_url between", value1, value2, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andMediaUrlNotBetween(String value1, String value2) {
            addCriterion("media_url not between", value1, value2, "mediaUrl");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNull() {
            addCriterion("courseid is null");
            return (Criteria) this;
        }

        public Criteria andCourseidIsNotNull() {
            addCriterion("courseid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseidEqualTo(String value) {
            addCriterion("courseid =", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotEqualTo(String value) {
            addCriterion("courseid <>", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThan(String value) {
            addCriterion("courseid >", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidGreaterThanOrEqualTo(String value) {
            addCriterion("courseid >=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThan(String value) {
            addCriterion("courseid <", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLessThanOrEqualTo(String value) {
            addCriterion("courseid <=", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidLike(String value) {
            addCriterion("courseid like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotLike(String value) {
            addCriterion("courseid not like", value, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidIn(List<String> values) {
            addCriterion("courseid in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotIn(List<String> values) {
            addCriterion("courseid not in", values, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidBetween(String value1, String value2) {
            addCriterion("courseid between", value1, value2, "courseid");
            return (Criteria) this;
        }

        public Criteria andCourseidNotBetween(String value1, String value2) {
            addCriterion("courseid not between", value1, value2, "courseid");
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