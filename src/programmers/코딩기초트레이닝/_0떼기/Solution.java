package programmers.코딩기초트레이닝._0떼기;

public class Solution {
    public String solution(String n_str) {
        return "" + Integer.parseInt(n_str);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("0010"));  // "10"

    }
}
