package programmers.level1.문자열다루기기본;

public class Solution {

    public boolean solution(String s) {
        return s.matches("[0-9]{4}|[0-9]{6}");
    }
    public boolean solution1(String s) {
        boolean answer = true;
        if (s.length() != 4 && s.length() != 6) return false;
        for (char c : s.toCharArray()) {
            if (!(48 <= c && c <= 57)) return false;
        }
        return answer;
    }
}
