package yyniao.creational.singleton.hungry;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/5 10:19 上午
 */
public class Client {
    public static void main(String[] args) {
        new Thread(() -> {
            HungrySingleton instance = HungrySingleton.getInstance();
            System.out.println(instance);
        }).start();
        new Thread(() -> {
            HungrySingleton instance2 = HungrySingleton.getInstance();
            System.out.println(instance2);
        }).start();
    }
}


/*
饿汉模式
类加载到初始化阶段就完成类实例到初始化。本质上就是借助jvm类加载机制，保证类实例到单例
    类加载过程
    1. 加载二进制数据到内存，生成对应到Class数据结构
    2. 连接：a.准备, b.准备（给类到静态成员变量赋默认值）, c.解析
    3. 初始化：给类到静态变量赋初始值  //instance 在该处被赋值
 */
class HungrySingleton {
    private static HungrySingleton instance = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return instance;
    }
}
