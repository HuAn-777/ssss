package com.xuecheng.service;

import com.xuecheng.dao.CmsConfigReportry;
import com.xuecheng.framework.domain.cms.CmsConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/23
 */
@Service
public class CmsConfigServiceImpl implements CmsConfigService {
    @Autowired
    private CmsConfigReportry cmsConfigReportry;

    @Override
    public CmsConfig getmodel(String id) {


        Optional<CmsConfig> byId = cmsConfigReportry.findById(id);

        if(byId.isPresent()){

            return byId.get();
        }

        return null;
    }

    @Override
    public CmsConfig getfenleilist() {

        CmsConfig cmsCon = cmsConfigReportry.findByName("分类信息");

        return cmsCon;
    }
}
