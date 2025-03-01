package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/integer-break">LeetCode 343. 整数拆分</a>
 */
class Solution {
    public int integerBreak(int n) {
        if (n <= 3) {
            return n - 1;
        }
        int threeNum = n / 3;
        int ans = 1;
        if (n % 3 == 1) {
            threeNum--;
            ans *= 4;
        } else if (n % 3 == 2) {
            ans *= 2;
        }
        ans *= (int) Math.pow(3, threeNum);

        return ans;
    }
} 