package priv.lgtczh.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/ones-and-zeroes">LeetCode 474. 一和零</a>
 */
class Solution {
    /**
     * 动态规划: 01背包问题<br>
     * <br>
     * 该问题有两个维度的背包容量, 动态规划数组需要使用三维数组或二维滚动数组<br>
     */
    public int findMaxForm(String[] strs, int m, int n) {
        int[][] nums = Arrays.stream(strs).map(str -> {
                    int oneNum = (int) str.chars().filter(c -> c == '1').count();
                    return new int[]{str.length() - oneNum, oneNum};
                })
                .toArray(int[][]::new);
        // 二维滚动动态规划数组: dp[i][j]表示0的个数小于等于i且1的个数小于等于j的最大子集的元素数量
        int[][] dp = new int[m + 1][n + 1];
        for (int[] num : nums) {
            for (int j = m; j >= num[0]; j--) {
                for (int k = n; k >= num[1]; k--) {
                    dp[j][k] = Math.max(dp[j][k], dp[j - num[0]][k - num[1]] + 1);
                }
            }
        }
        return dp[m][n];
    }
} 