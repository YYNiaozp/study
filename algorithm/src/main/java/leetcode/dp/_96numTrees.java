package leetcode.dp;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/22 01:34
 */
public class _96numTrees {
    public int numTrees(int n) {
        return dp(n);
    }

    private int dp(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                dp[i] += dp[j - 1] * dp[i - j];
            }
        }
        return dp[n];
    }

    public static void main(String[] args) {

        int i = new _96numTrees().numTrees(3);
        System.out.println(i);
    }
}
