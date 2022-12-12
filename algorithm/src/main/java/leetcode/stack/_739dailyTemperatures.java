package leetcode.stack;

import java.util.Stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/7 14:25
 */

/**
 * 给定一个整数数组 temperatures ，表示每天的温度，返回一个数组 answer ，其中 answer[i] 是指对于第 i 天，
 * 下一个更高温度出现在几天后。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 */
public class _739dailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> iStack = new Stack<>();
        int[] answer = new int[temperatures.length];
        for (int j = 0; j < temperatures.length; j++) {
            while (!iStack.isEmpty() && temperatures[iStack.peek()] < temperatures[j]) {
                int i = iStack.pop();
                answer[i] = j - i;
            }
            iStack.push(j);
        }

        while (!iStack.isEmpty()) {
            int i = iStack.pop();
            answer[i] = 0;
        }
        return answer;
    }
}
