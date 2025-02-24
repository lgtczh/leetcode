package priv.lgtczh.leetcode;

/**
 * <a href="https://leetcode.cn/problems/minimum-swaps-to-make-strings-equal">LeetCode 1247. 交换字符使得字符串相同</a>
 */
public class Solution {
    /**
     * 先排除相等位置的字符<br>
     * 剩余不相等的字符数量为奇数, 则一定得不到相等的字符串<br>
     * 否则可以交换，交换次数如下：xx 和 yy 的仅交换一次, xy 和 yx 的交换两次，因此优先按1次交换，如果有剩余则交换两次
     */
    public int minimumSwap(String s1, String s2) {
        int xy = 0, yx = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(i)) {
                continue;
            }
            if (s1.charAt(i) == 'x') {
                xy++;
            } else {
                yx++;
            }
        }
        if ((xy + yx) % 2 == 1) {
            return -1;
        }
        return xy / 2 + yx / 2 + xy % 2 * 2;
    }
} 