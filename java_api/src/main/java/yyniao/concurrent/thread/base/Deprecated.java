package yyniao.concurrent.thread.base;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 6:47 下午
 */
public class Deprecated {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        Thread thread = new Thread(new runner(), "DT");
        thread.setDaemon(true);

        thread.start();
        SleepUtil.second(3);

        thread.suspend();
        System.out.println("main suspend ST at " + format.format(new Date()));
        SleepUtil.second(3);

        thread.resume();
        System.out.println("main resume ST at " + format.format(new Date()));
        SleepUtil.second(3);

        thread.stop();
        System.out.println("main stop ST at " + format.format(new Date()));
        SleepUtil.second(3);
    }

    static class runner implements Runnable {
        @Override
        public void run() {
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
            while (true) {
                System.out.println(Thread.currentThread().getName() + " Run at " + format.format(new Date()));
                SleepUtil.second(1);
            }
        }
    }
}
