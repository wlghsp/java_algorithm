package leetcode.LeetCode9_PalindromeNumber;

public class Solution {

    public static String flip(int num) {
        return new StringBuilder(String.valueOf(num)).reverse().toString();
    }

    public static boolean isPalindrome(int x) {
        return String.valueOf(x).equals(flip(x));
    }


    public static void main(String[] args) {
        int x = 121;

        System.out.println(isPalindrome(x));
    }
}
