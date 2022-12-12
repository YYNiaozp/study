package com.yyniao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/26 19:05
 */
@SpringBootApplication
@EnableRetry
public class RetryApp {
    public static void main(String[] args) {
        SpringApplication.run(RetryApp.class, args);
    }
}
