package leetcode.leetcode392_is_subsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        if (s.isEmpty() || t.isEmpty()) {
            return false;
        }
        int l = 0;
        for (int r = 0; r < t.length(); r++) {
            if (t.charAt(r) == s.charAt(l)) {
                int cnt = 0;
                int start = r;
                while (l < s.length() && start < t.length()) {
                    if (s.charAt(l) == t.charAt(start)) {
                        cnt++;
                        l++;
                    }
                    start++;
                }
                l = 0;
                if (cnt == s.length()) {
                    return true;
                }

            }
        }

        return false;

    }
}
