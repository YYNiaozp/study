package yyniao.creational.prototype;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/6 1:20 下午
 */
/*
    prototype
    定义：实现Cloneable，深拷贝、序列化实现(不推荐，cpu)，数组容器浅拷贝

    应用：代码不应该依赖于需要复制的对象的具体类时

    优点：
        - 可以不耦合具体类的情况下克隆对象
        - 避免重复的初始化代码
        - 更方便的构建复杂对象

    源码：
        spring：AbstractBeanDefinition
        jdk：Arrays

 */
public class Client {
    public static void main(String[] args) {

    }
}

class Product implements Cloneable, Serializable {
    private static final long serialVersionUID = -4937094295647164583L;
    private String productName;
    private String companyName;
    private String part1;
    private BaseInfo baseInfo;
    //...

    public Product(String productName, String companyName, String part1, BaseInfo baseInfo) {
        this.productName = productName;
        this.companyName = companyName;
        this.part1 = part1;
        this.baseInfo = baseInfo;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPart1() {
        return part1;
    }

    public void setPart1(String part1) {
        this.part1 = part1;
    }

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    @Override
    public String toString() {
        return "Product{" +
                "'hashcode'" + this.hashCode() + '\'' +
                "productName='" + productName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", part1='" + part1 + '\'' +
                ", baseInfo=" + baseInfo.toString() +
                '}';
    }

    @Override
    protected Product clone() throws CloneNotSupportedException {
        //Product res = ((Product) super.clone());
        //res.setBaseInfo(this.baseInfo.clone());

        //序列化
        Product product = null;

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
            oos.writeObject(this);
        } catch (Exception e) {
        }

        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        try (ObjectInputStream ois = new ObjectInputStream(bais)) {
            product = (Product) ois.readObject();
        } catch (Exception e) {
        }
        return product;
    }

    class BaseInfo implements Cloneable, Serializable {
        private static final long serialVersionUID = -4570839176185103820L;
        private String name;

        public BaseInfo(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "BaseInfo{" +
                    "'hashcode'" + this.hashCode() + '\'' +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        protected BaseInfo clone() throws CloneNotSupportedException {
            return ((BaseInfo) super.clone());
        }
    }
}