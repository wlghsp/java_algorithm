package programmers.코딩기초트레이닝.부분문자열;

public class Solution {
    public int solution(String str1, String str2) {
        return str2.contains(str1) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abc", "aabcc")); // 1
        System.out.println(s.solution("tbt", "tbbttb")); // 0
    }
}
