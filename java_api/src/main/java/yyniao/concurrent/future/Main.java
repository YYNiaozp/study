package yyniao.concurrent.future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/16 11:48 上午
 */
public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        long startT = System.currentTimeMillis();

        FutureTask<Integer> task1 = new FutureTask<>(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 5;
        });

        new Thread(task1).start();

        FutureTask<Integer> task2 = new FutureTask<>(() -> {
            TimeUnit.SECONDS.sleep(3);
            return 3;
        });

        new Thread(task2).start();

        Integer i1 = task1.get();
        Integer i2 = task2.get();
        long endT = System.currentTimeMillis();
        System.out.printf("result: %d, timeCost: %d", i1 + i2, endT - startT);
    }
}
