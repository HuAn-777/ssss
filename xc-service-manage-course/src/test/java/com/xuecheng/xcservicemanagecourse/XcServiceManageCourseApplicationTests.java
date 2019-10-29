package com.xuecheng.xcservicemanagecourse;


import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.xcservicemanagecourse.mapper.CourseBaseMapper;
import com.xuecheng.xcservicemanagecourse.mapper.TeachplanMapper;
import com.xuecheng.xcservicemanagecourse.pojo.CourseBase;
import com.xuecheng.xcservicemanagecourse.pojo.Teachplan;
import com.xuecheng.xcservicemanagecourse.pojo.TeachplanExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class XcServiceManageCourseApplicationTests {

    @Autowired
    private CourseBaseMapper courseBaseMapper;


    @Autowired
    private TeachplanMapper teachplanMapper;


    @Test
    public void contextLoads() {



        PageHelper.startPage(1,10);//查询第一页，每页显示10条记录     

        CourseListRequest courseListRequest=new CourseListRequest();
        Page<CourseInfo> courseListPage=courseBaseMapper.findCourseListPage(courseListRequest);
        List<CourseInfo> result=courseListPage.getResult();
        System.out.println(courseListPage);
    }


}


