package yyniao.concurrent.lock;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/23 5:24 下午
 */
public class Cache {
    static Map<String, Object> map = new HashMap<>();
    static ReadWriteLock rwl = new ReentrantReadWriteLock();
    static Lock r = rwl.readLock();
    static Lock w = rwl.writeLock();

    public static final Object get(String key) {
        r.lock();
        try {
            return map.get(key);
        } finally {
            r.unlock();
        }
    }

    public static final Object put(String key, Object value) {
        w.lock();
        try {
            return map.put(key, value);
        } finally {
            w.unlock();
        }
    }

    public static final void clear(){
        w.lock();
        try {
            map.clear();
        } finally {
            w.unlock();
        }
    }

    public static final void processData(){
        boolean update = false;
        r.lock();
        if (!update) {
            //必须先释放读锁
            r.unlock();
            //锁降级从写锁获取到开始
            w.lock();
            try {
                if (!update){
                    //准备数据到流程
                    update = true;
                }
                r.lock();
            } finally {
                w.unlock();
            }
            //锁降级完成，写降级为读
        }

        try {
            //使用数据读流程
        } finally {
            r.unlock();
        }
    }
}
