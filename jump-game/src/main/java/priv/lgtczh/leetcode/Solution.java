package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/jump-game">LeetCode 55. 跳跃游戏</a>
 */
public class Solution {
    /**
     * 从 0 开始便利数组，初始最远能到达的位置为0<br>
     * 位置 i 能达到的最远位置为 i+nums[i]，因此如果 i 小于当前能达到的最远距离，则 i+nums[i] 也能到达，如果 i+nums[i] 大于当前记录的最远距离，则将其更新为最远距离<br>
     * 顺序遍历元素，直到遍历完成或无法导致下一个位置返回false，否则返回true
     */
    public boolean canJump(int[] nums) {
        int farthest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= farthest ) {
                farthest = Math.max(farthest, i + nums[i]);
                if (farthest >= nums.length - 1) {
                    return true;
                }
            } else {
                return false;
            }
        }
        return false;
    }
} 