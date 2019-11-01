package com.xuecheng.xcservicemanagecourse.mapper;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.xcservicemanagecourse.pojo.Teachplan;
import com.xuecheng.xcservicemanagecourse.pojo.TeachplanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachplanMapper {
    int countByExample(TeachplanExample example);

    int deleteByExample(TeachplanExample example);

    int deleteByPrimaryKey(String id);

    int insert(Teachplan record);

    int insertSelective(Teachplan record);

    List<Teachplan> selectByExample(TeachplanExample example);

    Teachplan selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Teachplan record, @Param("example") TeachplanExample example);

    int updateByExample(@Param("record") Teachplan record, @Param("example") TeachplanExample example);

    int updateByPrimaryKeySelective(Teachplan record);

    int updateByPrimaryKey(Teachplan record);

    List<TeachplanNode> selectList();
}