package com.yyniao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.zookeeper.discovery.ZookeeperDiscoveryProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/29 11:31
 */
@RestController
public class TestController {
    @Autowired
    ZookeeperDiscoveryProperties z;
    @GetMapping("/test")
    public Object test(){
        return z.toString();
    }
}
