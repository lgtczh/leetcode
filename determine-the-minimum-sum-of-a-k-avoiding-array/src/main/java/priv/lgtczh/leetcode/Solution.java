package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/determine-the-minimum-sum-of-a-k-avoiding-array/">LeetCode 2829. 确定 K-avoiding 数组的最小和</a>
 */
public class Solution {
    public int minimumSum(int n, int k) {
        int sum = 0;
        for (int i = 1; i <= k / 2 && n > 0; i++, n--) {
            sum += i;
        }
        while (n > 0) {
            sum += k;
            k++;
            n--;
        }
        return sum;
    }
}