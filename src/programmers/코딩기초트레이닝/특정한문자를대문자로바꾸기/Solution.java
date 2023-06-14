package programmers.코딩기초트레이닝.특정한문자를대문자로바꾸기;

public class Solution {
    public String solution(String my_string, String alp) {
        return my_string.replaceAll(alp, alp.toUpperCase());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("programmers", "p")); // "Programmers"
        System.out.println(s.solution("lowercase", "x")); // "lowercase"
    }
}
