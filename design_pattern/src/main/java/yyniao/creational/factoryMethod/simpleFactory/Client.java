package yyniao.creational.factoryMethod.simpleFactory;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/5 1:14 下午
 */

/*
    Static Factory Method
 */
public class Client {
    public static void main(String[] args) {
        SimpleFactory factory = new SimpleFactory();
        Product product = factory.createProduct("A");
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

class SimpleFactory {
    public static Product createProduct(String type) {
        if (type.equals("A")) {
            return new ProductA();
        } else if (type.equals("B")) {
            return new ProductB();
        } else {
            return null;
        }
    }
}
