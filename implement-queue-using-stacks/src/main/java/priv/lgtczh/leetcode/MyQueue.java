package priv.lgtczh.leetcode;

import java.util.Stack;

/**
 * <a href="https://leetcode.cn/problems/implement-queue-using-stacks">LeetCode 232. 用栈实现队列</a>
 */
public class MyQueue {
    private final Stack<Integer> stack1;
    private final Stack<Integer> stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        while (!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        stack1.push(x);
        while (!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
    }

    public int pop() {
        if (stack2.isEmpty()) {
            return 0;
        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            return 0;
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack2.isEmpty();
    }

}