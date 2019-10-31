package com.xuecheng.filesystem.service;

import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/31
 */
public interface FileUploadService {

    public UploadFileResult upload(MultipartFile multipartFile, String filetag, String businesskey, String metadata);
}
