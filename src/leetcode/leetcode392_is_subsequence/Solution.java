package leetcode.leetcode392_is_subsequence;

public class Solution {

    public boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public boolean isSubsequence1(String s, String t) {
        if (s.isEmpty()) {
            return true;
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
