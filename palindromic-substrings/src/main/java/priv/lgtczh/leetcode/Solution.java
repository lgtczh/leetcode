package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/palindromic-substrings">LeetCode 647. 回文子串</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. dp[i][j]表示s[i:j]是否是回文串<br>
     * 2. 状态转移方程：<br>
     * dp[i][j] = true 如果 i == j<br>
     * dp[i][j] = s[i] == s[j] 如果 j = i + 1<br>
     * dp[i][j] = dp[i+1][j-1] && s[i] == s[j] 如果 j > i + 1, 因为dp[i][j]与dp[i+1][j-1]相关, 所以从左向右、从下向上递推<br>
     * 3. 初始状态：<br>
     * dp[i][i] = true
     */
    public int countSubstrings(String s) {
        char[] chars = s.toCharArray();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (chars[i] == chars[j]) {
                    if (i == j || i == j - 1 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                    }
                }
                ans += dp[i][j] ? 1 : 0;
            }
        }
        return ans;
    }
} 