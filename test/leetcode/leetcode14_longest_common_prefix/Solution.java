package leetcode.leetcode14_longest_common_prefix;

public class Solution {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder commPrefix = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            for (String s : strs) {
                if (i == s.length() || s.charAt(i) != strs[0].charAt(i)) {
                    return commPrefix.toString();
                }
            }
            commPrefix.append(strs[0].charAt(i));
        }

        return commPrefix.toString();
    }

    public String longestCommonPrefix1(String[] strs) {
        StringBuilder commPrefix = new StringBuilder();
        int minSize = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < minSize) {
                minSize = str.length();
            }
        }

        loop:for (int i = 0; i < minSize; i++) {
            char pre = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (pre != strs[j].charAt(i)) {
                    break loop;
                }
            }
            commPrefix.append(pre);
        }

        return commPrefix.toString();
    }
}
