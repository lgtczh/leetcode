package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/longest-continuous-increasing-subsequence">LeetCode 674. 最长连续递增序列</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. dp[i]表示以nums[i]结尾的最长连续递增序列的长度<br>
     * 2. 状态转移方程：<br>
     * dp[i] = dp[i-1] + 1 如果 nums[i] > nums[i-1]<br>
     * dp[i] = 1 如果 nums[i] <= nums[i-1]<br>
     * 3. 初始状态：<br>
     * dp[0] = 1，因为每个数字本身就是一个长度为1的连续递增序列
     */
    public int findLengthOfLCIS(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int maxLength = dp[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                dp[i] = dp[i - 1] + 1;
            } else {
                dp[i] = 1;
            }
            maxLength = Math.max(maxLength, dp[i]);
        }
        return maxLength;
    }
} 