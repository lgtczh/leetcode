package priv.lgtczh.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * <a href="https://leetcode.cn/problems/remove-k-digits">LeetCode 402. 移掉 K 位数字</a>
 */
public class Solution {
    /**
     * 不使用单调栈, 直接通过一个索引记录位置, 可以进一步优化执行效率
     */
    public String removeKdigits(String num, int k) {
        if (num.length() <= k) {
            return "0";
        }
        char[] chars = num.toCharArray();
        char[] ret = new char[num.length() - k];
        int idx = 0;
        ret[0] = chars[idx];
        for (int i = 1; i < num.length(); i++) {
            while (idx >= 0 && chars[i] < ret[idx] && k > 0) {
                idx--;
                k--;
            }
            // 当前值大于等于ret最后的值
            if (idx >= ret.length - 1) {
                k--;
                continue;
            }
            ret[++idx] = chars[i];
        }
        String result = new String(ret).replaceFirst("^0+", "");
        return result.isEmpty() ? "0" : result;
    }

    /**
     * 贪心算法 + 单调栈<br>
     * 要求数字最小, 则尽量保证高位的数字更小, 即若要使得剩下的数字最小，需要保证靠前的数字尽可能小
     */
    public String removeKdigitsWithStack(String num, int k) {
        if (num.length() <= k) {
            return "0";
        }
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < num.length(); i++) {
            char c = num.charAt(i);
            while (!stack.isEmpty() && stack.peek() > c && k > 0) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        for (int i = 0; i < k; i++) {
            stack.pop();
        }

        boolean leadingZero = true;
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            Character c = stack.pollLast();
            if (leadingZero && c == '0') {
                continue;
            }
            leadingZero = false;
            result.append(c);
        }
        return result.isEmpty() ? "0" : result.toString();
    }
}