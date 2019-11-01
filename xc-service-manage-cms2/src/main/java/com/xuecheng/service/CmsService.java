package com.xuecheng.service;

import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import freemarker.template.TemplateException;

import java.io.IOException;
import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
public interface CmsService {

   List<CmsPage> findAll();

   public CmsPageResult add(CmsPage page);

   CmsPage findByPageNameAndPageAliase(String pageName,String pageAliase);

   QueryResponseResult findList(Integer page, Integer size, QueryPageRequest queryPageRequest);

   public CmsPage findById(String id);

   public CmsPageResult updateById(String id,CmsPage cmsPage);

   public String getPagehtmlByid(String pageId) throws IOException, TemplateException;
}
