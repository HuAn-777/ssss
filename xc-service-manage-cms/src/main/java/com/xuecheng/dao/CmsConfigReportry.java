package com.xuecheng.dao;

import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/23
 */
public interface CmsConfigReportry extends MongoRepository<CmsConfig,String> {
}
