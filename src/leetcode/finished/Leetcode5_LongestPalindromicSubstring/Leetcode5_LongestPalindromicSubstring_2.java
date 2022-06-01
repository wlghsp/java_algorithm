package leetcode.finished.Leetcode5_LongestPalindromicSubstring;


// https://youtu.be/uT34fIpk7mk
public class Leetcode5_LongestPalindromicSubstring_2 {

    private int lo, maxLen;

    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            extendedPalindrome(s, i, i); //  assume odd length, try to extend Palindrome
            extendedPalindrome(s, i, i+1); //  assume even length
        }
        return s.substring(lo, lo + maxLen);
    }

    private void extendedPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }

        if (maxLen < k - j -1){
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }


    public static void main(String[] args) {
        Leetcode5_LongestPalindromicSubstring_2 T = new Leetcode5_LongestPalindromicSubstring_2();
        String s1 = "babad";
        String s2 = "cbbd";
        System.out.println(T.longestPalindrome(s1));
        System.out.println(T.longestPalindrome(s2));
    }
}
