package com.xuecheng.xcservicemanagecourse.mapper;

import com.xuecheng.xcservicemanagecourse.pojo.CourseOff;
import com.xuecheng.xcservicemanagecourse.pojo.CourseOffExample;
import com.xuecheng.xcservicemanagecourse.pojo.CourseOffWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseOffMapper {
    int countByExample(CourseOffExample example);

    int deleteByExample(CourseOffExample example);

    int deleteByPrimaryKey(String id);

    int insert(CourseOffWithBLOBs record);

    int insertSelective(CourseOffWithBLOBs record);

    List<CourseOffWithBLOBs> selectByExampleWithBLOBs(CourseOffExample example);

    List<CourseOff> selectByExample(CourseOffExample example);

    CourseOffWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CourseOffWithBLOBs record, @Param("example") CourseOffExample example);

    int updateByExampleWithBLOBs(@Param("record") CourseOffWithBLOBs record, @Param("example") CourseOffExample example);

    int updateByExample(@Param("record") CourseOff record, @Param("example") CourseOffExample example);

    int updateByPrimaryKeySelective(CourseOffWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CourseOffWithBLOBs record);

    int updateByPrimaryKey(CourseOff record);
}