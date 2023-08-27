package programmers.코딩기초트레이닝.그림확대;

import java.util.Arrays;

public class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        StringBuilder sb;
        int idx = 0;
        for (String s : picture) {
            sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                sb.append(String.valueOf(s.charAt(i)).repeat(k));
            }
            for (int i = 0; i < k; i++) {
                answer[idx++] = sb.toString();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new String[]{
                ".xx...xx.",
                "x..x.x..x",
                "x...x...x",
                ".x.....x.",
                "..x...x..",
                "...x.x...",
                "....x...."}, 2)));
        // ["..xxxx......xxxx..", "..xxxx......xxxx..",
        // "xx....xx..xx....xx", "xx....xx..xx....xx",
        // "xx......xx......xx", "xx......xx......xx",
        // "..xx..........xx..", "..xx..........xx..",
        // "....xx......xx....", "....xx......xx....",
        // "......xx..xx......", "......xx..xx......",
        // "........xx........", "........xx........"]
    }
}
