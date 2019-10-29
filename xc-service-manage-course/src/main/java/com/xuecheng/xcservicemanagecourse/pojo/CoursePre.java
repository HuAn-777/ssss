package com.xuecheng.xcservicemanagecourse.pojo;

import java.util.Date;

public class CoursePre {
    private String id;

    private String name;

    private String users;

    private String mt;

    private String st;

    private String grade;

    private String studymodel;

    private String status;

    private Date timestamp;

    private String charge;

    private String valid;

    private String qq;

    private Float price;

    private Float priceOld;

    private Date expires;

    private String pic;

    public CoursePre(String id, String name, String users, String mt, String st, String grade, String studymodel, String status, Date timestamp, String charge, String valid, String qq, Float price, Float priceOld, Date expires, String pic) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.mt = mt;
        this.st = st;
        this.grade = grade;
        this.studymodel = studymodel;
        this.status = status;
        this.timestamp = timestamp;
        this.charge = charge;
        this.valid = valid;
        this.qq = qq;
        this.price = price;
        this.priceOld = priceOld;
        this.expires = expires;
        this.pic = pic;
    }

    public CoursePre() {
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

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st == null ? null : st.trim();
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge == null ? null : charge.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getPriceOld() {
        return priceOld;
    }

    public void setPriceOld(Float priceOld) {
        this.priceOld = priceOld;
    }

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}