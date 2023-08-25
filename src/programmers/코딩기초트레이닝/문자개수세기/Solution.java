package programmers.코딩기초트레이닝.문자개수세기;

import java.util.Arrays;

public class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char c : my_string.toCharArray()) {
            if (c <= 'Z') {
                answer[c -'A']++;
            } else {
                answer[c - 'a' + 26]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution("Programmers")));
    }
}
