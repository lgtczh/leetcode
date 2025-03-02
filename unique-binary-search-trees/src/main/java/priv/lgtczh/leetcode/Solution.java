package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/unique-binary-search-trees">LeetCode 96. 不同的二叉搜索树</a>
 */
class Solution {
    /**
     * 动态规划<br>
     * <br>
     * 1. 确定dp[i]及下标的含义: i个节点可以构成的互不相同的二叉搜索树的种数<br>
     * 2. 确定动态规划数组定义: <br>
     * 2.1 n个节点, 将元素i作为根节点的搜索树的数量 = 左子树有i-1个节点的二叉搜索树的数量 * 右子树有n-i个节点的二叉搜索树的数量<br>
     * 2.2 任一节点都可以作为根节点, 因此递推公式为: dp[n]=dp[n-1] * dp[0] + dp[n-2] * dp[1] + ... + dp[0] * dp[n-1]<br>
     * 3. 初始化动态规划数组: dp[0]=1, dp[1]=1<br>
     * 4. 确定递推顺序: 按节点数量从小到大遍历, 对每个数量i将所有小于i的树作为根节点遍历一遍<br>
     *
     * @see <a href="https://github.com/lgtczh/algorithm/blob/master/%E4%BA%8C%E5%8F%89%E6%A0%91/%E4%BA%8C%E5%8F%89%E6%90%9C%E7%B4%A2%E6%A0%91.md">二叉搜索树</a>
     */
    public int numTrees(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                dp[i] += dp[i - j - 1] * dp[j];
            }
        }
        return dp[n];
    }
} 