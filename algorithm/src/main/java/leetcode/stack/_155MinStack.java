package leetcode.stack;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2022/6/7 11:54
 */

import java.util.Stack;

/**
 * 155. 最小栈
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * 实现 MinStack 类:
 * MinStack() 初始化堆栈对象。
 * void push(int val) 将元素val推入堆栈。
 * void pop() 删除堆栈顶部的元素。
 * int top() 获取堆栈顶部的元素。
 * int getMin() 获取堆栈中的最小元素。
 */
public class _155MinStack {
    class MinStack {
        private Stack<Integer> s1;
        private Stack<Integer> s2;

        public MinStack() {
            s1 = new Stack<>();
            s2 = new Stack<>();
        }

        public void push(int val) {
            s1.push(val);
            if (s2.isEmpty()){
                s2.push(val);
            } else {
                s2.push(Math.min(val, s2.peek()));
            }
        }

        public void pop() {
            s1.pop();
            s2.pop();
        }

        public int top() {
            return s1.peek();
        }

        public int getMin() {
            return s2.peek();
        }
    }
}
