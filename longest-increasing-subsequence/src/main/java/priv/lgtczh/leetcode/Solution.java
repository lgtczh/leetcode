package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/longest-increasing-subsequence">LeetCode 300. 最长递增子序列</a>
 */
class Solution {

    public int lengthOfLIS(int[] nums) {
        // dp[i]表示以nums[i]结尾的最长递增序列的长度
        // 从右向左找到小于nums[i]的数字num[j], dp[j]是最大的
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxLength = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (dp[i] > j + 1) {
                    break;
                }
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
} 