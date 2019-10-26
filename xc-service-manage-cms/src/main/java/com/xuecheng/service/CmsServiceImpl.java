package com.xuecheng.service;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.xuecheng.dao.CmsPageReportry;
import com.xuecheng.dao.CmsTemplateReportry;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.CmsTemplate;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
@Service
public class CmsServiceImpl implements CmsService {

    @Autowired
    private CmsPageReportry cmsPageReportry;

    @Autowired
    private CmsTemplateReportry cmsTemplateReportry;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    GridFsTemplate gridFsTemplate;

    @Autowired
    GridFSBucket gridFSBucket;

    @Override
    public List<CmsPage> findAll() {

        List<CmsPage> all = cmsPageReportry.findAll();

        return all;
    }

    @Override
    public CmsPageResult add(CmsPage page) {

        CmsPage save = cmsPageReportry.save(page);

        CmsPageResult cmsPageResult = new CmsPageResult(CommonCode.SUCCESS, save);

        return cmsPageResult;
    }

    @Override
    public CmsPage findByPageNameAndPageAliase(String pageName, String pageAliase) {

        CmsPage byPageNameAndPageAliase = cmsPageReportry.findByPageNameAndPageAliase(pageName, pageAliase);

        return byPageNameAndPageAliase;
    }

    @Override
    public QueryResponseResult findList(Integer page, Integer size, QueryPageRequest queryPageRequest) {

        if (page <= 0) {
            page = 1;
        }

        page = page - 1;

        if (size <= 0) {
            size = 1;
        }

        ExampleMatcher matching = ExampleMatcher.matching();

        matching = matching.withMatcher("pageName", ExampleMatcher.GenericPropertyMatchers.contains());

        matching = matching.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());

        CmsPage cmsPage = new CmsPage();

        if (StringUtils.isNotEmpty(queryPageRequest.getSiteId())) {

            cmsPage.setSiteId(queryPageRequest.getSiteId());

            cmsPage.setPageName(queryPageRequest.getPageName());

            cmsPage.setPageAliase(queryPageRequest.getPageAliase());
        }


        Example<CmsPage> example = Example.of(cmsPage, matching);

        Pageable of = PageRequest.of(page, size);

        Page<CmsPage> all = cmsPageReportry.findAll(example, of);

        QueryResult queryResult = new QueryResult();

        queryResult.setList(all.getContent());

        queryResult.setTotal(all.getTotalElements());

        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);

        return queryResponseResult;
    }

    @Override
    public CmsPage findById(String id) {

        Optional<CmsPage> cmspage = cmsPageReportry.findById(id);

        if (cmspage.isPresent()) {

            return cmspage.get();

        }

        return null;
    }

    @Override
    public CmsPageResult updateById(String id, CmsPage cmsPage) {

        CmsPage cmspageone = this.findById(id);

        if(cmspageone !=null){

            CmsPage save = cmsPageReportry.save(cmsPage);

            if(save !=null){

                return new CmsPageResult(CommonCode.SUCCESS,save);
            }

        }

        return new CmsPageResult(CommonCode.FAIL,null);
    }

    @Override
    public String getPagehtmlByid(String pageId) {

        try {
        Optional<CmsPage> optional = cmsPageReportry.findById(pageId);

        CmsPage cmsPage = optional.get();

        String dataUrl = cmsPage.getDataUrl();

        ResponseEntity<Map> forEntity = restTemplate.getForEntity("http://localhost:31001/cms/getmodel?id=5a791725dd573c3574ee333f", Map.class);

        Map body = forEntity.getBody();

        String templateId = cmsPage.getTemplateId();

        Optional<CmsTemplate> byId = cmsTemplateReportry.findById(templateId);

        CmsTemplate cmsTemplate = byId.get();

        String templateFileId = cmsTemplate.getTemplateFileId();

        GridFSFile id = gridFsTemplate.findOne(Query.query(Criteria.where("_id").is("5db1698599484265ba9dbf51")));

        GridFSDownloadStream gridFSDownloadStream = gridFSBucket.openDownloadStream(id.getObjectId());

        GridFsResource gridFsResource = new GridFsResource(id, gridFSDownloadStream);

        InputStream  inputStream = gridFsResource.getInputStream();

        String tempalteString = IOUtils.toString(inputStream);

        Configuration configuration = new Configuration(Configuration.getVersion());

        StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();

        stringTemplateLoader.putTemplate("template",tempalteString);

        configuration.setTemplateLoader(stringTemplateLoader);

        Template template = configuration.getTemplate("template", "UTF-8");

        String s = FreeMarkerTemplateUtils.processTemplateIntoString(template, body);

        System.out.println(s);

        return s;

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
