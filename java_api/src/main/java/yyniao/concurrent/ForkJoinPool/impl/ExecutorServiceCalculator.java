package yyniao.concurrent.ForkJoinPool.impl;


import yyniao.concurrent.ForkJoinPool.AbstractCaculator;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/6/28 6:50 下午
 */
public class ExecutorServiceCalculator extends AbstractCaculator {
    private int parallism;
    private ExecutorService pool;

    public ExecutorServiceCalculator(String name) {
        super(name);
        this.parallism = Runtime.getRuntime().availableProcessors();    //CPU cores
        this.pool = Executors.newFixedThreadPool(parallism);
    }

    //处理计算任务的线程
    private static class SumTask implements Callable<Long> {
        private long[] numbers;
        private int from;
        private int to;

        public SumTask(long[] numbers, int from, int to) {
            this.numbers = numbers;
            this.from = from;
            this.to = to;
        }

        @Override
        public Long call() throws Exception {
            long total = 0;
            for (int i = from; i <= to; i++) {
                total += numbers[i];
            }
            return total;
        }
    }

    @Override
    public long sumUp(long[] numbers) {
        List<Future<Long>> results = new ArrayList<>();

        // 把任务分解为 n 份，交给 n 个线程处理   4核心 就等分成4份呗
        // 然后把每一份都扔个一个SumTask线程 进行处理
        int part = numbers.length / parallism;
        for (int i = 0; i < parallism; i++) {
            int from = i * part;
            int to = (i == parallism - 1) ? numbers.length - 1 : (i + 1) * part - 1;

            //交给线程池计算
            results.add(pool.submit(new SumTask(numbers, from, to)));
        }

        // 把每个线程的结果相加，得到最终结果 get()方法 是阻塞的
        // 优化方案：可以采用CompletableFuture来优化  JDK1.8的新特性
        long total = 0L;
        for (Future<Long> f : results) {
            try {
                total += f.get();
            } catch (Exception e) {
            }
        }

        return total;
    }

    public void close(){
        pool.shutdown();
    }
}
