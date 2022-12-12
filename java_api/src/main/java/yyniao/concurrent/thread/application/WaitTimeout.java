package yyniao.concurrent.thread.application;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 11:35 下午
 */
public class WaitTimeout {

    public synchronized Object get(long mills, Object defaultV) throws InterruptedException{
        long future = mills + System.currentTimeMillis();
        long remaining = mills;
        Object res = null; //
        while (res == null && remaining > 0) {
            wait(remaining);
            remaining = future - System.currentTimeMillis();
        }
        return defaultV;
    }

    public static void main(String[] args) {

    }
}
