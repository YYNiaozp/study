package leetcode.stack;

import java.util.Stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/7 14:25
 */
public class _739dailyTemperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> iStack = new Stack<>();
        int[] answer = new int[temperatures.length];
        for (int j = 0; j < temperatures.length; j++) {
            while (!iStack.isEmpty() || temperatures[iStack.peek()] < temperatures[j]){
                int i = iStack.pop();
                answer[i] = j - i;
            }
            iStack.push(j);
        }

        while (!iStack.isEmpty()){
            int i = iStack.pop();
            answer[i] = 0;
        }
        return answer;
    }
}
