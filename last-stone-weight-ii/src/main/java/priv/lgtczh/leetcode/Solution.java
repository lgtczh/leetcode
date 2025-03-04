package priv.lgtczh.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/last-stone-weight-ii">LeetCode 1049. 最后一块石头的重量 II</a>
 */
class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum = Arrays.stream(stones).sum();
        int target = sum / 2;
        int[] dp = new int[target + 1];

        for (int stone : stones) {
            for (int j = target; j >= stone; j--) {
                dp[j] = Math.max(dp[j], dp[j - stone] + stone);
            }
        }
        return sum - 2 * dp[target];
    }

    public static void main(String[] args) {
        System.out.println(new Solution().lastStoneWeightII(new int[]{31, 26, 33, 21, 40}));
    }
} 