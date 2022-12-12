package com.yyniao.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/17 00:36
 */
@FeignClient("eurekaClient")
public interface HiProxy {

    @GetMapping("/hi")
    String hi(@RequestParam(defaultValue = "test") String name);
}