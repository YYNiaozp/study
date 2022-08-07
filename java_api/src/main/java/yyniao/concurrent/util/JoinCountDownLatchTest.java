package yyniao.concurrent.util;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/23 10:38 下午
 */
public class JoinCountDownLatchTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> System.out.println("t1 finish"));
        Thread t2 = new Thread(() -> System.out.println("t2 finish"));
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("all t finish");
    }
}

