package programmers.코딩기초트레이닝.배열의길이에따라다른연산하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr, int n) {
        return IntStream.range(0, arr.length).map(i -> arr[i] + (i % 2 == (arr.length % 2 == 0 ? 1 : 0) ? n : 0)).toArray();
    }

    public int[] solution1(int[] arr, int n) {
        for (int i = arr.length % 2 == 1 ? 0 : 1; i < arr.length; i+= 2) {
            arr[i] += n;
        }
        return arr;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{49, 12, 100, 276, 33}, 27))); // [76,12,127,276,60]
        System.out.println(Arrays.toString(s.solution(new int[]{444, 555, 666, 777}, 100))); // [76,12,127,276,60]
    }
}
