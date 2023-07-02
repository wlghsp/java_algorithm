package programmers.코딩기초트레이닝.꼬리문자열;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list)
                .filter(str -> !str.contains(ex))
                .collect(Collectors.joining());
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new String[]{"abc", "def", "ghi"}, "ef")); // "abcghi"
        System.out.println(s.solution(new String[]{"abc", "bbc", "cbc"}, "c")); // ""
    }
}
