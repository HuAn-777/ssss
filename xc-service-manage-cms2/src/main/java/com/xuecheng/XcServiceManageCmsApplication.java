package com.xuecheng;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.gridfs.GridFSBucket;
import com.mongodb.client.gridfs.GridFSBuckets;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EntityScan(value = "com.xuecheng.framework.domain.cms")
@ComponentScan(basePackages = {"com.xuecheng.api","com.xuecheng"})
@EnableEurekaClient
@EnableFeignClients
public class XcServiceManageCmsApplication {

    @Value("${spring.data.mongodb.database}")
    private String db;

    public static void main(String[] args) {
        SpringApplication.run(XcServiceManageCmsApplication.class, args);
    }
    @Bean
    public RestTemplate getRestTemple() {

        return new RestTemplate(new OkHttp3ClientHttpRequestFactory());

    }

    @Bean
    public GridFSBucket getGfsbucker(MongoClient mongoClient) {

        MongoDatabase database = mongoClient.getDatabase(db);

        GridFSBucket gridFSBucket = GridFSBuckets.create(database);

        return gridFSBucket;

    }



}
