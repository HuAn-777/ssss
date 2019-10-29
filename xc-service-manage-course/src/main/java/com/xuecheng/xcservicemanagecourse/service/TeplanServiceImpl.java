package com.xuecheng.xcservicemanagecourse.service;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.xcservicemanagecourse.mapper.TeachplanMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/29
 */
@Service
public class TeplanServiceImpl implements TeplanService {

    @Autowired
    private TeachplanMapper teachplanMapper;

    @Override
    public List<TeachplanNode> selectList() {

        List<TeachplanNode> teachplanNodes = teachplanMapper.selectList();

        return teachplanNodes;
    }
}
