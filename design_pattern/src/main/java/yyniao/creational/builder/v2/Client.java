package yyniao.creational.builder.v2;

public class Client{
    public static void main(String[] args) {
        Product product = new Product.ProductBuilder().buildProductName("pn").buildCompanyName("cn").buildPart1("p1").build();
        System.out.println(product.toString());
    }
}

class Product {
    private final String productName;
    private final String companyName;
    private final String part1;
    //...

    public Product(String productName, String companyName, String part1) {
        this.productName = productName;
        this.companyName = companyName;
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

    static class ProductBuilder{
        private String productName;
        private String companyName;
        private String part1;

        public ProductBuilder buildProductName(String productName) {
            this.productName = productName;
            return this;
        }

        public ProductBuilder buildCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public ProductBuilder buildPart1(String part1) {
            this.part1 = part1;
            return this;
        }

        Product build(){
            return new Product(productName,companyName,part1);
        }
    }
}
