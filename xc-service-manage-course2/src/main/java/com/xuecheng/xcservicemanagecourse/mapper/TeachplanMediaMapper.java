package com.xuecheng.xcservicemanagecourse.mapper;


import com.xuecheng.xcservicemanagecourse.pojo.TeachplanMedia;
import com.xuecheng.xcservicemanagecourse.pojo.TeachplanMediaExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeachplanMediaMapper {
    int countByExample(TeachplanMediaExample example);

    int deleteByExample(TeachplanMediaExample example);

    int deleteByPrimaryKey(String teachplanId);

    int insert(TeachplanMedia record);

    int insertSelective(TeachplanMedia record);

    List<TeachplanMedia> selectByExample(TeachplanMediaExample example);

    TeachplanMedia selectByPrimaryKey(String teachplanId);

    int updateByExampleSelective(@Param("record") TeachplanMedia record, @Param("example") TeachplanMediaExample example);

    int updateByExample(@Param("record") TeachplanMedia record, @Param("example") TeachplanMediaExample example);

    int updateByPrimaryKeySelective(TeachplanMedia record);

    int updateByPrimaryKey(TeachplanMedia record);
}