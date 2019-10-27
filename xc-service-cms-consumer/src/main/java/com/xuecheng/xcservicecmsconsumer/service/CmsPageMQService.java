package com.xuecheng.xcservicecmsconsumer.service;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSFile;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.xcservicecmsconsumer.dao.CmspageRestore;
import org.apache.commons.io.IOUtils;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.util.Map;
import java.util.Optional;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/27
 */
@Service
public class CmsPageMQService {

    @Autowired
    private CmspageRestore cmspageRestore;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private GridFsTemplate gridFsTemplate;

    @Autowired
    private GridFSBucket gridFSBucket;

    @Autowired
    private RabbitTemplate rabbitTemplate;

    private Map getData(String dataUrl){

        ResponseEntity<Map> forEntity = restTemplate.getForEntity(dataUrl, Map.class);

        Map body = forEntity.getBody();

        return body;
    }

    private InputStream getTemplete(String htmlFileId){

        GridFSFile id = gridFsTemplate.findOne(Query.query(Criteria.where("_id").is(htmlFileId)));

        GridFSDownloadStream gridFSDownloadStream = gridFSBucket.openDownloadStream(id.getObjectId());

        GridFsResource gridFsResource = new GridFsResource(id, gridFSDownloadStream);

        try {
            InputStream inputStream = gridFsResource.getInputStream();

            return inputStream;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void savePageToServerPath(String pageId) {
        try {

        Optional<CmsPage> byId = cmspageRestore.findById(pageId);

        CmsPage cmsPage = byId.get();

        String htmlFileId = cmsPage.getHtmlFileId();

        InputStream templete = this.getTemplete(htmlFileId);

        String pagePhysicalPath = cmsPage.getPagePhysicalPath();

        String pageName = cmsPage.getPageName();

        String path=pagePhysicalPath+pageName;

            FileOutputStream outputStream = new FileOutputStream(new File(path));

            IOUtils.copy(templete,outputStream);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
