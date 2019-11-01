package com.xuecheng.client;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/11/1
 */
@FeignClient(value = "cms")
public interface CmsController {


    @GetMapping("/cms/getmodel")
    public CmsConfig getmodel(@RequestParam String id);



    @GetMapping("/cms/list")
    @ResponseBody
    public CmsConfig getfenleilist();




}
