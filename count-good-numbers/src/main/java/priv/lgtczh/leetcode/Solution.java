package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/count-good-numbers/">LeetCode 1922. 统计好数字的数目</a>
 */
public class Solution {
    private final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        return (int) (pow(5, (n + 1) / 2) * pow(4, n / 2) % MOD);
    }

    private long pow(int num, long n) {
        if (n == 0) {
            return 1L;
        }
        long y = pow(num, n / 2);
        return (n % 2 == 0 ? y * y : y * y * num) % MOD;
    }
}