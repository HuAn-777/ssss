package com.xuecheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan(value = "com.xuecheng.framework.domain.cms")
@ComponentScan(basePackages = {"com.xuecheng.api","com.xuecheng"})
public class XcServiceCmsClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcServiceCmsClientApplication.class, args);
    }

}
