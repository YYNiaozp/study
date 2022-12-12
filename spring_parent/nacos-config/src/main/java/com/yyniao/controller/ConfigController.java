package com.yyniao.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/13 10:53
 */

@RestController
@RequestMapping("/config")
@RefreshScope
public class ConfigController {

    @Value("${czxy.message:'默认值'}")
    private String msg;

    /**
     * http://localhost:8072/config/get
     */
    @RequestMapping("/get")
    public String get() {
        return msg;
    }
}