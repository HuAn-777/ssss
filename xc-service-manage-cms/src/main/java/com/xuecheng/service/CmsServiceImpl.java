package com.xuecheng.service;

import com.xuecheng.dao.CmsPageReportry;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.domain.cms.response.CmsPageResult;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
@Service
public class CmsServiceImpl implements CmsService {

    @Autowired
    private CmsPageReportry cmsPageReportry;

    @Override
    public List<CmsPage> findAll() {

        List<CmsPage> all = cmsPageReportry.findAll();

        return all;
    }

    @Override
    public CmsPageResult add(CmsPage page) {

        CmsPage save = cmsPageReportry.save(page);

        CmsPageResult cmsPageResult = new CmsPageResult(CommonCode.SUCCESS, save);

        return cmsPageResult;
    }

    @Override
    public CmsPage findByPageNameAndPageAliase(String pageName, String pageAliase) {

        CmsPage byPageNameAndPageAliase = cmsPageReportry.findByPageNameAndPageAliase(pageName, pageAliase);

        return byPageNameAndPageAliase;
    }

    @Override
    public QueryResponseResult findList(Integer page, Integer size, QueryPageRequest queryPageRequest) {

        if (page <= 0) {
            page = 1;
        }

        page = page - 1;

        if (size <= 0) {
            size = 1;
        }

        ExampleMatcher matching = ExampleMatcher.matching();

        matching = matching.withMatcher("pageName", ExampleMatcher.GenericPropertyMatchers.contains());

        matching = matching.withMatcher("pageAliase", ExampleMatcher.GenericPropertyMatchers.contains());

        CmsPage cmsPage = new CmsPage();

        if (StringUtils.isNotEmpty(queryPageRequest.getSiteId())) {

            cmsPage.setSiteId(queryPageRequest.getSiteId());

            cmsPage.setPageName(queryPageRequest.getPageName());

            cmsPage.setPageAliase(queryPageRequest.getPageAliase());
        }


        Example<CmsPage> example = Example.of(cmsPage, matching);

        Pageable of = PageRequest.of(page, size);

        Page<CmsPage> all = cmsPageReportry.findAll(example, of);

        QueryResult queryResult = new QueryResult();

        queryResult.setList(all.getContent());

        queryResult.setTotal(all.getTotalElements());

        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, queryResult);

        return queryResponseResult;
    }

    @Override
    public CmsPage findById(String id) {

        Optional<CmsPage> cmspage = cmsPageReportry.findById(id);

        if (cmspage.isPresent()) {

            return cmspage.get();

        }

        return null;
    }

    @Override
    public CmsPageResult updateById(String id, CmsPage cmsPage) {

        CmsPage cmspageone = this.findById(id);

        if(cmspageone !=null){

            CmsPage save = cmsPageReportry.save(cmsPage);

            if(save !=null){

                return new CmsPageResult(CommonCode.SUCCESS,save);
            }

        }

        return new CmsPageResult(CommonCode.FAIL,null);
    }
}
