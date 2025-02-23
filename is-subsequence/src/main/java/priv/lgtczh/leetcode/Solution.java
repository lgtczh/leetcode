package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/is-subsequence">LeetCode 392. 判断子序列</a>
 */
public class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == s.length();
    }
} 