package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/jump-game-ii">LeetCode 45. 跳跃游戏 II</a>
 */
public class Solution {
    /**
     * 每次都选择能到达的最远位置, 从位置 pos 可以最远到达 furthest=pos+nums[pos]<br>
     * 从 (pos, furthest) 选出一个位置, 从该位置出发能到达的最远位置重新赋值给 furthest, 因为原 furthest 之前的位置都不可能到达更远的位置了，所以将原 furthest 值赋值给 pos<br>
     */
    public int jump(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int steps = 1;
        int pos = 0;
        int furthest = pos + nums[pos];
        while (furthest < nums.length - 1) {
            int originFurthest = furthest;
            for (int i = pos; i <= originFurthest; i++) {
                furthest = Math.max(furthest, i + nums[i]);
            }
            pos = originFurthest;
            steps++;
        }
        return steps;
    }
} 