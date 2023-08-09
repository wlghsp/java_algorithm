package programmers.코딩기초트레이닝.문자열섞기;

public class Solution {
    public String solution(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str1.length() ; i++) {
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aaaaa", "bbbbb")); // "ababababab"
    }
}
