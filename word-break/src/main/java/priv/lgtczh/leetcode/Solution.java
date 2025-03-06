package priv.lgtczh.leetcode;

import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/word-break">LeetCode 139. 单词拆分</a>
 */
class Solution {
    /**
     * 动态规划: 完全背包问题<br>
     * <br>
     * wordDict中的单词可以通过排列构成s(wordDict中的物品恰好能放入背包s)
     */
    public boolean wordBreak(String s, List<String> wordDict) {
        // 动态规划数组dp[i]=true表示wordDict中的单词可以构成s的子串s[0,i)
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        // 动态规划递推: 如果dp[j]为true, s[j,i)又在wordDict中, 则dp[i]也为true
        // 因为需要按字符串s从前向后匹配, 所以外循环为背包容量, 内循环为物品
        for (int j = 0; j <= s.length(); j++) {
            for (String word : wordDict) {
                int wordLen = word.length();
                if (j >= wordLen && dp[j - wordLen] && word.equals(s.substring(j - wordLen, j))) {
                    dp[j] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}