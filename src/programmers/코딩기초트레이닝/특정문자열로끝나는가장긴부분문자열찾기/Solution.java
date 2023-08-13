package programmers.코딩기초트레이닝.특정문자열로끝나는가장긴부분문자열찾기;

public class Solution {

    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat);
        answer = myString.substring(0, idx) + pat;
        return answer;
    }

    public String solution1(String myString, String pat) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            answer = myString.substring(0, myString.length() - i);
            if (answer.endsWith(pat)) {
                return answer;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("AbCdEFG", "dE")); // "AbCdE"
    }
}
