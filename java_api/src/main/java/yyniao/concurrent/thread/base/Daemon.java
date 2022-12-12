package yyniao.concurrent.thread.base;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 1:41 下午
 */
public class Daemon {
    public static void main(String[] args) {
        Thread thread = new Thread(new DaemonRunner(), "DT");
        thread.setDaemon(true);
        thread.start();
    }

    static class DaemonRunner implements Runnable {
        @Override
        public void run() {
            try {
                SleepUtils.second(3);
            } finally {
                //在构建Daemon线程时，不能依靠finally块中的内容来确保执行关闭或清理资源的逻辑
                //not execute
                System.out.println("DT finally run.");
            }
        }
    }
}
