package yyniao.concurrent.thread.communication;

import yyniao.concurrent.thread.base.SleepUtils;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 7:11 下午
 */
public class Interrupted {

    public static void main(String[] args) {
        //sleepThread不停的尝试睡眠
        Thread st = new Thread(new SleepRunner(), "ST");
        st.setDaemon(true);
        //busyThread不停的运行
        Thread bt = new Thread(new BusyRunner(), "BT");
        bt.setDaemon(true);
        st.start();
        bt.start();

        //休眠5s, 让st，bt充分运行
        SleepUtils.second(5);
        st.interrupt();
        bt.interrupt();
        System.out.println("ST interrupted is " + st.isInterrupted());
        System.out.println("BT interrupted is " + bt.isInterrupted());

        //防止st，bt立即退出
        SleepUtils.second(2);
    }


    static class SleepRunner implements Runnable{
        @Override
        public void run() {
            SleepUtils.second(10);
        }
    }

    static class BusyRunner implements Runnable {
        @Override
        public void run() {
            while (true);
        }
    }
}
