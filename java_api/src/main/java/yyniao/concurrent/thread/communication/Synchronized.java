package yyniao.concurrent.thread.communication;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 7:56 下午
 */
public class Synchronized {
    public static void main(String[] args) {
        // 对Synchronized.class加锁
        synchronized (Synchronized.class){
        }
        // 静态同步方法，对Synchronized.class加锁
        m();


    }

    public static synchronized void m() {
    }
}
