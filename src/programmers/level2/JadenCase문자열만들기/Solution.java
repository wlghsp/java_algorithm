package programmers.level2.JadenCase문자열만들기;

public class Solution {
    public String solution(String s) {
        s = s.toLowerCase(); // 소문자 숫자 공백만 존재
        StringBuilder answer = new StringBuilder();
        boolean blank = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                answer.append(' ');
                blank = true;
            } else if (blank || i == 0) {
                answer.append(Character.toUpperCase(s.charAt(i)));
                blank = false;
            } else {
                answer.append(s.charAt(i));
            }
        }
        return answer.toString();
    }
}
