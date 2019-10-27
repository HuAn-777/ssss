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
@Api(value = "页面发布静态化接口",description = "用于将页面静态化发布的管理类")
public interface CmsPageMQApi {


    @ApiOperation("获取静态页面")
    public CmsPageResult getPagemarker(String pageId);


}
