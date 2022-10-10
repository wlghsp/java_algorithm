package programmers.level0.문자열정렬하기_2;

import java.util.Arrays;

public class Solution {

    public String solution(String my_string) {
        char[] arr = my_string.toLowerCase().toCharArray();
        Arrays.sort(arr);
        return new String(arr); // char배열을 String에 담아서 변환
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution("Bcad")); // "abcd"
        System.out.println(s.solution("heLLo")); // "ehllo"
        System.out.println(s.solution("Python")); // "hnopty"
    }
}
