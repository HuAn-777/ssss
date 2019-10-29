package com.xuecheng.xcservicemanagecourse.controller;

import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.xcservicemanagecourse.service.TeplanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/29
 */
@Controller
@RequestMapping("/course")
public class TeplanController {

    @Autowired
    private TeplanService teplanService;

    @GetMapping("/teachplan/getList")
    @ResponseBody
    public List<TeachplanNode> getList(){

        List<TeachplanNode> teachplanNodes = teplanService.selectList();

        return teachplanNodes;
    }
}
