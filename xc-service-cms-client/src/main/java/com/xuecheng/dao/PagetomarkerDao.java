package com.xuecheng.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/27
 */
public interface PagetomarkerDao extends MongoRepository<CmsPage,String> {
}
