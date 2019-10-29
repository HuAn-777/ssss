package com.xuecheng.xcservicemanagecourse.mapper;

import com.xuecheng.xcservicemanagecourse.pojo.CourseMarket;
import com.xuecheng.xcservicemanagecourse.pojo.CourseMarketExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CourseMarketMapper {
    int countByExample(CourseMarketExample example);

    int deleteByExample(CourseMarketExample example);

    int deleteByPrimaryKey(String id);

    int insert(CourseMarket record);

    int insertSelective(CourseMarket record);

    List<CourseMarket> selectByExample(CourseMarketExample example);

    CourseMarket selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CourseMarket record, @Param("example") CourseMarketExample example);

    int updateByExample(@Param("record") CourseMarket record, @Param("example") CourseMarketExample example);

    int updateByPrimaryKeySelective(CourseMarket record);

    int updateByPrimaryKey(CourseMarket record);
}