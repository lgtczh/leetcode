package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/house-robber">LeetCode 198. 打家劫舍</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 偷窃i房间的最高金额 = max(偷窃`i-2`房间的最高金额 + `i`房间的金额, 偷窃`i-1`房间的最高金额)
     */
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[i], dp[i - 1]);
        }
        return dp[nums.length - 1];
    }
} 