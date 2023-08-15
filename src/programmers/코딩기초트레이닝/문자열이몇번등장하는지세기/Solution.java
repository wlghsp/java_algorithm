package programmers.코딩기초트레이닝.문자열이몇번등장하는지세기;

import java.util.stream.IntStream;

public class Solution {
    public int solution(String myString, String pat) {
        return (int) IntStream.range(0, myString.length()).filter(i -> myString.startsWith(pat, i)).count();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("aaaa", "aa"));
    }
}
