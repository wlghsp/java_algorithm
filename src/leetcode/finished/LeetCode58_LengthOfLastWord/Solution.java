package leetcode.finished.LeetCode58_LengthOfLastWord;

public class Solution {


    public static int lengthOfLastWord(String s) {
        int answer = 0;
        String[] strArr = s.trim().split(" ");
        return strArr[strArr.length - 1].length();
    }


    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));
    }
}
