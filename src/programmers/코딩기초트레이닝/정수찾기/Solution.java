package programmers.코딩기초트레이닝.정수찾기;

import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] num_list, int n) {
        return IntStream.of(num_list).anyMatch(num -> num == n) ? 1 : 0;
    }
}
