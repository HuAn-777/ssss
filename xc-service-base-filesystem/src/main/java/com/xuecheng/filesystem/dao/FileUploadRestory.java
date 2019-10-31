package com.xuecheng.filesystem.dao;

import com.xuecheng.framework.domain.filesystem.FileSystem;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author HuAn
 * @email huan4587@163.com
 * @date 2019/10/31
 */
public interface FileUploadRestory extends MongoRepository<FileSystem,String> {
}
