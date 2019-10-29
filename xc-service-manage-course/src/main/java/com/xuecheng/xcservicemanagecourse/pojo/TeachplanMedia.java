package com.xuecheng.xcservicemanagecourse.pojo;

public class TeachplanMedia {
    private String teachplanId;

    private String mediaId;

    private String mediaFileoriginalname;

    private String mediaUrl;

    private String courseid;

    public TeachplanMedia(String teachplanId, String mediaId, String mediaFileoriginalname, String mediaUrl, String courseid) {
        this.teachplanId = teachplanId;
        this.mediaId = mediaId;
        this.mediaFileoriginalname = mediaFileoriginalname;
        this.mediaUrl = mediaUrl;
        this.courseid = courseid;
    }

    public TeachplanMedia() {
        super();
    }

    public String getTeachplanId() {
        return teachplanId;
    }

    public void setTeachplanId(String teachplanId) {
        this.teachplanId = teachplanId == null ? null : teachplanId.trim();
    }

    public String getMediaId() {
        return mediaId;
    }

    public void setMediaId(String mediaId) {
        this.mediaId = mediaId == null ? null : mediaId.trim();
    }

    public String getMediaFileoriginalname() {
        return mediaFileoriginalname;
    }

    public void setMediaFileoriginalname(String mediaFileoriginalname) {
        this.mediaFileoriginalname = mediaFileoriginalname == null ? null : mediaFileoriginalname.trim();
    }

    public String getMediaUrl() {
        return mediaUrl;
    }

    public void setMediaUrl(String mediaUrl) {
        this.mediaUrl = mediaUrl == null ? null : mediaUrl.trim();
    }

    public String getCourseid() {
        return courseid;
    }

    public void setCourseid(String courseid) {
        this.courseid = courseid == null ? null : courseid.trim();
    }
}