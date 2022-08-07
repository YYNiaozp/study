package yyniao.concurrent.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/23 11:44 下午
 */
public class SemaphoreTest {
    static final int THREAD_COUNT = 30;
    static ExecutorService executorService = Executors.newFixedThreadPool(30);
    static Semaphore semaphore = new Semaphore(10);

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) {
            executorService.submit(()->{
                try {
                    semaphore.acquire();
                    TimeUnit.SECONDS.sleep(1);
                    System.out.println("save data. left: "+semaphore.availablePermits() + ", queue length: " + semaphore.getQueueLength());
                    semaphore.release();
                } catch (InterruptedException e) {
                }
            });
        }
    }

}
