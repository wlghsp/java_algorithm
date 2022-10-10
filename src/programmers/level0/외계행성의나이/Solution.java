package programmers.level0.외계행성의나이;

import java.util.stream.Collectors;

public class Solution {

    public String solution1(int age) {
        String answer = "";
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        String s = String.valueOf(age);
        for (int i = 0; i < s.length(); i++) {
            answer += alpha[s.charAt(i) - '0'];
        }
        return answer;
    }

    public String solution(int age) {
        return String.valueOf(age).chars()
                .mapToObj(i -> String.valueOf((char) (49 + i)))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(23)); // "cd"
        System.out.println(s.solution(51)); // "fb"
        System.out.println(s.solution(100)); // "baa"
    }
}
