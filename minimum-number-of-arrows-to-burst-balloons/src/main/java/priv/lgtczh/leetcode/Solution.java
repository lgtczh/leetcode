package priv.lgtczh.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode.cn/problems/minimum-number-of-arrows-to-burst-balloons">LeetCode 452. 用最少数量的箭引爆气球</a>
 */
public class Solution {
    /**
     * 将 points 按右边界从小到大排序<br>
     * 得到的结果可以保证， 第 i+1 个气球的左边界小于第 i 个的右边界，则两个球可以使用同一个箭<br>
     * 记第一个球的右边界为 right，如果上述条件不满足，则无需新增箭，如果不满足，则需要新增一支箭，同时将该气球的右边界赋值给 right<br>
     * 直到比较完成，即可得到总的箭数
     */
    public int findMinArrowShots(int[][] points) {
        if (points.length == 0) {
            return 0;
        }
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int right = points[0][1];
        int ans = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > right) {
                ans ++;
                right = points[i][1];
            }
        }
        return ans;
    }
}