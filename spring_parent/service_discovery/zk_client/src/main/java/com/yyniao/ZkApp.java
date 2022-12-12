package com.yyniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/29 10:03
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ZkApp {
    public static void main(String[] args) {
        SpringApplication.run(ZkApp.class, args);
    }
}
