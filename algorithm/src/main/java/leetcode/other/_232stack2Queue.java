package leetcode.other;

/**
 * @Author: zhang.peng(zhang.peng @ yottabyte.cn)
 * @Date: 2021/12/11 12:07 上午
 */

import java.util.Stack;

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
public class _232stack2Queue {
    Stack<Integer> s1;
    Stack<Integer> s2;

    public _232stack2Queue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        s1.push(x);
    }

    public int pop() {
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()){
            throw new RuntimeException();
        }
        return s2.pop();
    }

    public int peek() {
        if (s2.isEmpty()){
            while (!s1.isEmpty()){
                s2.push(s1.pop());
            }
        }
        if (s2.isEmpty()){
            throw new RuntimeException();
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() &&s2.isEmpty();
    }
}
