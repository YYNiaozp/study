package leetcode.dynamicProgramming;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/8 16:34
 */

import java.util.Stack;

/**
 * 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 */
public class _32longestValidParentheses {

    public int longestValidParentheses(String s) {
        int maxLen = 0;
        int[] dp = new int[s.length()]; //dp[i] 表示以下标 ii 字符结尾的最长有效括号的长度
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                if (s.charAt(i - 1) == '(') {
                    dp[i] = (i >= 2 ? dp[i - 2] : 0) + 2;
                } else if (i - dp[i - 1] > 0 && s.charAt(i - dp[i - 1] - 1) == '(') {
                    dp[i] = dp[i - 1] + ((i - dp[i - 1]) >= 2 ? dp[i - dp[i - 1] - 2] : 0) + 2;
                }
            }
            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }


    public int longestValidParentheses2(String s) {
        int maxLen = 0;
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                stk.push(i);
            } else {
                stk.pop();
                if (stk.isEmpty()) {
                    stk.push(i);
                } else {
                    maxLen = Math.max(maxLen, i - stk.peek());
                }
            }
        }
        return maxLen;
    }


}
