package yyniao.concurrent.thread.communication;

import com.yyniao.concurrent.thread.base.SleepUtil;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 10:46 下午
 */
public class Profiler {
    //第一次get()方法调用时会初始化(如果set()方法没有调用)，每个线程会调用一次
    private static final ThreadLocal<Long> TIME_THREADLOCAL = ThreadLocal.withInitial(System::currentTimeMillis);

    public static void begin() {
        TIME_THREADLOCAL.set(System.currentTimeMillis());
    }

    public static long end() {
        return System.currentTimeMillis() - TIME_THREADLOCAL.get();
    }

    public static void main(String[] args) {
        Profiler.begin();
        SleepUtil.second(1);
        System.out.printf("Cost: %d mills", Profiler.end());
    }
}
