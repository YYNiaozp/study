package leetcode.string;

/**
 * @Author: zhangpeng
 * @Date: 2022/8/21 21:55
 */
public class _647countSubstrings {
    public int countSubstrings(String s) {
        return dp(s);
    }

    /**
     * dp[i][j] 表示字符串s在[i,j]区间的子串是否是一个回文串
     * 当 s[i] == s[j] && (j - i < 2 || dp[i + 1][j - 1]) 时，dp[i][j]=true，否则为false
     */
    private int dp(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int j = 0; j < s.length(); j++) {
            for (int i = 0; i <= j; i++) {
                if (s.charAt(i) == s.charAt(j) && (j - i < 2 || dp[i + 1][j - 1])) {
                    dp[i][j] = true;
                    ans++;
                }
            }
        }
        return ans;
    }

    /**
     * 中心拓展
     * n2, 1
     */
    public int impl2(String s) {
        int n = s.length(), ans = 0;
        for (int i = 0; i < 2 * n - 1; ++i) {
            int l = i / 2, r = i / 2 + i % 2;
            while (l >= 0 && r < n && s.charAt(l) == s.charAt(r)) {
                --l;
                ++r;
                ++ans;
            }
        }
        return ans;
    }
}
