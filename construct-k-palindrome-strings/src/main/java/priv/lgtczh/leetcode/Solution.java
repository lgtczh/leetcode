package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/construct-k-palindrome-strings">LeetCode 1400. 构造 K 个回文字符串</a>
 */
public class Solution {
    public boolean canConstruct(String s, int k) {
        if (s.length() < k) {
            return false;
        }
        int[] cs = new int[26];
        for (int i = 0; i < s.length(); i++) {
            cs[s.charAt(i) - 'a']++;
        }
        int oddNum = 0;
        for (int i = 0; i < 26; i++) {
            if (cs[i] % 2 == 1) {
                oddNum++;
            }
        }
        return oddNum <= k;
    }
} 