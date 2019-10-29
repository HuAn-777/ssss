package com.xuecheng.xcservicemanagecourse.pojo;

public class CourseBase {
    private String id;

    private String name;

    private String users;

    private String mt;

    private String grade;

    private String studymodel;

    private String teachmode;

    private String st;

    private String status;

    private String companyId;

    private String userId;

    private String description;

    public CourseBase(String id, String name, String users, String mt, String grade, String studymodel, String teachmode, String st, String status, String companyId, String userId, String description) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.mt = mt;
        this.grade = grade;
        this.studymodel = studymodel;
        this.teachmode = teachmode;
        this.st = st;
        this.status = status;
        this.companyId = companyId;
        this.userId = userId;
        this.description = description;
    }

    public CourseBase() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users == null ? null : users.trim();
    }

    public String getMt() {
        return mt;
    }

    public void setMt(String mt) {
        this.mt = mt == null ? null : mt.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getStudymodel() {
        return studymodel;
    }

    public void setStudymodel(String studymodel) {
        this.studymodel = studymodel == null ? null : studymodel.trim();
    }

    public String getTeachmode() {
        return teachmode;
    }

    public void setTeachmode(String teachmode) {
        this.teachmode = teachmode == null ? null : teachmode.trim();
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st == null ? null : st.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId == null ? null : companyId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}