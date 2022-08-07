package yyniao.creational.factoryMethod;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/5 1:14 下午
 */
/*
    Factory Method

    定义：
        定义一个用于创建对象的接口，让子类决定实例化哪一个类。Factory Method 使得一个类的实例化延迟到子类

    应用场景：
        - 不知道使用对象的确切类型到时
        - 为库或框架停工扩展其内部组件的方法时

    优点：
        - 将具体产品与创建者解耦
        - 单一职责原则
        - 开闭原则

    源码：
        - 静态工厂方法
            Calendar.getInstance();
            NumberFormat.getInstance();
            ResourceBundle.getBundle(...);
        - 工厂方法
            URLStreamHandlerFactory;
 */
public class Client {
    public static void main(String[] args) {
        Factory factory;
        Product product;

        //A
        factory = new ProductAFactory();
        product = factory.createProduct();
        product.method1();

        //B
        factory = new ProductBFactory();
        product = factory.createProduct();
        product.method1();
    }
}

interface Product {
    void method1();
}

class ProductA implements Product {
    @Override
    public void method1() {
        System.out.println("A m1");
    }
}

class ProductB implements Product {
    @Override
    public void method1() {
        System.out.println("B m1");
    }
}

abstract class Factory {
    abstract Product createProduct();
}

class ProductAFactory extends Factory {
    @Override
    Product createProduct() {
        //...
        return new ProductA();
    }
}

class ProductBFactory extends Factory {
    @Override
    Product createProduct() {
        //...
        return new ProductB();
    }
}
