package priv.lgtczh.leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * <a href="https://leetcode.cn/problems/implement-stack-using-queues">LeetCode 225. 用队列实现栈</a>
 */
public class MyStack {
    private final Queue<Integer> queue1;

    private final Queue<Integer> queue2;

    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    public void push(int x) {
        Queue<Integer> queue = queue1.isEmpty() ? queue2 : queue1;
        queue.add(x);
    }

    public int pop() {
        if (empty()) {
            return 0;
        }
        Queue<Integer> queueOut, queueIn;
        if (queue1.isEmpty()) {
            queueIn = queue1;
            queueOut = queue2;
        } else {
            queueIn = queue2;
            queueOut = queue1;
        }
        while (queueOut.size() > 1) {
            queueIn.add(queueOut.poll());
        }
        return queueOut.poll();
    }

    public int top() {
        int ele = pop();
        if (ele == 0) {
            return 0;
        }
        push(ele);
        return ele;
    }

    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}