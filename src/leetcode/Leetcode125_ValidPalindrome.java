package leetcode;

import java.util.Locale;

public class Leetcode125_ValidPalindrome {

    public boolean isPalindrome(String s) {

        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed =  new StringBuilder(s).reverse().toString();
        return s.equals(reversed);
    }

    public static void main(String[] args) {
        Leetcode125_ValidPalindrome T = new Leetcode125_ValidPalindrome();

        String s1 = "0P";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(T.isPalindrome(s1)); // true
        System.out.println(T.isPalindrome(s2)); // false
        System.out.println(T.isPalindrome(s3)); // true

    }
}
