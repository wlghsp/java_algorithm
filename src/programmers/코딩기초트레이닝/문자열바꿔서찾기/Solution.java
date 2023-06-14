package programmers.코딩기초트레이닝.문자열바꿔서찾기;

import java.util.stream.Collectors;

public class Solution {
    public int solution(String myString, String pat) {
        return myString.chars().mapToObj(c -> c == 'A' ? "B" : "A")
                .collect(Collectors.joining()).contains(pat) ? 1 : 0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("ABBAA", "AABB")); // 1
        System.out.println(s.solution("ABAB", "ABAB")); // 0
    }
}
