package priv.lgtczh.leetcode.dynamic_programming;

/**
 * <a href="https://leetcode.cn/problems/maximum-subarray">LeetCode 53. 最大子数组和</a>
 */
public class Solution {
    /**
     * 动态规划递推公式: dp[i] = max(dp[i-1]+nums[i], nums[i])<br>
     * 最终的结果为 max(dp[0],dp[1], ..., dp[n-1])
     */
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum += nums[i];
            if (sum < nums[i]) {
                // 遇到加上当前元素则总和小于该元素时, 直接抛弃前面的元素和
                sum = nums[i];
            }
            // 持续记录最大和
            max = Math.max(max, sum);
        }
        return max;
    }
} 