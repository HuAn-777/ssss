package com.xuecheng.xcservicemanagecourse.pojo;

import java.util.Date;

public class CourseMarket {
    private String id;

    private String charge;

    private String valid;

    private Date expires;

    private String qq;

    private Float price;

    private Float priceOld;

    private Date startTime;

    private Date endTime;

    public CourseMarket(String id, String charge, String valid, Date expires, String qq, Float price, Float priceOld, Date startTime, Date endTime) {
        this.id = id;
        this.charge = charge;
        this.valid = valid;
        this.expires = expires;
        this.qq = qq;
        this.price = price;
        this.priceOld = priceOld;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public CourseMarket() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
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

    public Date getExpires() {
        return expires;
    }

    public void setExpires(Date expires) {
        this.expires = expires;
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

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }
}