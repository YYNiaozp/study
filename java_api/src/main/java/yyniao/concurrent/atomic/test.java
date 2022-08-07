package yyniao.concurrent.atomic;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/28 11:16 上午
 */
public class test {

}
class GenericBase<T extends Integer> {
    private T element;

    public void set(T x) {
        this.element = x;
    }

    public T get() {
        return this.element;
    }
}

class Derived1<T extends Integer> extends GenericBase<T> {}



