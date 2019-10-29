package com.xuecheng.xcservicemanagecourse.mapper;

import com.github.pagehelper.Page;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.xcservicemanagecourse.pojo.CourseBase;
import com.xuecheng.xcservicemanagecourse.pojo.CourseBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseBaseMapper {
    int countByExample(CourseBaseExample example);

    int deleteByExample(CourseBaseExample example);

    int deleteByPrimaryKey(String id);

    int insert(CourseBase record);

    int insertSelective(CourseBase record);

    List<CourseBase> selectByExampleWithBLOBs(CourseBaseExample example);

    List<CourseBase> selectByExample(CourseBaseExample example);

    CourseBase selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CourseBase record, @Param("example") CourseBaseExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseBase record, @Param("example") CourseBaseExample example);

    int updateByExample(@Param("record") CourseBase record, @Param("example") CourseBaseExample example);

    int updateByPrimaryKeySelective(CourseBase record);

    int updateByPrimaryKeyWithBLOBs(CourseBase record);

    int updateByPrimaryKey(CourseBase record);

    Page<CourseInfo> findCourseListPage(CourseListRequest courseListRequest);
}