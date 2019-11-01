package com.xuecheng.xcservicemanagecourse.pojo;

import java.util.Date;

public class CoursePubWithBLOBs extends CoursePub {
    private String description;

    private String teachplan;

    public CoursePubWithBLOBs(String id, String name, String users, String mt, String st, String grade, String studymodel, String teachmode, Date timestamp, String charge, String valid, String qq, Float price, Float priceOld, String expires, String startTime, String endTime, String pic, String pubTime, String description, String teachplan) {
        super(id, name, users, mt, st, grade, studymodel, teachmode, timestamp, charge, valid, qq, price, priceOld, expires, startTime, endTime, pic, pubTime);
        this.description = description;
        this.teachplan = teachplan;
    }

    public CoursePubWithBLOBs() {
        super();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTeachplan() {
        return teachplan;
    }

    public void setTeachplan(String teachplan) {
        this.teachplan = teachplan == null ? null : teachplan.trim();
    }
}