package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/uncrossed-lines">LeetCode 1035. 不相交的线</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 本质上是求两个数组的最长公共子序列<br>
     * 1. dp[i][j]表示nums1[0:i-1]和nums2[0:j-1]的最长公共子序列的长度<br>
     * 2. 状态转移方程：<br>
     * dp[i][j] = dp[i-1][j-1] + 1 如果 nums1[i-1] == nums2[j-1]<br>
     * dp[i][j] = max(dp[i-1][j], dp[i][j-1]) 如果 nums1[i-1] != nums2[j-1]<br>
     * 3. 初始状态：<br>
     * dp[0][j] = 0, dp[i][0] = 0
     */
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[nums1.length][nums2.length];
    }
} 