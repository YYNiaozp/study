package com.yyniao.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/17 10:44
 */
@RestController
public class TestController {
    /**
     * HystrixProperty的参数可参考 hystrixCommandProperties
     * 熔断触发降级
     * @return
     */
    @GetMapping("/cb/{num}")
    @HystrixCommand(commandProperties  = {
            @HystrixProperty(name = "circuitBreaker.enabled" ,value = "true"),
            @HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value ="5"), //最小请求次数
            @HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds" , value ="5000"),  //熔断时间5秒
            @HystrixProperty(name="circuitBreaker.errorThresholdPercentage",value = "50")  //错误流程比例

    } ,fallbackMethod = "fallback")
    public String circuitBreaker(@PathVariable("num")int num){
        if(num%2==0){
            return "正常访问";
        }

        throw new RuntimeException("");
    }

    //请求服务方法和回调方法，入参要一致，不然会报错的
    public String fallback(int num){
        return "熔断触发降级";
    }

    /**
     * 超时时间触发降级
     * @return
     */
    @GetMapping("/timeout")
    @HystrixCommand(commandProperties  = {
            @HystrixProperty(name = "execution.timeout.enabled" , value = "true"),
            @HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds" , value = "1000"),
    } ,fallbackMethod = "fallback")
    public String timeOut() throws InterruptedException {
        Thread.sleep(10000) ;
        return "正常访问";

    }

    //请求服务方法和回调方法，入参要一致，不然会报错的
    public String fallback(){
        return "熔断触发降级";
    }
}
