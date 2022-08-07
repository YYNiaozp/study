package leetcode.stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/6 16:32
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */
public class _20isValid {

    public boolean isValid1(String s) {
        assert s.length() >= 1 && s.length() <= 10000;

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                case '}':
                case ']':
                    if (stack.size() == 0) return false;
                    if (!match(stack.pop(), c)) return false;
                    break;
                default:
                    return false;
            }
        }

        return stack.size() == 0;
    }

    private boolean match1(Character c1, Character c2) {
        switch (c1) {
            case '(':
                return c2 == ')';
            case '{':
                return c2 == '}';
            case '[':
                return c2 == ']';
            default:
                return false;
        }
    }

    private static final Map<Character, Character> dic = new HashMap<>();
    static {
        dic.put('(', ')');
        dic.put('[', ']');
        dic.put('{', '}');
    }
    private boolean match(Character c1, Character c2) {
        return dic.get(c1) == c2;
    }
}