package programmers.코딩기초트레이닝.카운트업;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int start, int end) {
        return IntStream.rangeClosed(start, end).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, 10)));
    }
}
