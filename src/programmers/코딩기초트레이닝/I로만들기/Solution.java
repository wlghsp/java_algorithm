package programmers.코딩기초트레이닝.I로만들기;

import java.util.stream.Collectors;

public class Solution {

    public String solution(String myString) {
        return myString.replaceAll("[^l-z]", "l");
    }

    public String solution2(String myString) {
        return myString.chars()
                .mapToObj(i -> Character.toString(Integer.max(i, 'l')))
                .collect(Collectors.joining());
    }

    public String solution1(String myString) {
        StringBuilder answer = new StringBuilder();
        for (char c : myString.toCharArray()) {
            if (c < 'l') {
                answer.append('l');
            } else answer.append(c);
        }
        return answer.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcdevwxyz")); // "lllllvwxyz"
        System.out.println(s.solution("jjnnllkkmm")); // "llnnllllmm"
    }
}
