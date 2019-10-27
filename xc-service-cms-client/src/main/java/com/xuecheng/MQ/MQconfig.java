package com.xuecheng.MQ;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/27
 */
@Configuration
public class MQconfig {
    //交换机的名称     
    public static final String EX_ROUTING_CMS_POSTPAGE="ex_routing_cms_postpage";

    @Bean(EX_ROUTING_CMS_POSTPAGE)
    public Exchange EXCHANGE_TOPICS_INFORM() {

        return ExchangeBuilder.directExchange(EX_ROUTING_CMS_POSTPAGE).durable(true).build();
    }
}
