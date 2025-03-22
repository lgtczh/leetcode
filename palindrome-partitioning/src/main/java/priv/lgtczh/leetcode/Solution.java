package priv.lgtczh.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/palindrome-partitioning">LeetCode 131. 分割回文串</a>
 */
public class Solution {
    private final List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        char[] chars = s.toCharArray();
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (chars[i] == chars[j]) {
                    if (j - i <= 1) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }
            }
        }
        tracebacking(chars, 0, new ArrayList<>(), dp);
        return ans;
    }

    private void tracebacking(char[] chars, int start, List<String> palindromes, boolean[][] dp) {
        if (start == chars.length) {
            ans.add(new ArrayList<>(palindromes));
            return;
        }
        for (int i = start; i < chars.length; i++) {
            if (!dp[start][i]) {
                continue;
            }
            palindromes.add(new String(chars, start, i - start + 1));
            tracebacking(chars, i + 1, palindromes, dp);
            palindromes.remove(palindromes.size() - 1);
        }
    }
}