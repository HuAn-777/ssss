package com.xuecheng;

import com.xuecheng.dao.CmsPageReportry;
import com.xuecheng.framework.domain.cms.CmsPage;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class XcServiceManageCmsApplicationTests {

    @Autowired
    private CmsPageReportry cmsPageReportry;

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

}
