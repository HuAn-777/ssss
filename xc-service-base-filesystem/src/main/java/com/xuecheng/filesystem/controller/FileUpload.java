package com.xuecheng.filesystem.controller;

import com.xuecheng.api.api.MulipartFileApi;
import com.xuecheng.filesystem.service.FileUploadService;
import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/31
 */
@Controller
@RequestMapping("/filesystem")
public class FileUpload implements MulipartFileApi {

    @Autowired
    private FileUploadService fileUploadService;

    @Override
    @PostMapping("/upload")
    @ResponseBody
    public UploadFileResult upload(@RequestParam("file") MultipartFile multipartFile, String filetag, String businesskey, String metadata) {

        UploadFileResult upload = fileUploadService.upload(multipartFile, filetag, businesskey, metadata);

        return upload;
    }
}
