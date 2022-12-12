/**
 * @Author: zhangpeng
 * @Date: 2022/10/26 18:36
 */
public class Test {
    static Test test = new Test();

    {
        System.out.println("A");
    }

    static {
        System.out.println("B");
    }


    public static void main(String[] args) {
        new Test();
    }
}
