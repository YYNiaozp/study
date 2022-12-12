package com.yyniao;

import lombok.Getter;
import lombok.Setter;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/26 20:26
 */
@Getter
@Setter
public class MyException extends Exception {
    private String myMessage;

    public MyException(String myMessage) {
        this.myMessage = myMessage;
    }
}
