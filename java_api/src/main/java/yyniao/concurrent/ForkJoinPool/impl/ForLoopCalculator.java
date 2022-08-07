package yyniao.concurrent.ForkJoinPool.impl;

import yyniao.concurrent.ForkJoinPool.AbstractCaculator;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/6/28 6:46 下午
 */
public class ForLoopCalculator extends AbstractCaculator {
    public ForLoopCalculator(String name) {
        super(name);
    }

    @Override
    public long sumUp(long[] numbers) {
        long total = 0;
        for (long i : numbers) {
            total += i;
        }
        return total;
    }
}
