package leetcode.LeetCode392_IsSubsequence;

import java.io.IOException;

public class Solution_투포인터 {

    public boolean isSubsequence(String s, String t) {
        int p1 = 0, p2 = 0;

        while (p1 < s.length()) {
            if (p2 == t.length()) return false;
            if (s.charAt(p1) == t.charAt(p2)) p1++;
            p2++;
        }

        return true;
    }

    public static void main(String[] args) throws IOException {
        Solution_투포인터 T = new Solution_투포인터();

        System.out.println(T.isSubsequence("abc", "ahbgdc"));

    }
}
