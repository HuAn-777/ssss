package com.xuecheng.xcservicemanagecourse.controller;

import com.xuecheng.api.api.ManageCourseApi;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.xcservicemanagecourse.pojo.Category;
import com.xuecheng.xcservicemanagecourse.pojo.CourseBase;
import com.xuecheng.xcservicemanagecourse.pojo.CourseMarket;
import com.xuecheng.xcservicemanagecourse.service.TeplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/29
 */
@Controller
@RequestMapping("/course")
public class TeplanController implements ManageCourseApi {

    @Autowired
    private TeplanService teplanService;

    @GetMapping("/teachplan/getList")
    @ResponseBody
    public List<TeachplanNode> selectList(){

        List<TeachplanNode> teachplanNodes = teplanService.selectList();

        return teachplanNodes;
    }


    @Override
    @GetMapping("/coursebase/list")
    @ResponseBody
    public QueryResponseResult selectBypageid(String page, String size) {

        QueryResponseResult queryResponseResult = teplanService.selectBypageid(page, size);

        return queryResponseResult;
    }

    @Override
    @GetMapping("/coursebase/totalpage")
    @ResponseBody
    public int selectAllpagesize() {

        int i = teplanService.selectAllpagesize();
        return i;
    }


    @GetMapping("/list")
    @ResponseBody
    public List<Category> selectAllcategory() {

        List<Category> categories = teplanService.selectAllcategory();

        return categories;
    }

    @RequestMapping("/add")
    @ResponseBody
    public ResponseResult saveCourseBase(@RequestBody CourseBase courseBase) {

        ResponseResult result=teplanService.saveCourseBase(courseBase);

        return result;
    }

    @RequestMapping("/getCoursebaseById")
    @ResponseBody
    public CourseBase saveCourseBase(String courseId) {

        CourseBase courseBase= teplanService.selectByid(courseId);

        return courseBase;
    }

    @RequestMapping("/getCourseMarketById")
    @ResponseBody
    public CourseMarket getCourseMarketById(String courseId) {

        CourseMarket courseMarket= teplanService.getCourseMarketById(courseId);

        return courseMarket;
    }

    @RequestMapping("/updateCoursebase")
    @ResponseBody
    public ResponseResult updateCoursebase(CourseBase courseBase) {

        ResponseResult result=teplanService.updateCoursebase(courseBase);

        return result;
    }

    @GetMapping("/updateCourseMarket")
    @ResponseBody
    public ResponseResult updateCourseMarket(CourseMarket courseMarket) {

        ResponseResult result=teplanService.updateCourseMarket(courseMarket);

        return result;
    }
}

