package leetcode.stack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Stack;
import java.util.function.Predicate;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/11 12:14 上午
 */
public class _394decodeString {

    public static void main(String[] args) {
        String string = new _394decodeString().decodeString("2[abc]3[cd]ef");
        System.out.println(string);
    }

    int i;

    public String decodeString(String s) {
        LinkedList<String> stk = new LinkedList<>();
        i = 0;
        while (i < s.length()) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stk.addLast(getItem(s, Character::isDigit));
            } else if (c == '[') {
                stk.addLast(String.valueOf(s.charAt(i++)));
            } else if (Character.isLetter(c)) {
                stk.addLast(getItem(s, Character::isLetter));
            } else {
                LinkedList<String> items = new LinkedList<>();
                while (!stk.peekLast().equals("[")) {
                    items.addLast(stk.removeLast());
                }
                Collections.reverse(items);
                String item = getStr(items);
                stk.removeLast();
                int n = Integer.parseInt(stk.removeLast());
                StringBuilder sb = new StringBuilder();
                while (n-- > 0) {
                    sb.append(item);
                }
                stk.addLast(sb.toString());
                i++;
            }
        }
        return getStr(stk);
    }

    private String getStr(LinkedList<String> items) {
        StringBuilder sb = new StringBuilder();
        for (String item : items) {
            sb.append(item);
        }
        return sb.toString();
    }

    private String getItem(String s, Predicate<Character> condition) {
        StringBuilder sb = new StringBuilder();
        while (i < s.length() && condition.test(s.charAt(i))) {
            sb.append(s.charAt(i++));
        }
        return sb.toString();
    }

    public String decodeString2(String s) {
        StringBuilder res = new StringBuilder();
        Stack<Object> stack = new Stack<>();
        Stack<Integer> nStack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                int j = i;
                while (Character.isDigit(c)) {
                    j++;
                    c = s.charAt(j);
                }
                nStack.push(Integer.parseInt(s.substring(i, j)));
                i = j - 1;
                continue;
            }

            if (c == '[') {
                stack.add(c);
                continue;
            }

            if (c == ']') {
                ArrayList<Object> list = new ArrayList<>();
                while (!stack.isEmpty()) {
                    Object pop = stack.pop();
                    if (pop.equals('[')) {
                        break;
                    }
                    list.add(pop);
                }
                Integer n = nStack.pop();
                for (int j = 0; j < n; j++) {
                    if (nStack.isEmpty()) {
                        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
                            res.append(list.get(i1));
                        }
                    } else {
                        for (int i1 = list.size() - 1; i1 >= 0; i1--) {
                            stack.push(list.get(i1));
                        }
                    }
                }
                continue;
            }

            // other
            if (nStack.isEmpty()) {
                res.append(c);
            } else {
                stack.push(c);
            }
        }
        return res.toString();
    }
}
