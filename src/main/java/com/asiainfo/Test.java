package com.asiainfo;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;

import java.io.IOException;

/**
 * 复制本地文件到hdfs上
 * 【执行 hadoop jar HadoopFileOperateTest.jar】
 * 【执行 hadoop fs -cat /user/zheng/test_wang 查看】
 * Created by AI on 2017/4/10.
 */
public class Test {
    public static void main(String [] args) throws IOException {
        Configuration conf = new Configuration();
        FileSystem hdfs = FileSystem.get(conf);
        System.out.println("=======start=========");
        hdfs.copyFromLocalFile(false, new Path("/data/zheng/test_wang/test.log"), new Path("/user/zheng/test_wang"));
        System.out.println("=======end=========");
    }
}
