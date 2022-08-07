package yyniao.creational.abstractFactory;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/7/6 11:16 上午
 */

/*
    Abstract Factory
    定义：
        提供一个创建一系列相关或者互相依赖对象的接口，而无需指定它们具体的类

    场景：
        程序需要处理不同系列的相关产品，但是不希望程序与具体产品耦合

    优点：
        - 确信产品之间是兼容的
        - 避免客户端代码与具体产品耦合
        - 单一职责原则
        - 开闭原则

    源码：
        java.sql.Connection
        java.sql.Driver

 */
public class Client {
    public static void main(String[] args) {
        DBUtil dbUtil;
        dbUtil = new MysqlDBUtil();
        dbUtil.getConn().conn();
        dbUtil.getCmd().cmd();

        dbUtil = new OracleDBUtil();
        dbUtil.getConn().conn();
        dbUtil.getCmd().cmd();
    }
}

interface Connect {
    void conn();
}

interface Command {
    void cmd();
}

interface DBUtil {
    Connect getConn();

    Command getCmd();
}

class MysqlConnect implements Connect {

    @Override
    public void conn() {
        System.out.println("mysql conn");
    }
}

class MysqlCommand implements Command {

    @Override
    public void cmd() {
        System.out.println("mysql command");
    }
}

class MysqlDBUtil implements DBUtil {

    @Override
    public Connect getConn() {
        return new MysqlConnect();
    }

    @Override
    public Command getCmd() {
        return new MysqlCommand();
    }
}

//...Oracle
class OracleConnect implements Connect {

    @Override
    public void conn() {
        System.out.println("oracle conn");
    }
}

class OracleCommand implements Command {

    @Override
    public void cmd() {
        System.out.println("oracle command");
    }
}

class OracleDBUtil implements DBUtil {

    @Override
    public Connect getConn() {
        return new OracleConnect();
    }

    @Override
    public Command getCmd() {
        return new OracleCommand();
    }
}