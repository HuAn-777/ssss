package com.xuecheng.xcservicemanagecourse.mapper;

import com.xuecheng.xcservicemanagecourse.pojo.CoursePic;
import com.xuecheng.xcservicemanagecourse.pojo.CoursePicExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursePicMapper {
    int countByExample(CoursePicExample example);

    int deleteByExample(CoursePicExample example);

    int deleteByPrimaryKey(String courseid);

    int insert(CoursePic record);

    int insertSelective(CoursePic record);

    List<CoursePic> selectByExample(CoursePicExample example);

    CoursePic selectByPrimaryKey(String courseid);

    int updateByExampleSelective(@Param("record") CoursePic record, @Param("example") CoursePicExample example);

    int updateByExample(@Param("record") CoursePic record, @Param("example") CoursePicExample example);

    int updateByPrimaryKeySelective(CoursePic record);

    int updateByPrimaryKey(CoursePic record);
}