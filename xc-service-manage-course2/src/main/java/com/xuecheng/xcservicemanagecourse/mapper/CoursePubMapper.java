package com.xuecheng.xcservicemanagecourse.mapper;

import com.xuecheng.xcservicemanagecourse.pojo.CoursePub;
import com.xuecheng.xcservicemanagecourse.pojo.CoursePubExample;
import com.xuecheng.xcservicemanagecourse.pojo.CoursePubWithBLOBs;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CoursePubMapper {
    int countByExample(CoursePubExample example);

    int deleteByExample(CoursePubExample example);

    int deleteByPrimaryKey(String id);

    int insert(CoursePubWithBLOBs record);

    int insertSelective(CoursePubWithBLOBs record);

    List<CoursePubWithBLOBs> selectByExampleWithBLOBs(CoursePubExample example);

    List<CoursePub> selectByExample(CoursePubExample example);

    CoursePubWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CoursePubWithBLOBs record, @Param("example") CoursePubExample example);

    int updateByExampleWithBLOBs(@Param("record") CoursePubWithBLOBs record, @Param("example") CoursePubExample example);

    int updateByExample(@Param("record") CoursePub record, @Param("example") CoursePubExample example);

    int updateByPrimaryKeySelective(CoursePubWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CoursePubWithBLOBs record);

    int updateByPrimaryKey(CoursePub record);
}