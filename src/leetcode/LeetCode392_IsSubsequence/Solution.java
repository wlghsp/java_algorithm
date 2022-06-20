package leetcode.LeetCode392_IsSubsequence;

import java.io.IOException;

public class Solution {

    public boolean isSubsequence(String s, String t) {

        int len_s = s.length();

        if (len_s > t.length()) return false;
        if (len_s == 0) return true;

        int cnt = 0;

        for (char val : t.toCharArray()) {
            if (val == s.charAt(cnt)) {
                cnt++;
                if (cnt == len_s) return true;
            }
        }

        return false;
    }

    public static void main(String[] args) throws IOException {
        Solution T = new Solution();

        System.out.println(T.isSubsequence("abc", "ahbgdc"));

    }
}
