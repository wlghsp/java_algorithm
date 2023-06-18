package programmers.코딩기초트레이닝.조건에맞게수열변환하기1;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] arr) {
        return Arrays.stream(arr)
                .map(i -> (i >= 50 && i % 2 == 0) ? i / 2 : (i < 50 && i % 2 == 1) ? i * 2 : i)
                .toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{
                1, 2, 3, 100, 99, 98
        }))); // [2, 2, 6, 50, 99, 49]
    }
}
