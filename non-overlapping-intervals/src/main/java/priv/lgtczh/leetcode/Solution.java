package priv.lgtczh.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode.cn/problems/non-overlapping-intervals">LeetCode 435. 无重叠区间</a>
 */
public class Solution {
    /**
     * 该问题的反问题是计算不重叠区间的最大数量，得到后计算总数减去最大数量即为需要移除的区间的最小数量<br>
     * <br>
     * 将区间按右边界从小到大排序, 从第一个区间开始遍历，记右边界为该区间的右边界，如果下一个区间的左边界大于等于该值，则说明没有重叠, 数量+1，更新右边界为该区间的右边界；否则什么都不做<br>
     */
    public int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 0) {
            return 0;
        }
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[1]));
        int ans = 1;
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= right) {
                ans++;
                right = intervals[i][1];
            }
        }
        return intervals.length - ans;
    }
}