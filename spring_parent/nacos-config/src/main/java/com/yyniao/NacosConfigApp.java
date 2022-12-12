package com.yyniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/13 10:50
 */

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
public class NacosConfigApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosConfigApp.class, args);
    }
}
