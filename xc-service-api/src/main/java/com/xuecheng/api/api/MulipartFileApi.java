package com.xuecheng.api.api;




import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import com.xuecheng.framework.model.response.QueryResponseResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/15
 */
@Api(value = "图片上传",description = "用于后台图片上传的类")
public interface MulipartFileApi {

    @ApiOperation("图片上传方法")
    public UploadFileResult upload(MultipartFile multipartFile,String filetag,String businesskey,String metadata);


}
