package com.yyniao.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhang.peng
 * @Date: 2022/8/16 23:32
 */
@RestController()
public class HiController {

    @GetMapping("/hi")
    public String hi(@RequestParam(defaultValue = "test") String name) {
        return "hi " + name;
    }
}