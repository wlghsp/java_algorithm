package programmers.level0.문자열에문자열;

public class Solution {

    public int solution(String str1, String str2) {
        //return str1.contains(str2) ? 1 : 2;
        return str1.indexOf(str2) > -1 ? 1 : 2;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ab6CDE443fgh22iJKlmn1o", "6CD"));  // 1
        System.out.println(s.solution("ppprrrogrammers", "pppp"));  // 2
    }
}
