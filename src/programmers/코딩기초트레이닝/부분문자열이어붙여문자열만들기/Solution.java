package programmers.코딩기초트레이닝.부분문자열이어붙여문자열만들기;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public String solution(String[] my_strings, int[][] parts) {
        return IntStream.range(0, my_strings.length).mapToObj(i -> my_strings[i].substring(parts[i][0], parts[i][1] + 1)).collect(Collectors.joining());
    }

    public String solution1(String[] my_strings, int[][] parts) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < my_strings.length; i++) {
            answer.append(my_strings[i], parts[i][0], parts[i][1] + 1);
        }
        return answer.toString();
    }


    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(s.solution(new String[]{"progressive", "hamburger", "hammer", "ahocorasick"}, new int[][]{{0, 4}, {1, 2}, {3, 5}, {7, 7}}));
    }
}
