package leetcode.dp;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/18 21:11
 */
public class _70climbStairs {
    public int climbStairs(int n) {
        return impl1(n);
        //
    }

    private int impl1(int n){
        if (n < 3) {
            return n;
        }

        return impl1(n - 1) + impl1(n - 2);
    }

    private int impl2(int n){
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
