package priv.lgtczh.leetcode.greedy;

/**
 * <a href="https://leetcode.cn/problems/wiggle-subsequence">LeetCode 376. 摆动序列</a>
 *
 * @see <a href="https://leetcode.cn/problems/wiggle-subsequence/solutions/518651/376-bai-dong-xu-lie-tan-xin-jing-dian-ti-vyxt">「代码随想录」带你学透贪心算法！376. 摆动序列</a>
 */
public class Solution {
    public int wiggleMaxLength(int[] nums) {
        if (nums.length < 2) {
            return nums.length;
        }
        int ans = 1;
        int preDiff = 0;
        int diff;
        for (int i = 0; i < nums.length-1; i++) {
            diff = nums[i+1] - nums[i];
            if ((preDiff <= 0 && diff > 0) || (preDiff >= 0 && diff < 0)) {
                ans ++;
                preDiff = diff;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().wiggleMaxLength(new int[]{1, 2, 2, 2, 2, 1}));
    }
}
