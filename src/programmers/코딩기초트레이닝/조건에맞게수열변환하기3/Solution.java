package programmers.코딩기초트레이닝.조건에맞게수열변환하기3;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr, int k) {
        return IntStream.of(arr).map(i -> k % 2 == 1 ? i * k :i + k ).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        int[] arr = {1, 2, 3, 100, 99, 98};
        int k1 = 3;
        int k2 = 2;
        System.out.println(Arrays.toString(s.solution(arr, k1)));
        System.out.println(Arrays.toString(s.solution(arr, k2)));
    }

}
