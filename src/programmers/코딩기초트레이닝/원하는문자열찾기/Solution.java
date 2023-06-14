package programmers.코딩기초트레이닝.원하는문자열찾기;

public class Solution {
    public int solution(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AbCdEfG", "aBc"));
    }
}
