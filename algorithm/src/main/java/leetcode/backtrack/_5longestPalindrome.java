package leetcode.backtrack;

/**
 * @Author: zhangpeng
 * @Date: 2022/12/12 15:46
 */

/**
 * 给你一个字符串 s，找到 s 中最长的回文子串。
 */
public class _5longestPalindrome {
    public static String longestPalindrome2(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        int len = s.length();
        // dp[i][j]表示s[i...j]是否回文串
        boolean[][] dp = new boolean[len][len];
        // 初始化：所有长度为1的子串都是回文串
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
            //用不到的西南方向的数组都可以赋值成true，不影响长度为2的判断回文
            if (i + 1 < len) dp[i + 1][i] = true;
        }

        int begin = 0;
        int end = 0;
        //枚举子串的长度
        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                // 由L和i可以确定右边界， 即j-i+1=L 得
                int j = L + i - 1;
                // 如果右边界越界，就可以退出
                if (j >= len) {
                    break;
                }
                dp[i][j] = dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j);
                if (dp[i][j]){
                    begin = i;
                    end = j;
                }
            }

        }
        return s.substring(begin, end + 1);
    }


    // 中心扩展算法
    public String longestPalindrome(String s) {
        if (s == null || s.length() < 1) {
            return "";
        }
        int start = 0, end = 0; //保存结果状态, (]
        for (int i = 0; i < s.length(); i++) {
            //长度为单为双两种情况
            int len1 = expandAroundCenter(s, i, i);
            int len2 = expandAroundCenter(s, i, i + 1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    //中心扩展，得到当前中心最长回文子串
    public int expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && right < s.length()
                && s.charAt(left) == s.charAt(right)) {
            --left;
            ++right;
        }
        return right - left - 1;
    }
}
