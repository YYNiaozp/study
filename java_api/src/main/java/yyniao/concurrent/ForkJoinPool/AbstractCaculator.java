package yyniao.concurrent.ForkJoinPool;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/6/28 7:42 下午
 */
abstract public class AbstractCaculator implements Calculator{
    protected String name;

    public AbstractCaculator(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void close(){

    }
}
