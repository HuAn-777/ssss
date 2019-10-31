package com.xuecheng.api.api;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/31
 */
@Api(value = "图片上传",description = "用于后台图片上传的类")
public interface CoursePicApi {


    @ApiOperation("图片上传方法")
    public ResponseResult addPic(String courseId,String pic);
}
