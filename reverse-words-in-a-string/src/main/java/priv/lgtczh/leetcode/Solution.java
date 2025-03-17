package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/reverse-words-in-a-string">LeetCode 151. 反转字符串中的单词</a>
 */
public class Solution {
    public String reverseWords(String s) {
        char[] chars = removeSpace(s);
        reverse(chars, 0, chars.length - 1);
        int i = 0, j = 0;
        while (j < chars.length) {
            while (j < chars.length && chars[j] != ' ') {
                j++;
            }
            reverse(chars, i, j - 1);
            i = j + 1;
            j = i;
        }
        return new String(chars);
    }

    private char[] removeSpace(String s) {
        StringBuilder sb = new StringBuilder();
        int start = 0;
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        int end = s.length() - 1;
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        for (int i = start; i <= end; i++) {
            if (s.charAt(i) != ' ' || sb.charAt(sb.length() - 1) != ' ') {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString().toCharArray();
    }

    private void reverse(char[] s, int start, int end) {
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
    }
}