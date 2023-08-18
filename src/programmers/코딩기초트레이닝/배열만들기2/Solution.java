package programmers.코딩기초트레이닝.배열만들기2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int l, int r) {
        int[] array = IntStream.rangeClosed(l, r)
                .filter(this::checkPattern)
                .toArray();
        return array.length != 0 ? array : new int[]{-1};
    }

    public boolean checkPattern(int n) {
        return String.valueOf(n).replace("5", "").replace("0", "").isEmpty();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(5, 555))); // [5, 50, 55, 500, 505, 550, 555]
        System.out.println(Arrays.toString(s.solution(10, 20))); // [-1]
    }
}
