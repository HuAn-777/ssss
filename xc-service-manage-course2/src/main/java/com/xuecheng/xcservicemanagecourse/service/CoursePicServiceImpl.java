package com.xuecheng.xcservicemanagecourse.service;


import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.xcservicemanagecourse.mapper.CoursePicMapper;
import com.xuecheng.xcservicemanagecourse.pojo.CoursePic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CoursePicServiceImpl {
    @Autowired
    CoursePicMapper coursePicMapper;
//      以后 做任何    增删改     的时候，  一定第一件事 ， 先查一下， 这条数据 是否 存在

    @Transactional
    public ResponseResult saveCoursePic(String courseId, String pic) {
        //查询课程图片
        CoursePic coursePic = coursePicMapper.selectByPrimaryKey(courseId);
//没有课程图片则新建对象  ，如果有 课程图片， 那么 就需要， 把这个图片 重新覆盖
        if(coursePic==null){
            coursePic=new CoursePic();
        }

        coursePic.setCourseid(courseId);

        coursePic.setPic(pic);

        int insert = coursePicMapper.insert(coursePic);


        return new ResponseResult(CommonCode.SUCCESS);
    }

    public CoursePic getCoursePic(String courseId) {

        CoursePic coursePic = coursePicMapper.selectByPrimaryKey(courseId);

        return coursePic;
    }

    public ResponseResult deleteCoursePic(String courseId) {

        int i = coursePicMapper.deleteByPrimaryKey(courseId);

        if(i==0){
            return new ResponseResult(CommonCode.FAIL);
        }

        return new ResponseResult(CommonCode.SUCCESS);

    }
}
