package com.xuecheng.controller;

import com.xuecheng.api.api.CmsConfigControllerApi;
import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.service.CmsConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/23
 */
@Controller
@RequestMapping("/cms")
public class CmsConfigControler implements CmsConfigControllerApi {
    @Autowired
    private CmsConfigService cmsConfigService;
    @Override
    @GetMapping("/getmodel")
    @ResponseBody
    public CmsConfig getmodel(@RequestParam String id) {


        return cmsConfigService.getmodel(id);
    }
}
