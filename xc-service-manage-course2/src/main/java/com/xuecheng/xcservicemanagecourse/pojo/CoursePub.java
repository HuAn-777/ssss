package com.xuecheng.xcservicemanagecourse.pojo;

import java.util.Date;

public class CoursePub {
    private String id;

    private String name;

    private String users;

    private String mt;

    private String st;

    private String grade;

    private String studymodel;

    private String teachmode;

    private Date timestamp;

    private String charge;

    private String valid;

    private String qq;

    private Float price;

    private Float priceOld;

    private String expires;

    private String startTime;

    private String endTime;

    private String pic;

    private String pubTime;

    public CoursePub(String id, String name, String users, String mt, String st, String grade, String studymodel, String teachmode, Date timestamp, String charge, String valid, String qq, Float price, Float priceOld, String expires, String startTime, String endTime, String pic, String pubTime) {
        this.id = id;
        this.name = name;
        this.users = users;
        this.mt = mt;
        this.st = st;
        this.grade = grade;
        this.studymodel = studymodel;
        this.teachmode = teachmode;
        this.timestamp = timestamp;
        this.charge = charge;
        this.valid = valid;
        this.qq = qq;
        this.price = price;
        this.priceOld = priceOld;
        this.expires = expires;
        this.startTime = startTime;
        this.endTime = endTime;
        this.pic = pic;
        this.pubTime = pubTime;
    }

    public CoursePub() {
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

    public String getTeachmode() {
        return teachmode;
    }

    public void setTeachmode(String teachmode) {
        this.teachmode = teachmode == null ? null : teachmode.trim();
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

    public String getExpires() {
        return expires;
    }

    public void setExpires(String expires) {
        this.expires = expires == null ? null : expires.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime == null ? null : endTime.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public String getPubTime() {
        return pubTime;
    }

    public void setPubTime(String pubTime) {
        this.pubTime = pubTime == null ? null : pubTime.trim();
    }
}