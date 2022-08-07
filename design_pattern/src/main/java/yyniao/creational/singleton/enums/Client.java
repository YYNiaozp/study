package yyniao.creational.singleton.enums;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/5 11:12 上午
 */
public class Client {
    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.INSTANCE;
        EnumSingleton instance2 = EnumSingleton.INSTANCE;
        System.out.println(instance == instance2);
    }
}

/*
    jvm保证线程安全，反射安全，反序列化安全
 */
enum EnumSingleton{
    INSTANCE;

    public void print(){
        System.out.println(this.hashCode());
    }
}
