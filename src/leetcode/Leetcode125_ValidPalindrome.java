package leetcode;

public class Leetcode125_ValidPalindrome {

    public boolean isPalindrome(String s) {

        return true;
    }

    public static void main(String[] args) {
        Leetcode125_ValidPalindrome T = new Leetcode125_ValidPalindrome();

        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";
        String s3 = " ";

        System.out.println(T.isPalindrome(s1)); // true
        System.out.println(T.isPalindrome(s2)); // false
        System.out.println(T.isPalindrome(s3)); // true

    }
}
