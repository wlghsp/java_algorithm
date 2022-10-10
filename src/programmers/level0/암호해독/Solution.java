package programmers.level0.암호해독;

public class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        for (int i = 1; i < cipher.length() + 1; i++) {
            if (i % code == 0) answer += cipher.charAt(i - 1);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("dfjardstddetckdaccccdegk", 4));  // "attack"
        System.out.println(s.solution("pfqallllabwaoclk", 2));  // "fallback"
    }
}
