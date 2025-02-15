package priv.lgtczh.leetcode;

import org.apache.commons.lang.StringUtils;

/**
 * <a href="https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string">LeetCode 28. 找出字符串中第一个匹配项的下标</a>
 *
 * @see <a href="https://github.com/lgtczh/algorithm/blob/master/KMP%E7%AE%97%E6%B3%95.md">KMP算法</a>
 */
public class Solution {
    private final PartialMatchTableBuilder pmtBuilder = new PartialMatchTableBuilder();

    public int strStr(String haystack, String needle) {
        // 题目中两个字符串长度均大于0，这里其实无需判断
        if (StringUtils.isEmpty(haystack) || StringUtils.isEmpty(needle)) {
            return 0;
        }

        int[] partialMatchTable = pmtBuilder.build(needle);
        int m = haystack.length();
        int n = needle.length();
        for (int i = 0, j = 0; m - i >= n - j; i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j)) {
                j = partialMatchTable[j - 1];
            }
            if (haystack.charAt(i) == needle.charAt(j)) {
                j++;
            }
            if (j == n) {
                return i - n + 1;
            }
        }
        return -1;
    }
}