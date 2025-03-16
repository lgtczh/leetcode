package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/reverse-string-ii">LeetCode 541. 反转字符串 II</a>
 */
public class Solution {
    public String reverseStr(String s, int k) {
        int left = 0, right = 2 * k;
        char[] chars = s.toCharArray();
        while (left < s.length()) {
            reverse(chars, left, Math.min(left + k, s.length()) - 1);
            left = right;
            right = right + 2 * k;
        }
        return new String(chars);
    }

    private void reverse(char[] cs, int start, int end) {
        while (start < end) {
            char temp = cs[start];
            cs[start] = cs[end];
            cs[end] = temp;
            start++;
            end--;
        }
    }
}