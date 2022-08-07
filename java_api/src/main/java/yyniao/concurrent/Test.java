package yyniao.concurrent;

import java.util.HashSet;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/7/8 15:34
 */
public class Test {
    private static ThreadLocal tl = new ThreadLocal();
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<String>() {{
            add("1");
            add("2");
        }};

        String s = set.stream().reduce((a, b) -> a + "," + b).get();
        System.out.println(s);
    }

}
