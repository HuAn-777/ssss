package com.xuecheng.xcservicemanagecourse.service;


import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.xcservicemanagecourse.pojo.Category;
import com.xuecheng.xcservicemanagecourse.pojo.CourseBase;
import com.xuecheng.xcservicemanagecourse.pojo.CourseMarket;

import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/29
 */
public interface TeplanService {

    public List<TeachplanNode> selectList();

    public QueryResponseResult selectBypageid(String page, String size);

    public int selectAllpagesize();

    public List<Category> selectAllcategory();

    ResponseResult saveCourseBase(CourseBase courseBase);

    CourseBase selectByid(String courseId);

    CourseMarket getCourseMarketById(String courseId);

    ResponseResult updateCoursebase(CourseBase courseBase);

    ResponseResult updateCourseMarket(CourseMarket courseMarket);
}
