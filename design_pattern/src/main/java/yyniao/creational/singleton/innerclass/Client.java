package yyniao.creational.singleton.innerclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/5 10:34 上午
 */
public class Client {
    public static void main(String[] args) throws Exception {
        //new Thread(() -> {
        //    InnerClassSingleton instance = InnerClassSingleton.getInstance();
        //    System.out.println(instance);
        //}).start();
        //new Thread(() -> {
        //    InnerClassSingleton instance2 = InnerClassSingleton.getInstance();
        //    System.out.println(instance2);
        //}).start();
        //
        //// 反射attack
        //Constructor<InnerClassSingleton> declaredConstructor = InnerClassSingleton.class.getDeclaredConstructor();
        //declaredConstructor.setAccessible(true);
        //InnerClassSingleton innerClassSingleton = declaredConstructor.newInstance();
        //InnerClassSingleton instance = InnerClassSingleton.getInstance();
        //System.out.println(innerClassSingleton == instance);

        //序列化
        InnerClassSingleton instance = InnerClassSingleton.getInstance();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("testSerializable"));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("testSerializable"));
        InnerClassSingleton o = ((InnerClassSingleton) ois.readObject());
        new File("testSerializable").delete();
        System.out.println(instance == o);

        oos.close();
        ois.close();
    }
}

/*
静态内部类模式：
    - 利用类加载机制保证线程安全;
    - 懒加载，在getInstance()被调用时，加载静态内部类，对instance做初始化，
 */
class InnerClassSingleton implements Serializable {
    private static final long serialVersionUID = -8336333355314802662L; //反序列化时会比对版本号

    private static class InnerClassHolder {
        private static InnerClassSingleton instance = new InnerClassSingleton();
    }

    private InnerClassSingleton() {
        // 饿汉模式对反射攻击对保护，懒汉模式没办法
        if (InnerClassHolder.instance != null)
            throw new RuntimeException("单例不允许多实例");
    }

    public static InnerClassSingleton getInstance() {
        return InnerClassHolder.instance;
    }

    //解决反序列化实例不一致的问题
    Object readResolve() throws ObjectStreamException{
        return InnerClassHolder.instance;
    }
}
