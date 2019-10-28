package com.xuecheng.controller;

import com.xuecheng.api.api.CmsPageMQApi;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.service.PagetomarkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/27
 */
@Controller
public class Pagetofreemarker implements CmsPageMQApi {

    @Autowired
    private PagetomarkerService pagetomarkerService;

    @Override
    @GetMapping("/addfreemarker")
    @ResponseBody
    public CmsPageResult getPagemarker(String pageId) {

        CmsPageResult pagemarker = pagetomarkerService.getPagemarker(pageId);

        return pagemarker;
    }
}
