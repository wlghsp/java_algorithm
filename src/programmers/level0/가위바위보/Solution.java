package programmers.level0.가위바위보;

public class Solution {

    public String solution(String rsp) {
        String answer = "";
        for (int i = 0; i < rsp.length(); i++) {
            char c = rsp.charAt(i);
            if (c == '2') answer += '0';
            else if (c== '0') answer += '5';
            else answer += '2';

        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution("2")); // "0"
        System.out.println(s.solution("205")); // "052"

    }
}
