package programmers.코딩기초트레이닝.배열만들기1;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int n, int k) {
        return IntStream.rangeClosed(1, n).filter(i -> i % k == 0).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        System.out.println(Arrays.toString(s.solution(10, 3)));

    }
}
