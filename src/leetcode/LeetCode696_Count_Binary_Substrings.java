package leetcode;

public class LeetCode696_Count_Binary_Substrings {


    // 1. Group By Character
    public int countBinarySubstrings1(String s) {
        int[] groups = new int[s.length()];
        int t = 0;

        groups[0] = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                groups[++t] = 1;
            } else {
                groups[t]++;
            }
        }

        int ans = 0;
        for (int i = 1; i <= t; i++) {
            ans += Math.min(groups[i - 1], groups[i]);
        }

        return ans;
    }

    // 2: Linear Scan
    public int countBinarySubstrings(String s) {
       int ans = 0, prev = 0, cur = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i-1) != s.charAt(i)) {
                ans += Math.min(prev, cur);
                prev = cur;
                cur = 1;
            } else {
                cur++;
            }
        }

        return ans + Math.min(prev, cur);
    }

    public static void main(String[] args) {
        String s = "00110011";
        LeetCode696_Count_Binary_Substrings T = new LeetCode696_Count_Binary_Substrings();
        System.out.println(T.countBinarySubstrings(s));

    }
}
