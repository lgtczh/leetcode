package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/count-symmetric-integers/">LeetCode 2843. 统计对称整数的数目</a>
 */
public class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int num = low; num <= high; num++) {
            if (num < 100) {
                if (num % 11 == 0) ans++;
            } else if (num > 1000) {
                int leftSum = num / 1000 + num % 1000 / 100;
                int rightSum = num % 100 / 10 + num % 10;
                if (leftSum == rightSum) ans++;
            }
        }
        return ans;
    }
}