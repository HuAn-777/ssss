package com.xuecheng.xcservicecmsconsumer.web;

import com.alibaba.fastjson.JSON;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.xcservicecmsconsumer.dao.CmspageRestore;
import com.xuecheng.xcservicecmsconsumer.service.CmsPageMQService;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.Optional;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/27
 */
@Component
public class ConsumerLisener {

    @Autowired
    private CmspageRestore cmspageRestore;

    @Autowired
    private CmsPageMQService cmsPageMQService;

    @RabbitListener(queues={"${xuecheng.mq.queue}"})
    public void postPage(String message){

        Map map = JSON.parseObject(message, Map.class);

        String pageId = (String) map.get("pageId");

        Optional<CmsPage> byId = cmspageRestore.findById(pageId);

        if(!byId.isPresent()){
            return ;
        }

        cmsPageMQService.savePageToServerPath(pageId);

    }

}
