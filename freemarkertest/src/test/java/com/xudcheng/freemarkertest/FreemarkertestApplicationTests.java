package com.xudcheng.freemarkertest;

import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSDownloadStream;
import com.mongodb.client.gridfs.model.GridFSFile;
import freemarker.cache.StringTemplateLoader;
import freemarker.template.Configuration;
import freemarker.template.Template;
import org.apache.commons.io.IOUtils;
import org.bson.types.ObjectId;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.CriteriaDefinition;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.gridfs.GridFsResource;
import org.springframework.data.mongodb.gridfs.GridFsTemplate;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest

class FreemarkertestApplicationTests {
    @Autowired
    GridFsTemplate gridFsTemplate;

    @Autowired
    GridFSBucket gridFSBucket;

    @Test
    void contextLoads() throws Exception {

        Configuration configuration = new Configuration(Configuration.getVersion());

        String templateString = "" + "<html>\n" + "    <head></head>\n" + "    <body>\n" + "    名称：${name}\n"
                + "    </body>\n" + "</html>";

        StringTemplateLoader stringTemplateLoader = new StringTemplateLoader();

        stringTemplateLoader.putTemplate("template",templateString);

        configuration.setTemplateLoader(stringTemplateLoader);

        Template template = configuration.getTemplate("template", "UTF-8");

        Map<String,Object> map=new HashMap<>();
        map.put("name","张三");

        String s = FreeMarkerTemplateUtils.processTemplateIntoString(template, map);

        System.out.println(s);

        InputStream inputStream = IOUtils.toInputStream(s);

        OutputStream outputStream = new FileOutputStream(new File("d:/one.html"));

        IOUtils.copy(inputStream,outputStream);
    }

    @Test
    void savedata() throws Exception {

        File file=new File("d:/one.html");
        //定义输入流         
        FileInputStream inputStram=new FileInputStream(file);
        //向GridFS存储文件
        ObjectId objectId=gridFsTemplate.store(inputStram,"轮播图测试文件01","");
        //得到文件ID
        String fileId=objectId.toString();
        System.out.println(fileId);
    }

    @Test
    void savedatasada() throws Exception {

        File file=new File("d:/index_banner.html");
        //定义输入流         
        FileInputStream inputStram=new FileInputStream(file);
        //向GridFS存储文件
        ObjectId objectId=gridFsTemplate.store(inputStram,"lunboceshisssssss","");
        //得到文件ID
        String fileId=objectId.toString();
        System.out.println(fileId);
    }

    @Test
    void testget() throws Exception {

        String fileId="5db005c28a4c7e5fc2ab7ffa";
        //根据id查询文
        GridFSFile id = gridFsTemplate.findOne(Query.query(Criteria.where("_id").is(fileId)));
        //打开下载流对
        GridFSDownloadStream gridFSDownloadStream = gridFSBucket.openDownloadStream(id.getObjectId());
        //创建gridFsResource，用于获取流对
        GridFsResource gridFsResource = new GridFsResource(id,gridFSDownloadStream);

        String s = IOUtils.toString(gridFsResource.getInputStream());

        System.out.println(s);

    }

}
