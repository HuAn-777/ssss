package com.xuecheng.filesystem.service;

import com.xuecheng.filesystem.dao.FileUploadRestory;
import com.xuecheng.framework.domain.filesystem.FileSystem;
import com.xuecheng.framework.domain.filesystem.response.UploadFileResult;
import com.xuecheng.framework.model.response.CommonCode;
import org.csource.fastdfs.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.util.UUID;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/31
 */
@Service
public class FileUploadServiceImpl implements FileUploadService {

    @Autowired
    private FileUploadRestory fileUploadRestory;

    @Value("${xuecheng.fastdfs.tracker_servers}")
    String tracker_servers;
    @Value("${xuecheng.fastdfs.connect_timeout_in_seconds}")
    int connect_timeout_in_seconds;
    @Value("${xuecheng.fastdfs.network_timeout_in_seconds}")
    int network_timeout_in_seconds;
    @Value("${xuecheng.fastdfs.charset}")
    String charset;


    @Override
    public UploadFileResult upload(MultipartFile multipartFile, String filetag, String businesskey, String metadata) {

        try {
            ClientGlobal.initByTrackers(tracker_servers);

            ClientGlobal.setG_connect_timeout(connect_timeout_in_seconds);

            ClientGlobal.setG_charset(charset);

            ClientGlobal.setG_network_timeout(network_timeout_in_seconds);

            TrackerClient trackerClient = new TrackerClient();

            TrackerServer connection = trackerClient.getConnection();

            StorageServer storeStorage = trackerClient.getStoreStorage(connection);

            StorageClient1 storageClient1 = new StorageClient1(connection, storeStorage);

            byte[] bytes = multipartFile.getBytes();

            String originalFilename = multipartFile.getOriginalFilename();

            String name = originalFilename.substring(originalFilename.lastIndexOf(".") + 1);

            String s = storageClient1.upload_file1(bytes, name, null);

            FileSystem fileSystem = new FileSystem();

            fileSystem.setFileId(s);

            fileSystem.setFilePath(s);

            fileSystem.setFileName(originalFilename);

            FileSystem save = fileUploadRestory.save(fileSystem);

           return new UploadFileResult(CommonCode.SUCCESS,save);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
