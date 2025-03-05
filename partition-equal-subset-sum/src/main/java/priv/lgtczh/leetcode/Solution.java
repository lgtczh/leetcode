package priv.lgtczh.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/partition-equal-subset-sum">LeetCode 416. 分割等和子集</a>
 */
class Solution {
    /**
     * 动态规划: 01背包问题
     */
    public boolean canPartition(int[] nums) {
        int sum = Arrays.stream(nums).sum();
        if (sum % 2 == 1) {
            // 所有数字的和为奇数, 无法分割
            return false;
        }
        // 如果数组部分数字的和恰好为所有数字和的一半, 则可以分割成两个相等的子集
        int target = sum / 2;
        // 转化为01背包问题
        boolean[][] dp = new boolean[nums.length][target + 1];
        if (nums[0] <= target) {
            dp[0][nums[0]] = true;
        } else {
            return false;
        }
        for (int i = 0; i < nums.length; i++) {
            // 不选数字的话, 和为0, 所以都是true
            dp[i][0] = true;
        }
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= target; j++) {
                if (j > nums[i]) {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - nums[i]];
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[nums.length - 1][target];
    }
} 