package com.xudcheng.freemarkertest.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/23
 */
@Controller
public class TestTwo {
    @Autowired
    private RestTemplate template;
    @RequestMapping("/getone")
    public String getModel(Map<String,Object> map){

        String dataUrl = "http://localhost:31001/cms/getmodel?id=5a791725dd573c3574ee333f";

        ResponseEntity<Map> forEntity = template.getForEntity(dataUrl, Map.class);

        Map body = forEntity.getBody();

        System.out.println(body);

        map.putAll(body);

        return "asdada";
    }
}
