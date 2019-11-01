package com.xuecheng;

import com.netflix.discovery.converters.Auto;
import com.xuecheng.client.CmsController;
import com.xuecheng.dao.CmsPageReportry;
import com.xuecheng.framework.domain.cms.CmsConfig;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.service.CmsService;
import freemarker.template.TemplateException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XcServiceManageCmsApplicationTests {

    @Autowired
    private CmsPageReportry cmsPageReportry;

    @Autowired
    private CmsService cmsService;

    @Autowired
    private CmsController cmsController;


    @Test
    public void conasfaa() throws IOException, TemplateException {

        String pagehtmlByid = cmsService.getPagehtmlByid("5abefd525b05aa293098fca6");

        System.out.println(pagehtmlByid);


    }

    @Test
    public void contextLoads() {

        PageRequest of = PageRequest.of(1, 10);

        Page<CmsPage> all = cmsPageReportry.findAll(of);

        Iterator<CmsPage> iterator = all.iterator();


    }

    @Test
    public void contextLoadsone() {

        ExampleMatcher matching = ExampleMatcher.matching();

        matching= matching.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());

        matching= matching.withMatcher("pageName", ExampleMatcher.GenericPropertyMatchers.contains());

        CmsPage cmsPage = new CmsPage();

        cmsPage.setPageAliase("页");

        cmsPage.setPageName("index");

        Example<CmsPage> example = Example.of(cmsPage,matching);

        PageRequest of = PageRequest.of(0, 1);

        Page<CmsPage> all = cmsPageReportry.findAll(example, of);

        List<CmsPage> content = all.getContent();

        System.out.println(all);


    }

    @Test
    public void testrtt(){

        CmsConfig getmodel = cmsController.getmodel("5a791725dd573c3574ee333f");

        System.out.println(getmodel);

    }

}
