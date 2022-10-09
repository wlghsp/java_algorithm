package programmers.level0.특정문자제거하기;

public class Solution {

    public String solution(String my_string, String letter) {
        return my_string.replace(letter, "");
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcdef", "f")); // "abcde"
        System.out.println(s.solution("BCBdbe", "B")); // "Cdbe"
    }
}
