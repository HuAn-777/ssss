package com.xuecheng.api.api;




import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
@Api(value = "课程管理",description = "用于后台课程管理管理类")
public interface ManageCourseApi {


    @ApiOperation("获取所有课程计划的方法")
    public List<TeachplanNode> selectList();

    @ApiOperation("获取已有课程的方法")
    public QueryResponseResult selectBypageid(String page,String size);

    @ApiOperation("获取课程总数的方法")
    public int selectAllpagesize();




}
