package com.xuecheng.framework.domain.cms.request;

import com.xuecheng.framework.model.request.RequestData;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
@Data
public class QueryPageRequest extends RequestData {
    @ApiModelProperty("站点ID")
    private String siteId;
    @ApiModelProperty("页面ID")
    private String pageId;
    @ApiModelProperty("页面名称")
    private String pageName;
    @ApiModelProperty("页面别名")
    private String pageAliase;
    @ApiModelProperty("模板ID")
    private String templateId;
}
