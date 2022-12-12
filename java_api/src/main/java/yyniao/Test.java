package yyniao;

import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

/**
 * @Author: zhangpeng
 * @Date: 2022/9/27 11:44
 */
public class Test {
    public static void main(String[] args) {
    }

    public String maxDictionaryOrder(String s) {
        // write code here
        if (s == null || s.equals("")){
            return s;
        }

        int l = s.length();
        StringBuilder builder = new StringBuilder();
        char last = Character.MIN_VALUE;
        for (int i = l - 1; i > 0; i--) {
            char curr = s.charAt(i);
            if (curr >= last){
                if (curr > last){
                    last = curr;
                }
                builder.append(curr);
            }
        }
        return builder.reverse().toString();
    }
}
