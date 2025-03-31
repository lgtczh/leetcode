package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/string-to-integer-atoi/">LeetCode 8. 字符串转换整数 (atoi)</a>
 */
public class Solution {
    public int myAtoi(String s) {
        int i = 0;
        // 丢弃前导空格
        for (; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                break;
            }
        }
        if (i == s.length()) {
            return 0;
        }
        // 确定符号
        int sign = 1;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }
        // 转换
        long ans = 0L;
        for (; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if (c < 0 || c > 9) {
                break;
            }
            ans = ans * 10 + c * sign;
            // 舍入
            if (ans >= Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (ans <= Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        return (int) ans;
    }
}