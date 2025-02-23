package priv.lgtczh.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode.cn/problems/merge-intervals">LeetCode 56. 合并区间</a>
 */
public class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> ans = new ArrayList<>();
        int[] newInterval = new int[]{intervals[0][0], intervals[0][1]};
        for (int[] interval : intervals) {
            if (interval[0] <= newInterval[1]) {
                newInterval[1] = Math.max(newInterval[1], interval[1]);
            } else {
                ans.add(newInterval);
                newInterval = new int[]{interval[0], interval[1]};
            }
        }
        ans.add(newInterval);
        return ans.toArray(new int[][]{});
    }
}