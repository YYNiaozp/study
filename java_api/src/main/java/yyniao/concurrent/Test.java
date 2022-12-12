package yyniao.concurrent;

import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.locks.LockSupport;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/7/8 15:34
 */
public class Test {

    public static void main(String[] args) throws UnknownHostException {
        System.out.println("123".hashCode());
        System.out.println("123".hashCode());
        System.out.println(Test.class.getClassLoader());
        System.out.println(ClassLoader.getSystemClassLoader());
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName.getHostName());
        System.out.println(byName.getHostAddress());
    }
}
