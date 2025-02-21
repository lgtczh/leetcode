package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/gas-station">LeetCode 134. 加油站</a>
 */
public class Solution {
    /**
     * 如果从加油站x无法到达加油站y的下一个加油站，则从x，y之间的任何一个加油站出发，都无法达到加油站y的下一个加油站。<br>
     * <br>
     * 如果0开始，顺序判断累计加油量和累计耗油量大小，如果出现累计耗油量大于累计加油量，则说明从起点无法到达当前加油站；<br>
     * 则只能从无法到达的下个加油站开始，重新判断，直到检查到最后一个加油站。
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        while (start < gas.length) {
            int nextStart = canComplete(start, gas, cost);
            if (nextStart == start) {
                return start;
            }
            start = nextStart;
        }
        return -1;
    }

    private int canComplete(int start, int[] gas, int[] cost) {
        int stationNum = gas.length;
        int gasSum = 0;
        int costSum = 0;
        for (int i = 0; i < stationNum; i++) {
            gasSum += gas[(start + i) % stationNum];
            costSum += cost[(start + i) % stationNum];
            if (gasSum < costSum) {
                // 无法达到 start+i+1 加油站
                return start + i + 1;
            }
        }
        return start;
    }
}