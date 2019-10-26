package com.xuecheng.controller;


import com.xuecheng.api.api.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsCode;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.framework.web.BaseController;
import com.xuecheng.service.CmsService;
import freemarker.template.TemplateException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.persistence.GeneratedValue;
import javax.servlet.ServletOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
@Controller
@RequestMapping("/cms")
public class CmsController extends BaseController implements CmsPageControllerApi  {

    @Autowired
    private CmsService cmsService;

    @GetMapping("/findAll")
    @ResponseBody
    @Override
    public QueryResponseResult findList(Integer page, Integer size, QueryPageRequest queryPageRequest) {

        QueryResponseResult list = cmsService.findList(page, size, queryPageRequest);

        return list;
    }
    @PostMapping("/addPage")
    @ResponseBody
    @Override
    public CmsPageResult add(@RequestBody CmsPage page) {

        CmsPageResult add = cmsService.add(page);

        return add;
    }

    @GetMapping("/findCmspageById")
    @Override
    @ResponseBody
    public CmsPage findById(String id) {


        return cmsService.findById(id);
    }

    @PutMapping("/updateCmspage")
    @Override
    @ResponseBody
    public CmsPageResult updateById(String id,@RequestBody CmsPage cmsPage) {

        return cmsService.updateById(id,cmsPage);
    }

    @GetMapping("/getPagehtmlByid")
    @Override
    @ResponseBody
    public void getPagehtmlByid(String id) throws Exception {

        String pagehtmlByid = cmsService.getPagehtmlByid(id);

        ServletOutputStream outputStream = response.getOutputStream();

        outputStream.write(pagehtmlByid.getBytes("UTF-8"));


    }

    @GetMapping("/findbyname")
    @ResponseBody
    public CmsPage findbyname(String pageName, String pageAliase) {

        CmsPage byPageNameAndPageAliase = cmsService.findByPageNameAndPageAliase(pageName, pageAliase);

        return byPageNameAndPageAliase;
    }


}
