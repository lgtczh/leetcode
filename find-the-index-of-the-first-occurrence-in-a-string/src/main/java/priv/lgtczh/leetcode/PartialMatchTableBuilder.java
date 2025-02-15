package priv.lgtczh.leetcode;

import org.apache.commons.lang.StringUtils;

public class PartialMatchTableBuilder {
    public int[] build(String pattern) {
        if (StringUtils.isEmpty(pattern)) {
            return new int[0];
        }
        int[] partialMatchTable = new int[pattern.length()];
        partialMatchTable[0] = 0;

        int j = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) {
                j = partialMatchTable[j - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(j)) {
                j++;
            }
            partialMatchTable[i] = j;
        }
        return partialMatchTable;
    }
}
