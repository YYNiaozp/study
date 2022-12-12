package yyniao.behavior.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/25 22:38
 */
public class Main {
    public static void main(String[] args) {
        //真实角色
        Host host = new Host();
        //代理实例的调用处理程序
        ProxyInvocationHandler pih = new ProxyInvocationHandler();
        pih.setRent(host); //将真实角色放置进去！
        Object proxy = pih.getProxy(); //动态生成对应的代理类！
        //((Rent) proxy).rent();
        //((Rent2) proxy).rent2();
        //System.out.println(proxy);
        System.out.println(proxy);
        System.out.println(pih.getProxy());
    }
}
//抽象角色：租房
interface Rent {
    public void rent();
}

interface Rent2 {
    public void rent2();
}

//真实角色: 房东，房东要出租房子
class Host implements Rent, Rent2{
    public void rent() {
        System.out.println("房屋出租");
    }

    @Override
    public void rent2() {
        System.out.println("房屋出租2");
    }
}

class ProxyInvocationHandler implements InvocationHandler {
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    //生成代理类，重点是第二个参数，获取要代理的抽象角色！之前都是一个角色，现在可以代理一类角色
    public Object getProxy(){
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                rent.getClass().getInterfaces(),
                this);
    }

    // proxy : 代理类 method : 代理类的调用处理程序的方法对象.
    // 处理代理实例上的方法调用并返回结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        seeHouse();
        //核心：本质利用反射实现！
        Object result = method.invoke(rent, args);
        fare();
        return result;
    }

    //看房
    public void seeHouse(){
        System.out.println("带房客看房");
    }
    //收中介费
    public void fare(){
        System.out.println("收中介费");
    }
}


