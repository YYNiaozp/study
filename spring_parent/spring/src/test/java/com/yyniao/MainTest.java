package com.yyniao;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import yyniao.pojo.User;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/25 15:55
 */
public class MainTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user);
    }
}
