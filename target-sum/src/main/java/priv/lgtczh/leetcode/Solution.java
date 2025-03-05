package priv.lgtczh.leetcode;

import java.util.Arrays;

/**
 * <a href="https://leetcode.cn/problems/target-sum">LeetCode 494. 目标和</a>
 */
class Solution {
    /**
     * 动态规划: 01背包问题
     * <br>
     * 设所有元素的和为sum, 带+的数字的和为s1, 带-的数字的和为s2, 则有s1-s2=target => sum-s2-s2=target => s2=(sum-target)/2, 从而转化为01背包问题, 从数组中选出部分数字的和恰好等于s2<br>
     * <br>
     * 首先要满足: 1. target必须小于sum; 2. (sum-target)必须为偶数<br>
     * <br>
     * 1. 定义动态规划数组: dp[i][j]表示由下标属于[0,i]的部分或全部数字构成的表达式的结果等于target的所有不同组合的数量<br>
     * 2. 确定递推公式: 由属于[0,i]的部分或全部数字构成的表达式的组合可以分为包含nums[i]和不包含nums[i]的<br>
     * &nbsp;&nbsp;a. 不包含i的表达式结果等于j的数量为dp[i-1][j]<br>
     * &nbsp;&nbsp;b. 如果nums[i] < j, 则包含i的表达式结果等于j的数量为dp[i-1][j-nums[i]]<br>
     * 3. 初始化动态规划数组: 当j=0时, 如果没有元素为0则只由一种组合方式, 即dp[i][0]=1; 但如果有元素为0, 则dp[i][0]由下标属于[0, i]的数字中0的数量zeroNum决定, 为0的数量的组合数的和, 即2^zeroNum
     */
    public int findTargetSumWays(int[] nums, int target) {
        int sum = Arrays.stream(nums).sum();
        if (sum < target) {
            // 所有元素都是非负整数, target必须小于等于所有元素的和
            return 0;
        }
        if ((sum - target) % 2 == 1) {
            return 0;
        }

        int bagSize = (sum - target) / 2;
        // 动态规划数组: dp[i][j]表示由下标属于[0, i]的部分或全部数字构成的表达式的结果等于target的组合的数量
        int[][] dp = new int[nums.length][bagSize + 1];

        // 动态规划数组初始化
        if (nums[0] <= bagSize) {
            dp[0][nums[0]] = 1;
        }
        int zeroNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) zeroNum++;
            // 有0的话, 组合数量为2^n(组合数的和)
            dp[i][0] = (int) Math.pow(2, zeroNum);
        }

        // 动态规划递推公式
        for (int i = 1; i < nums.length; i++) {
            for (int j = 1; j <= bagSize; j++) {
                if (j < nums[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i - 1][j - nums[i]];
                }
            }
        }
        return dp[nums.length - 1][bagSize];
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.findTargetSumWays(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 1}, 1));
    }
} 