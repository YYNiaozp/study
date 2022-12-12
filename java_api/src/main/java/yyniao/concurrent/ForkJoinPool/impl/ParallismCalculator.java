package yyniao.concurrent.ForkJoinPool.impl;

import yyniao.concurrent.ForkJoinPool.AbstractCaculator;

import java.util.Arrays;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/6/28 7:13 下午
 */
public class ParallismCalculator extends AbstractCaculator {

    public ParallismCalculator(String name) {
        super(name);
    }

    //采用并行流（JDK8以后的推荐做法
    //并行流底层还是Fork/Join框架，只是任务拆分优化得很好
    @Override
    public long sumUp(long[] numbers) {
        long result = Arrays.stream(numbers).parallel().reduce(0, Long::sum);
        return result;
    }
}
