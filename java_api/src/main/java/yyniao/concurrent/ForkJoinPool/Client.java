package yyniao.concurrent.ForkJoinPool;


import yyniao.concurrent.ForkJoinPool.impl.ForkJoinCalculator;

import java.time.Duration;
import java.time.Instant;
import java.util.stream.LongStream;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/6/28 7:36 下午
 */
public class Client {

    public static void main(String[] args) {
        //test(new ForLoopCalculator("forLoop"));
        //test(new ParallismCalculator("parallism"));
        //test(new ExecutorServiceCalculator("executorService"));
        test(new ForkJoinCalculator("forkJoin"));
    }



    public static void test(AbstractCaculator calculator){
        long[] numbers = LongStream.rangeClosed(1, 10000000).toArray();

        Instant start = Instant.now();
        long result = calculator.sumUp(numbers);
        Instant end = Instant.now();
        calculator.close();
        System.out.println(calculator.getName());
        System.out.println("\t耗时：" + Duration.between(start, end).toMillis() + "ms");
        System.out.println("\t结果为：" + result);
    }
}
