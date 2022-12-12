package com.yyniao;

import jdk.nashorn.internal.objects.annotations.Property;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.CircuitBreaker;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/26 19:09
 */

/**
 * <a href="https://blog.csdn.net/cckevincyh/article/details/112347200">Spring Boot中使用Spring-Retry重试框架</a>
 */
@Service
@Slf4j
public class RetryService {
    @Retryable(value = IllegalAccessException.class)
    public void service1() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException("manual exception");
    }

    @Retryable(include = IllegalAccessException.class, maxAttempts = 5)
    public void service2() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException("manual exception");
    }

    @Retryable(value = IllegalAccessException.class, maxAttemptsExpression = "${maxAttempts}")
    public void service3() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException("manual exception");
    }

    @Retryable(value = IllegalAccessException.class, maxAttemptsExpression = "#{1+1}")
    public void service3_1() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException("manual exception");
    }

    @Retryable(value = IllegalAccessException.class, maxAttemptsExpression = "#{${maxAttempts}}")//效果和上面的一样
    public void service3_2() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException("manual exception");
    }

    @Retryable(value = IllegalAccessException.class, exceptionExpression = "message.contains('test')")
    public void service4(String exceptionMessage) throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException(exceptionMessage);
    }

    @Retryable(value = IllegalAccessException.class, exceptionExpression = "#{message.contains('test')}")
    public void service4_3(String exceptionMessage) throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException(exceptionMessage);
    }

    @Retryable(value = IllegalAccessException.class, exceptionExpression = "#{@retryService.checkException(#root)}")
    public void service5(String exceptionMessage) throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException(exceptionMessage);
    }

    @Retryable(value = IllegalAccessException.class, exceptionExpression = "@retryService.checkException(#root)")
    public void service5_1(String exceptionMessage) throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException(exceptionMessage);
    }

    public boolean checkException(Exception e) {
        log.error("error message:{}", e.getMessage());
        return true; //返回true的话表明会执行重试，如果返回false则不会执行重试
    }

    @Retryable(exceptionExpression = "#{#root instanceof T(java.lang.IllegalAccessException)}") //判断exception的类型
    public void service5_2(String exceptionMessage) {
        log.info("do something... {}", LocalDateTime.now());
        throw new NullPointerException(exceptionMessage);
    }

    @Retryable(exceptionExpression = "#root instanceof T(java.lang.IllegalAccessException)")
    public void service5_3(String exceptionMessage) {
        log.info("do something... {}", LocalDateTime.now());
        throw new NullPointerException(exceptionMessage);
    }

    @Retryable(exclude = MyException.class)
    public void service6(String exceptionMessage) throws MyException {
        log.info("do something... {}", LocalDateTime.now());
        throw new MyException(exceptionMessage);
    }

    @Retryable(value = IllegalAccessException.class,
            backoff = @Backoff(value = 2000))
    public void service7() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException();
    }

    //delay 比 value 优先级更高
    @Retryable(value = IllegalAccessException.class,
            backoff = @Backoff(value = 2000,delay = 500))
    public void service8() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException();
    }

    //延迟倍数，默认 0
    @Retryable(value = IllegalAccessException.class,maxAttempts = 4,
            backoff = @Backoff(delay = 2000, multiplier = 2))
    public void service9() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException();
    }

    @Retryable(value = IllegalAccessException.class,maxAttempts = 4,
            backoff = @Backoff(delay = 2000, multiplier = 2,maxDelay = 5000))
    public void service10() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException();
    }

    @Retryable(value = IllegalAccessException.class)
    public void service11() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        throw new IllegalAccessException();
    }

    /**
     * 当@Retryable方法重试失败之后，最后就会调用@Recover方法。用于@Retryable失败时的“兜底”处理方法。 @Recover的方法必须
     * 要与@Retryable注解的方法保持一致，第一入参为要重试的异常，其他参数与@Retryable保持一致，返回值也要一样，否则无法执行！
     */
    @Recover
    public void recover11(IllegalAccessException e) {
        log.info("service retry after Recover => {}", e.getMessage());
    }


    @Retryable(value = ArithmeticException.class)
    public int service12() throws IllegalAccessException {
        log.info("do something... {}", LocalDateTime.now());
        return 1 / 0;
    }

    @Recover
    public int recover12(ArithmeticException e) {
        log.info("service retry after Recover => {}", e.getMessage());
        return 0;
    }

    // openTimeout时间范围内失败maxAttempts次数后，熔断打开resetTimeout时长
    @CircuitBreaker(openTimeout = 1000, resetTimeout = 3000, value = NullPointerException.class)
    public void circuitBreaker(int num) {
        log.info(" 进入断路器方法num={}", num);
        if (num > 8) return;
        Integer n = null;
        System.err.println(1 / n);
    }


    @Recover
    public void recover(NullPointerException e) {
        log.info("service retry after Recover => {}", e.getMessage());
    }
}
