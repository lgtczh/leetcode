package priv.lgtczh.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <a href="https://leetcode.cn/problems/maximum-units-on-a-truck">LeetCode 1710. 卡车上的最大单元数</a>
 */
public class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        // 按能装在的单元数从大到小排列
        Arrays.sort(boxTypes, Comparator.comparing(o -> -o[1]));

        int ans = 0;
        for(int i = 0; i < boxTypes.length && truckSize > 0; i++) {
            // 当前类型的箱子可以装载的数量
            int boxNum = Math.min(boxTypes[i][0], truckSize);
            ans += boxNum * boxTypes[i][1];
            truckSize -= boxNum;
        }
        return ans;
    }
} 