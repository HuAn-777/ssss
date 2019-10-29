package com.xuecheng.xcservicemanagecourse.pojo;

public class CoursePic {
    private String courseid;

    private String pic;

    public CoursePic(String courseid, String pic) {
        this.courseid = courseid;
        this.pic = pic;
    }

    public CoursePic() {
        super();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }
}