package leetcode.backtrack;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/1 23:42
 */
public class _301removeInvalidParentheses {
    private List<String> res = new ArrayList<>();

    public List<String> removeInvalidParentheses(String s) {
        int lremove = 0;
        int rremove = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                lremove++;
            } else if (s.charAt(i) == ')') {
                if (lremove == 0) {
                    rremove++;
                } else {
                    lremove--;
                }
            }
        }
        helper(s, 0, lremove, rremove);
        return res;
    }

    private void helper(String s, int start, int lremove, int rremove) {
        if (lremove == 0 && rremove == 0) {
            if (isValid(s)) {
                res.add(s);
            }
            return;
        }

        for (int i = start; i < s.length(); i++) {
            //去重
            if (i != start && s.charAt(i) == s.charAt(i - 1)) {
                continue;
            }
            // 如果剩余的字符无法满足去掉的数量要求，直接返回
            if (lremove + rremove > s.length() - i) {
                return;
            }
            // 尝试去掉一个左括号
            if (lremove > 0 && s.charAt(i) == '(') {
                helper(s.substring(0, i) + s.substring(i + 1), i, lremove - 1, rremove);
            }
            // 尝试去掉一个右括号
            if (rremove > 0 && s.charAt(i) == ')') {
                helper(s.substring(0, i) + s.substring(i + 1), i, lremove, rremove - 1);
            }
        }
    }

    private boolean isValid(String s) {
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else if (s.charAt(i) == ')') {
                cnt--;
                if (cnt < 0) {
                    return false;
                }
            }
        }
        return cnt == 0;
    }
}
