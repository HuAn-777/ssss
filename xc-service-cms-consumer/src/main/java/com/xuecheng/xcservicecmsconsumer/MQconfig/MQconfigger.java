package com.xuecheng.xcservicecmsconsumer.MQconfig;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/27
 */
@Configuration
public class MQconfigger {

    //队列bean的名称     
    public static final String QUEUE_CMS_POSTPAGE = "queue_cms_postpage";
    //交换机的名称     
    public static final String EX_ROUTING_CMS_POSTPAGE = "ex_routing_cms_postpage";
    //队列的名称     ex_routing_cms_postpage
    @Value("${xuecheng.mq.queue}")
    public String queue_cms_postpage_name;
    //routingKey 即站点Id     
    @Value("${xuecheng.mq.routingKey}")
    public String routingKey;

    /**
     *      * 交换机配置使用direct类型      * @return the exchange      
     */

    @Bean(EX_ROUTING_CMS_POSTPAGE)
    public Exchange EXCHANGE_TOPICS_INFORM() {

        return ExchangeBuilder.directExchange(EX_ROUTING_CMS_POSTPAGE).durable(true).build();
    }

    //声明队列     
    @Bean(QUEUE_CMS_POSTPAGE)
    public Queue QUEUE_CMS_POSTPAGE() {

        Queue queue = new Queue(queue_cms_postpage_name);

        return queue;
    }

}
