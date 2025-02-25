package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/candy">LeetCode 135. 分发糖果</a>
 */
public class Solution {
    /**
     * 根据评分大小可以将数组看成一个或多个递增序列和递减序列的组合, 除两个相邻位置评分相等外, 前一个序列的结尾即是后一个序列的开头<br>
     * <br>
     * 1. 递增序列中, 比前一个多1即可, 其它不需要考虑, 当遇到评分与前一个孩子相等时, 因为只要求评分越高分得的糖果越多, 所以直接给该孩子分配1个糖果重新开始递增或递减<br>
     * 2. 递减序列因要求后面比前面的要小, 且最小不能小于1, 因此当递减序列降到0时, 必须将所有递减序列的值都加1<br>
     * 3. 当递减序列最左侧位置(糖果在递减序列中最多)分的的糖果等于相邻递增序列的最后位置的糖果数时, 后续要把该位置并入递减位置一起加1, 否则将导致该位置孩子分配的糖果违反分配机制<br>
     */
    public int candy(int[] ratings) {
        int ans = 1;
        int incLength = 1; // 递增序列的长度, 递增序列的实时长度也等于递增序列最后一个位置的孩子分得的糖果数量
        int decLength = 0; // 递减序列长度
        int pre = incLength; // 从递减序列重新进入递增序列时, 将incLength重置为1
        for (int i = 0; i < ratings.length - 1; i++) {
            if (ratings[i] > ratings[i + 1]) {
                // 进入递减序列, 初始分配1个, 如果分配的糖果数降到0, 则每个递减序列的孩子再都分配一个
                // 当递减序列长度超过递减序列长度时, 需要将递增序列的最后一个位置加入递减序列, 以避免该位置违反分配规则
                decLength++;
                if (decLength == incLength) {
                    decLength++; // 将递增序列的最后一个位置加入递减序列
                }
                ans += decLength;  // 递减序列没新增一个, 递减序列的所有位置都要新分配一个糖果
                pre = 1;
                continue;
            }
            // 进入递增序列
            incLength = pre;
            decLength = 0; // 递减序列长度置为0, 防止下次进入递减序列时初始分配的数量错误
            if (ratings[i] < ratings[i + 1]) {
                incLength++;
            } else if (ratings[i] == ratings[i + 1]) {
                incLength = 1;
            }
            pre = incLength;
            ans += incLength;
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().candy(new int[]{0, 1, 2, 5, 3, 2, 7}));
    }
} 