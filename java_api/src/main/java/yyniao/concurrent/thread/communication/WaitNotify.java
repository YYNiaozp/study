package yyniao.concurrent.thread.communication;

import yyniao.concurrent.thread.base.SleepUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 9:31 下午
 */
public class WaitNotify {
    public static void main(String[] args) {
        Thread wt = new Thread(new Wait(), "WT");
        wt.start();
        SleepUtils.second(5);
        Thread nt = new Thread(new Notify(), "NT");
        nt.start();
    }


    static boolean flag = true;
    static final Object lock = new Object();

    static class Wait implements Runnable {
        @Override
        public void run() {
            // 加锁，拥有lock的Monitor
            synchronized (lock) {
                while (flag) {
                    System.out.println(Thread.currentThread() + " flag: true. wait @ "
                            + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                    try {
                        lock.wait();
                    } catch (InterruptedException e){
                    }
                }
                // 条件满足时，完成工作
                System.out.println(Thread.currentThread() + " flag: true. running @ "
                        + new SimpleDateFormat("HH:mm:ss").format(new Date()));

            }
        }
    }

    static class Notify implements Runnable {
        @Override
        public void run() {
            // 加锁，拥有lock的Monitor
            synchronized (lock) {
                // 获取锁，然后通知，通知时不会释放锁，
                // 直到当前线程释放锁后，WT才能从wait方法中返回
                System.out.println(Thread.currentThread() + " hold lock. notify @ "
                        + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                flag = false;
                lock.notifyAll();
                SleepUtils.second(5);
            }
            //再次加锁
            synchronized (lock) {
                System.out.println(Thread.currentThread() + " hold lock again. notify @ "
                        + new SimpleDateFormat("HH:mm:ss").format(new Date()));
                SleepUtils.second(5);
            }
        }
    }
}
