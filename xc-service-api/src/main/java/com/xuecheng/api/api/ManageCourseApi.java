package com.xuecheng.api.api;



import com.xuecheng.framework.domain.course.ext.TeachplanNode;
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


}
