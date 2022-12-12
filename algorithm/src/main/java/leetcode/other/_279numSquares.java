package leetcode.other;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/22 22:39
 */
public class _279numSquares {
    public int numSquares(int n) {
        int[] f = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            int minn = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                minn = Math.min(minn, f[i -j * j]);
            }
            f[i] = minn + 1;
        }
        return f[n];
    }

    public static void main(String[] args) {
        new _279numSquares().numSquares(12);
    }
}
