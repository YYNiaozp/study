package yyniao.concurrent.util;

import java.util.concurrent.Exchanger;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/24 12:00 上午
 */
public class ExchangerTest {
    static Exchanger<String> exchanger = new Exchanger<>();
    static ExecutorService executor = Executors.newFixedThreadPool(2);

    public static void main(String[] args) {
        executor.execute(()->{
            String A = "AAA";
            try {
                exchanger.exchange(A);
            } catch (InterruptedException e) {
            }
        });

        executor.execute(()->{
            String B = "BBB";
            try {
                String A = exchanger.exchange(B);
                System.out.println("A: " + A + ", B: "+B);
            } catch (InterruptedException e) {
            }
        });
    }
}
