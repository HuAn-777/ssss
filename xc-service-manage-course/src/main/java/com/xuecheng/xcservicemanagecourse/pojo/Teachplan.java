package com.xuecheng.xcservicemanagecourse.pojo;

import org.springframework.stereotype.Component;


public class Teachplan {
    private String id;

    private String pname;

    private String parentid;

    private String grade;

    private String ptype;

    private String description;

    private Double timelength;

    private String courseid;

    private String orderby;

    private String status;

    private String trylearn;

    public Teachplan(String id, String pname, String parentid, String grade, String ptype, String description, Double timelength, String courseid, String orderby, String status, String trylearn) {
        this.id = id;
        this.pname = pname;
        this.parentid = parentid;
        this.grade = grade;
        this.ptype = ptype;
        this.description = description;
        this.timelength = timelength;
        this.courseid = courseid;
        this.orderby = orderby;
        this.status = status;
        this.trylearn = trylearn;
    }

    public Teachplan() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname == null ? null : pname.trim();
    }

    public String getParentid() {
        return parentid;
    }

    public void setParentid(String parentid) {
        this.parentid = parentid == null ? null : parentid.trim();
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade == null ? null : grade.trim();
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype == null ? null : ptype.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Double getTimelength() {
        return timelength;
    }

    public void setTimelength(Double timelength) {
        this.timelength = timelength;
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby == null ? null : orderby.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTrylearn() {
        return trylearn;
    }

    public void setTrylearn(String trylearn) {
        this.trylearn = trylearn == null ? null : trylearn.trim();
    }
}