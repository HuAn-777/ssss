package com.xuecheng.dao;

import com.xuecheng.framework.domain.cms.CmsPage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */

public interface CmsPageReportry extends MongoRepository<CmsPage,String> {


    CmsPage findByPageName(String pageName);

    CmsPage findByPageNameAndPageAliase(String pageName,String pageAliase);


}
