package com.xuecheng.xcservicemanagecourse.mapper;

import com.xuecheng.xcservicemanagecourse.pojo.Category;
import com.xuecheng.xcservicemanagecourse.pojo.CategoryExample;
import com.xuecheng.xcservicemanagecourse.pojo.CourseBase;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CategoryMapper {
    int countByExample(CategoryExample example);

    int deleteByExample(CategoryExample example);

    int deleteByPrimaryKey(String id);

    int insert(CourseBase record);

    int insertSelective(Category record);

    List<Category> selectByExample(CategoryExample example);

    Category selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByExample(@Param("record") Category record, @Param("example") CategoryExample example);

    int updateByPrimaryKeySelective(Category record);

    int updateByPrimaryKey(Category record);
}