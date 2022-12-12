package com.yyniao.controller;

import com.yyniao.proxy.HiProxy;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/17 02:43
 */
@RestController
public class TestController {
    @Autowired
    private HiProxy hiProxy;

    @GetMapping("/test/{name}")
    public String test(@PathVariable String name){
        System.out.println(name);
        return hiProxy.hi(name);
    }
}
