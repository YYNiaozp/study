package yyniao.concurrent.thread.base;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 1:19 下午
 */
public class ThreadState {
    public static void main(String[] args) {
        new Thread(new TimeWaiting(), "TWT").start();
        new Thread(new Waiting(), "WT").start();
        //使用两个Blocked，一个获取锁，另一个被阻塞
        new Thread(new Blocked(), "BT-1").start();
        new Thread(new Blocked(), "BT-2").start();
    }

    //该进程不断休眠
    static class TimeWaiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                SleepUtils.second(100);
            }
        }
    }

    //该线程在Waiting.class实例上等待
    static class Waiting implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (Waiting.class) {
                    try {
                        Waiting.class.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    static class Blocked implements Runnable {
        @Override
        public void run() {
             synchronized (Blocked.class){
                 while (true){
                     SleepUtils.second(100);
                 }
             }
        }
    }
}
