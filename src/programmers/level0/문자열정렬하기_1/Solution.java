package programmers.level0.문자열정렬하기_1;

import java.util.Arrays;

public class Solution {

    public int[] solution(String my_string) {
        char[] chars = my_string.replaceAll("[^0-9]", "").toCharArray();
        int[] answer = new int[chars.length];
        for (int i = 0; i < chars.length; i++) answer[i] = chars[i] - '0';
        Arrays.sort(answer);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("hi12392"))); // [1, 2, 2, 3, 9]
        System.out.println(Arrays.toString(s.solution("p2o4i8gj2"))); // [2, 2, 4, 8]
        System.out.println(Arrays.toString(s.solution("abcde0"))); // [0]
    }
}
