package yyniao.concurrent.thread.base;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 7:43 下午
 */
public class Shutdown {

    public static void main(String[] args) {
        Thread ct1 = new Thread(new CountRunner(), "CT1");
        ct1.start();

        //睡眠1s，main对ct2进行中断，ct感知中断结束
        SleepUtils.second(1);
        ct1.interrupt();

        CountRunner target = new CountRunner();
        Thread ct2 = new Thread(target, "CT2");
        ct2.start();
        //睡眠1s，main对ct2进行cancel，ct感知结束
        SleepUtils.second(1);
        target.cancel();
    }

    static class CountRunner implements Runnable {
        private long i;
        private volatile boolean on = true;

        @Override
        public void run() {
            while (on && !Thread.currentThread().isInterrupted()) {
                i++;
            }
            System.out.println("Count i = " + i);
        }

        public void cancel() {
            on = false;
        }
    }
}
