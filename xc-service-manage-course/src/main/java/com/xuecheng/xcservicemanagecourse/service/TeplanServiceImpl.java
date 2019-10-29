package com.xuecheng.xcservicemanagecourse.service;

import com.github.pagehelper.PageHelper;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.framework.model.response.ResponseResult;
import com.xuecheng.xcservicemanagecourse.mapper.CategoryMapper;
import com.xuecheng.xcservicemanagecourse.mapper.CourseBaseMapper;
import com.xuecheng.xcservicemanagecourse.mapper.CourseMarketMapper;
import com.xuecheng.xcservicemanagecourse.mapper.TeachplanMapper;

import com.xuecheng.xcservicemanagecourse.pojo.Category;
import com.xuecheng.xcservicemanagecourse.pojo.CategoryExample;
import com.xuecheng.xcservicemanagecourse.pojo.CourseBase;
import com.xuecheng.xcservicemanagecourse.pojo.CourseMarket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/29
 */
@Service
public class TeplanServiceImpl implements TeplanService {

    @Autowired
    private TeachplanMapper teachplanMapper;

    @Autowired
    private CategoryMapper categoryMapper;

    @Autowired
    private CourseBaseMapper courseBaseMapper;

    @Autowired
    private CourseMarketMapper courseMarketMapper;

    @Override
    public List<TeachplanNode> selectList() {

        List<TeachplanNode> teachplanNodes = teachplanMapper.selectList();

        return teachplanNodes;
    }

    @Override
    public QueryResponseResult selectBypageid(String page, String size) {

        PageHelper.startPage(Integer.parseInt(page),Integer.parseInt(size));

        List<CourseBase> courseBases = courseBaseMapper.selectByExampleWithBLOBs(null);

        QueryResult<CourseBase> categoryQueryResult = new QueryResult<>();

        categoryQueryResult.setList(courseBases);

        categoryQueryResult.setTotal(courseBases.size());

        QueryResponseResult queryResponseResult = new QueryResponseResult(CommonCode.SUCCESS, categoryQueryResult);

        return queryResponseResult;
    }

    @Override
    public int selectAllpagesize() {

        List<CourseBase> courseBases = courseBaseMapper.selectByExampleWithBLOBs(null);

        int size = courseBases.size();

        return size;
    }

    @Override
    public List<Category> selectAllcategory() {

        CategoryExample categoryExample = new CategoryExample();

        CategoryExample.Criteria criteria = categoryExample.createCriteria();

        criteria.andParentidEqualTo("1");

        List<Category> categories = categoryMapper.selectByExample(categoryExample);

        return categories;
    }

    @Override
    public ResponseResult saveCourseBase(CourseBase courseBase) {

        UUID uuid = UUID.randomUUID();

        String replace = uuid.toString().replace("-", "");

        courseBase.setId(replace);

        int insert = courseBaseMapper.insert(courseBase);

        if(insert ==0){

            return null;
        }

        ResponseResult success = ResponseResult.SUCCESS();


        return success;
    }

    @Override
    public CourseBase selectByid(String courseId) {

        CourseBase courseBase = courseBaseMapper.selectByPrimaryKey(courseId);

        return courseBase;
    }

    @Override
    public CourseMarket getCourseMarketById(String courseId) {

        CourseMarket courseMarket = courseMarketMapper.selectByPrimaryKey(courseId);

        return courseMarket;
    }

    @Override
    public ResponseResult updateCoursebase(CourseBase courseBase) {

        int i = courseBaseMapper.updateByPrimaryKeySelective(courseBase);
        if(i <1){
            return null;
        }

        ResponseResult success = ResponseResult.SUCCESS();

        return success;
    }

    @Override
    public ResponseResult updateCourseMarket(CourseMarket courseMarket) {

        int i = courseMarketMapper.updateByPrimaryKeySelective(courseMarket);

        if(i <1){
            return null;
        }

        ResponseResult success = ResponseResult.SUCCESS();

        return success;
    }
}
