package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/maximum-length-of-repeated-subarray">LeetCode 718. 最长重复子数组</a>
 */
class Solution {
    /**
     * 动态规划<br>
     */
    public int findLength(int[] nums1, int[] nums2) {
        // dp[i][j]表示以nums1[i]和nums2[j]结尾的字符串拥有的最长公共后缀的长度
        int[][] dp = new int[nums1.length][nums2.length];
        int max = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] == nums2[0]) {
                dp[i][0] = 1;
                max = 1;
            }
        }
        for (int j = 0; j < nums2.length; j++) {
            if (nums1[0] == nums2[j]) {
                dp[0][j] = 1;
                max = 1;
            }
        }
        for (int i = 1; i < nums1.length; i++) {
            for (int j = 1; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                }
            }
        }
        return max;
    }
} 