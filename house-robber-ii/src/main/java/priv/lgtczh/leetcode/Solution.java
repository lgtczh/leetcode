package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/house-robber-ii">LeetCode 213. 打家劫舍 II</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 由于房屋首尾相连，所以需要分两种情况考虑：<br>
     * 1. 偷第一间房子，不能偷最后一间<br>
     * 2. 不偷第一间房子，可以偷最后一间<br>
     * 取两种情况的最大值
     */
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        return Math.max(robRange(nums, 0, nums.length - 1), robRange(nums, 1, nums.length));
    }

    private int robRange(int[] nums, int start, int end) {
        int len = end - start;
        int[] dp = new int[len];
        dp[0] = nums[start];
        dp[1] = Math.max(nums[start], nums[start + 1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.max(dp[i - 2] + nums[start + i], dp[i - 1]);
        }
        return dp[len - 1];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.rob(new int[]{1, 2, 3, 1}));
    }
} 