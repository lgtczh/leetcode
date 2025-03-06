package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/combination-sum-iv">LeetCode 377. 组合总和 Ⅳ</a>
 */
class Solution {
    /**
     * 动态规划: 完全背包问题
     */
    public int combinationSum4(int[] nums, int target) {
        // 动态规划数组dp[i]表示nums中的数字组合相加得到target的组合数量
        int[] dp = new int[target + 1];
        dp[0] = 1;
        // 动态规划递推: 因为求排列数量, 所以外循环为target, 内循环为nums
        for (int j = 1; j <= target; j++) {
            for (int num : nums) {
                if (j >= num) {
                    dp[j] = dp[j] + dp[j - num];
                }
            }
        }
        return dp[target];
    }
} 