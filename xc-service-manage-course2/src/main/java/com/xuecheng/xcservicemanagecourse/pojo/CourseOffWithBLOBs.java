package com.xuecheng.xcservicemanagecourse.pojo;

import java.util.Date;

public class CourseOffWithBLOBs extends CourseOff {
    private String description;

    private String teachplan;

    public CourseOffWithBLOBs(String id, String name, String users, String mt, String st, String grade, String studymodel, Date timestamp, String charge, String valid, String qq, Float price, Float priceOld, Date expires, String pic, String description, String teachplan) {
        super(id, name, users, mt, st, grade, studymodel, timestamp, charge, valid, qq, price, priceOld, expires, pic);
        this.description = description;
        this.teachplan = teachplan;
    }

    public CourseOffWithBLOBs() {
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