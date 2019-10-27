package com.xuecheng.service;

import com.alibaba.fastjson.JSON;
import com.mongodb.client.gridfs.GridFSBucket;
import com.xuecheng.MQ.MQconfig;
import com.xuecheng.dao.PagetomarkerDao;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.CommonCode;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.io.IOUtils;
import org.bson.types.ObjectId;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/27
 */
@Service
public class PagetomarkerServiceImpl implements PagetomarkerService {
    @Value("${xuecheng.mq.routinkey}")
    private String routkey;

    @Autowired
    private PagetomarkerDao pagetomarkerDao;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GridFsTemplate gridFsTemplate;

    @Autowired
    private GridFSBucket gridFSBucket;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    public CmsPage getCmsPage(String pageId) {

        Optional<CmsPage> byId = pagetomarkerDao.findById(pageId);

        if (byId.isPresent()) {

            return byId.get();
        }

        return null;
    }

    public Map getData(String dataurl) {

        ResponseEntity<Map> forEntity = restTemplate.getForEntity(dataurl, Map.class);

        return forEntity.getBody();
    }

    public String gethtmlFileId(Map map) {

        //获取模板
        File file = new File("d:/index_banner.html");
        //定义输入流         
        FileInputStream inputStram = null;
        try {
            inputStram = new FileInputStream(file);

            Configuration configuration = new Configuration(Configuration.getVersion());

            StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();

            stringTemplateLoader.putTemplate("template", inputStram.toString());

            configuration.setTemplateLoader(stringTemplateLoader);

            Template template = configuration.getTemplate("template", "UTF-8");

            String s = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);

            InputStream inputStreamone = IOUtils.toInputStream(s);

            //向GridFS存储文件
            ObjectId objectId = gridFsTemplate.store(inputStreamone, "轮播图", "");
            //得到文件ID
            String fileId = objectId.toString();

            System.out.println(fileId);

            return fileId;

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public CmsPageResult getPagemarker(String pageId) {

        CmsPage cmsPage = this.getCmsPage(pageId);

        String dataUrl = cmsPage.getDataUrl();
        //获取元数据
        Map data = this.getData(dataUrl);

        String htmlFileId = cmsPage.getHtmlFileId();

        gridFsTemplate.delete(Query.query(Criteria.where("_id").is(htmlFileId)));

        String fileId = this.gethtmlFileId(data);

        cmsPage.setHtmlFileId(fileId);

        pagetomarkerDao.save(cmsPage);

        Map<String, String> msgMap = new HashMap<>();

        msgMap.put("pageId", pageId);

        String s = JSON.toJSONString(msgMap);

        this.rabbitTemplate.convertAndSend(MQconfig.EX_ROUTING_CMS_POSTPAGE, this.routkey, s);

        CmsPageResult cmsPageResult = new CmsPageResult(CommonCode.SUCCESS, cmsPage);

        return cmsPageResult;
    }
}
