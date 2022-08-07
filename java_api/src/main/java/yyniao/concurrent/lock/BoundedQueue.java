package yyniao.concurrent.lock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/23 7:40 下午
 */
public class BoundedQueue<T extends Object> {
    private T[] items;
    private int addI, removeI, count;
    private ReentrantLock lock = new ReentrantLock();
    private Condition notEmpty = lock.newCondition();
    private Condition notFull = lock.newCondition();

    public BoundedQueue(int size) {
        items = (T[]) new Object[size];
    }

    public void add(T t) throws InterruptedException {
        lock.lock();
        try {
            while (count == items.length)
                notFull.await();
            items[addI++] = t;
            if (addI == items.length)
                addI = 0;
            ++count;
            notEmpty.signal();
        } finally {
            lock.unlock();
        }
    }

    public T remove() throws InterruptedException {
        lock.lock();
        try {
            while (count == 0)
                notEmpty.await();
            T item = items[removeI++];
            if (removeI == items.length)
                removeI = 0;
            --count;
            notFull.signal();
            return item;
        } finally {
            lock.unlock();
        }
    }
}
