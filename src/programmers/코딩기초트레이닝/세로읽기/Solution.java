package programmers.코딩기초트레이닝.세로읽기;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {
    public String solution(String my_string, int m, int c) {
        return IntStream.iterate(c - 1, i -> i < my_string.length(), i -> i + m)
                .mapToObj(i -> String.valueOf(my_string.charAt(i)))
                .collect(Collectors.joining());
    }


    public String solution1(String my_string, int m, int c) {
        StringBuilder sb = new StringBuilder();
        for (int i = c - 1; i < my_string.length(); i+= m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ihrhbakrfpndopljhygc",
                4, 2)); // "happy"
        System.out.println(s.solution("programmers",
                1, 1)); // "programmers"
    }
}
