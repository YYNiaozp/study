package yyniao.creational.builder;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/6 11:37 上午
 */
/*
    Builder
    定义：
        将一个复杂对象的创建与他的表示分离，使得同样的构建过程可以创建不同的表示

    应用：
        - 需要生成的对象有复杂的内部结构
        - 需要生成的对象内部属性本身相互依赖
        - 与不可变对象配合使用

    优点：
        - 建造者独立，易扩展
        - 便于控制细节风险

    源码：
        spring: RequestMappingInfo、BeanDefinitionBuilder

 */
public class Clent {
    public static void main(String[] args) {
        Director director = new Director(new DefaultConcreateProductBuilder());
        Product product = director.makeProduct("pn", "cn", "p1");
        System.out.println(product.toString());
    }
}

interface ProductBuilder {
    ProductBuilder buildProductName(String productName);

    ProductBuilder buildCompanyName(String companyName);

    ProductBuilder buildPart1(String part1);

    Product build();
}

class DefaultConcreateProductBuilder implements ProductBuilder {
    private String productName;
    private String companyName;
    private String part1;

    @Override
    public ProductBuilder buildProductName(String productName) {
        this.productName = productName;
        return this;
    }

    @Override
    public ProductBuilder buildCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }

    @Override
    public ProductBuilder buildPart1(String part1) {
        this.part1 = part1;
        return this;
    }

    @Override
    public Product build() {
        return new Product(productName,companyName,part1);
    }
}

class Director {
    private DefaultConcreateProductBuilder builder;

    public Director(DefaultConcreateProductBuilder builder) {
        this.builder = builder;
    }

    public Product makeProduct(String productName, String companyName, String part1){
        return builder.buildProductName(productName)
                .buildCompanyName(companyName)
                .buildPart1(part1)
                .build();
    }
}



class Product {
    private String productName;
    private String companyName;
    private String part1;
    //...


    public Product(String productName, String companyName, String part1) {
        this.productName = productName;
        this.companyName = companyName;
        this.part1 = part1;
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

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", part1='" + part1 + '\'' +
                '}';
    }
}