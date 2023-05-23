package programmers.코딩기초트레이닝.문자리스트를문자열로변환하기;

public class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"a", "b", "c"}));

    }
}
