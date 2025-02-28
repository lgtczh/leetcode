package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/min-cost-climbing-stairs">LeetCode 746. 使用最小花费爬楼梯</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. 确定dp数组和下标的含义: dp[i]表示爬到第i个台阶最小的花费<br>
     * 2. 确定dp递推公式: 到第i阶梯, 可以从第i-1爬1层到第i层, 也可以从第i-2阶梯爬2层到第i层, 因此 dp[i]=min(dp[i-1]+cost[i-1], dp[i-2]+cost[i-2])<br>
     * 3. 初始化dp数组: 到第0个阶梯和第1个阶梯都没有花费, 所以dp[0]=0, dp[1]=0<br>
     * 4. 确定遍历顺序: 从小到大遍历
     */
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] dp = new int[n + 1];

        // 可以从下标0或1开始，初始花费为0
        dp[0] = 0;
        dp[1] = 0;

        // 计算到达每一层的最小花费
        for (int i = 2; i <= n; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }

        return dp[n];
    }
}