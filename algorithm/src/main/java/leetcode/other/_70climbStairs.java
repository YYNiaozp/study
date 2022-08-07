package leetcode.other;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/9 10:24 下午
 */
public class _70climbStairs {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(new _70climbStairs().climbStairs(i));
        }
    }

    public int climbStairs(int n) {
        if (n < 3) {
            return n;
        }

        int i1 = 1;
        int i2 = 2;
        int temp = i1 + i2;
        for (int i = 3; i <= n; i++) {
            temp = i1 + i2;
            i1 = i2;
            i2 = temp;
        }
        return temp;
    }
}
