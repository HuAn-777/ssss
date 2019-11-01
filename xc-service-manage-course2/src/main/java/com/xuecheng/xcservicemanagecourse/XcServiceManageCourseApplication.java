package com.xuecheng.xcservicemanagecourse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EntityScan("com.xuecheng.framework.domain")//扫描实体类
@ComponentScan(basePackages={"com.xuecheng.api"})//扫描接口
@ComponentScan(basePackages={"com.xuecheng.xcservicemanagecourse"})
@ComponentScan(basePackages={"com.xuecheng.framework"})//扫描common下的所有类
@MapperScan(basePackages = {"com.xuecheng.xcservicemanagecourse.mapper"})
@EnableEurekaClient
public class XcServiceManageCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(XcServiceManageCourseApplication.class, args);
    }

}
