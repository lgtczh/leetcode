package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/minimum-cost-to-move-chips-to-the-same-position">LeetCode 1217. 玩筹码</a>
 */
public class Solution {
    /**
     * 因为间隔一个位置移动没有代价，因此将奇数位置或偶数位置移到其它奇数或偶数位置都没有代价<br>
     * 因此只判断奇数和偶数位置上筹码的总数量，选择任一数量多的位置移动即可<br>
     * 如偶数位置筹码多，选择0位置，所有偶数筹码直接移动到0，奇数位置只需要移动到相邻的偶数位置后，再移动到0位置就没有代价了<br>
     */
    public int minCostToMoveChips(int[] position) {
        int evenNum = 0;
        for (int i : position) {
            if (i % 2 == 0) {
                evenNum ++;
            }
        }
        return Math.min(evenNum, position.length - evenNum);
    }
} 