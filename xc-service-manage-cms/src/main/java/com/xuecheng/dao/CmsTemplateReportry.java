package com.xuecheng.dao;

import com.xuecheng.framework.domain.cms.CmsTemplate;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/24
 */
public interface CmsTemplateReportry extends MongoRepository<CmsTemplate,String> {
}
