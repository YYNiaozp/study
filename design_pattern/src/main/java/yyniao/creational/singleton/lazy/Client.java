package yyniao.creational.singleton.lazy;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/4 11:23 下午
 */

/*
    应用：
    JDK: Runtime、Currency(序列化机制，享元模式)、
    Spring: DefaultSingletonBeanRegistry、ReactiveAdapterRegistry、ProxyFactoryBean
 */
public class Client {
    public static void main(String[] args) {
        new Thread(()->{
            LazySingleton instance = LazySingleton.getInstance();
            System.out.println(instance);
        }).start();
        new Thread(()->{
            LazySingleton instance2 = LazySingleton.getInstance();
            System.out.println(instance2);
        }).start();
    }
}

class LazySingleton {
    private volatile static LazySingleton instance;

    private LazySingleton() {
    }

    //double check
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null)
                    // 但是这种双重检测机制在JDK1.5之前是有问题的，问题还是出在//1，由所谓的无序写入造成的。一般来讲，当初始化一个对象的时候，
                    // 会经历内存分配、初始化、返回对象在堆上的引用等一系列操作，这种方式产生的对象是一个完整的对象，可以正常使用。但是JAVA的
                    // 无序写入可能会造成顺序的颠倒，即内存分配、返回对象引用、初始化的顺序，这种情况下对应到//1就是singleton已经不是null，
                    // 而是指向了堆上的一个对象，但是该对象却还没有完成初始化动作。当后续的线程发现singleton不是null而直接使用的时候，就会
                    // 出现意料之外的问题

                    //JDK1.5之后，可以使用volatile关键字修饰变量来解决无序写入产生的问题，因为volatile关键字的一个重要作用是禁止指令重排序

                    //字节码层
                    //JIT，CPU
                    //1. 分配空间
                    //3. 引用赋值
                    //2. 初始化
                    instance = new LazySingleton(); //指令重排
            }
        }
        return instance;
    }
}