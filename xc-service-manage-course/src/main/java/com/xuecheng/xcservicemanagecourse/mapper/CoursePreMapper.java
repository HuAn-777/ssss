package com.xuecheng.xcservicemanagecourse.mapper;

import com.xuecheng.xcservicemanagecourse.pojo.CoursePre;
import com.xuecheng.xcservicemanagecourse.pojo.CoursePreExample;
import com.xuecheng.xcservicemanagecourse.pojo.CoursePreWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursePreMapper {
    int countByExample(CoursePreExample example);

    int deleteByExample(CoursePreExample example);

    int deleteByPrimaryKey(String id);

    int insert(CoursePreWithBLOBs record);

    int insertSelective(CoursePreWithBLOBs record);

    List<CoursePreWithBLOBs> selectByExampleWithBLOBs(CoursePreExample example);

    List<CoursePre> selectByExample(CoursePreExample example);

    CoursePreWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CoursePreWithBLOBs record, @Param("example") CoursePreExample example);

    int updateByExampleWithBLOBs(@Param("record") CoursePreWithBLOBs record, @Param("example") CoursePreExample example);

    int updateByExample(@Param("record") CoursePre record, @Param("example") CoursePreExample example);

    int updateByPrimaryKeySelective(CoursePreWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CoursePreWithBLOBs record);

    int updateByPrimaryKey(CoursePre record);
}