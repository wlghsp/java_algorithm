package programmers.level0.한번만등장한문자;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue().size() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }

    // 내 풀이
    public String solution1(String s) {
        String answer = "";
        int[] alpha = new int[26];
        for (int i = 0; i < s.length(); i++) {
            alpha[s.charAt(i) - 97]++;
        }
        for (int i = 0; i < alpha.length; i++) {
            if (alpha[i] == 1) answer += (char) (i + 97);
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("abcabcadc")); // "d"
        System.out.println(s.solution("abdc")); // "abcd"
        System.out.println(s.solution("hello")); // "eho"
    }
}
