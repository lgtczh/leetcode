package priv.lgtczh.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode.cn/problems/two-city-scheduling">LeetCode 1029. 两地调度</a>
 */
public class Solution {
    /**
     * 公司首先将这 2n 个人全都安排飞往B市，再选出n个人改变它们的行程，让他们飞往A市<br>
     * 如果选择改变一个人的行程，那么公司将会额外付出 costA - costB 的费用，这个费用可正可负<br>
     * 因此最优方案是，选出 costA - costB 最小的 n 个人, 派往A市
     */
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length / 2;
        // 按照去A地和去B地的费用差值排序
        Arrays.sort(costs, Comparator.comparingInt(a -> (a[0] - a[1])));

        int totalCost = 0;
        // 前n个人去A地，后n个人去B地
        for (int i = 0; i < n; i++) {
            totalCost += costs[i][0] + costs[i + n][1];
        }

        return totalCost;
    }
}