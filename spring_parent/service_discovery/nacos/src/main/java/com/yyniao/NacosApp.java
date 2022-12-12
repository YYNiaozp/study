package com.yyniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/13 11:04
 */
@EnableDiscoveryClient
@SpringBootApplication
public class NacosApp {
    public static void main(String[] args) {
        SpringApplication.run(NacosApp.class, args);
    }
}
