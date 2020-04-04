package com.manage.demo.util;

import ch.qos.logback.core.util.FileUtil;
import com.aliyun.oss.OSSClient;
import com.aliyun.oss.model.GetObjectRequest;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * @author sar
 */
public class cdn {
    public void upload(String objectName,String localFile){
        String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIQjAn1lv7MYo5";
        String accessKeySecret = "rNGaaLAuRGFaeEvkGgHbL3fhhHaHeh";

// 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

// 上传文件。<yourLocalFile>由本地文件路径加文件名包括后缀组成，例如/users/local/myfile.txt。
        ossClient.putObject("superljc", objectName, new File(localFile));

// 关闭OSSClient。
        ossClient.shutdown();
    }
    public void delete(String objectName){
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIQjAn1lv7MYo5";
        String accessKeySecret = "rNGaaLAuRGFaeEvkGgHbL3fhhHaHeh";
        String bucketName = "superljc";
//        String objectName = "<yourObjectName>";

// 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

// 删除文件。
        ossClient.deleteObject(bucketName, objectName);

// 关闭OSSClient。
        ossClient.shutdown();
    }
    public String download(String objectName,String localFile) throws IOException {
        // Endpoint以杭州为例，其它Region请按实际情况填写。
        String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
// 阿里云主账号AccessKey拥有所有API的访问权限，风险很高。强烈建议您创建并使用RAM账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建RAM账号。
        String accessKeyId = "LTAIQjAn1lv7MYo5";
        String accessKeySecret = "rNGaaLAuRGFaeEvkGgHbL3fhhHaHeh";
        String bucketName = "superljc";
        String jsonString = null;
        File file =new File(localFile);
        //String objectName = "<yourObjectName>";

// 创建OSSClient实例。
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);

// 下载OSS文件到本地文件。如果指定的本地文件存在会覆盖，不存在则新建。
        ossClient.getObject(new GetObjectRequest(bucketName, objectName), file);

// 关闭OSSClient。
        ossClient.shutdown();
        jsonString = FileUtils.readFileToString(file);
        return jsonString;

    }

    public static void main(String[] args) {

        cdn cdn = new cdn();

        cdn.upload("xxx" , "/home/sar/下载/business.csv");
        System.out.println("sucess");
    }


}
