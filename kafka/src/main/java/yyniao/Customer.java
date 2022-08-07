package yyniao;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/11/26 3:36 下午
 */
public class Customer {
    private int customerID;
    private String customerName;

    public Customer(int customerID, String customerName) {
        this.customerID = customerID;
        this.customerName = customerName;
    }

    public int getID() {
        return customerID;
    }

    public String getName() {
        return customerName;
    }
}
