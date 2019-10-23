package com.xuecheng.api.api;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
@Api(value = "页面管理系统管理接口",description = "用于进行页面管理的增删该查的接口管理类")
public interface CmsPageControllerApi {
    /***
     *
     * @param page 当前页
     * @param size 每页显示多少条数据
     * @param queryPageRequest 请求参数类
     * @return 返回请求结果封装类
     */
    @ApiOperation("分页查找的接口类")
    @ApiImplicitParams({@ApiImplicitParam(name = "page",value = "当前页",required = true,paramType = "query",dataType = "int"),
            @ApiImplicitParam(name = "size",value = "每页显示条数",required = true,paramType = "query",dataType = "int")})
    public QueryResponseResult findList(Integer page, Integer size, QueryPageRequest queryPageRequest);


    @ApiOperation("这是添加对象的方法")
    public CmsPageResult add(CmsPage page);

    @ApiOperation("通过ID查找对象")
    public CmsPage findById(String id);

    @ApiOperation("修改对象")
    public CmsPageResult updateById(String id,CmsPage cmsPage);


}
