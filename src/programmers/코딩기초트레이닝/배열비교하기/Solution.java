package programmers.코딩기초트레이닝.배열비교하기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = Integer.compare(arr1.length, arr2.length);

        if (answer == 0) {
            return Integer.compare(IntStream.of(arr1).sum(), IntStream.of(arr2).sum());
        }

        return answer;
    }

    public int solution1(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return arr1.length > arr2.length ? 1 : -1;
        } else {
            int a1 = Arrays.stream(arr1).sum();
            int a2 = Arrays.stream(arr2).sum();
            return Integer.compare(a1, a2);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{49,13}, new int[]{70, 11, 2})); // -1
        System.out.println(s.solution(new int[]{100, 17, 84, 1}, new int[]{55, 12, 65, 36})); // 1
        System.out.println(s.solution(new int[]{1, 2, 3, 4, 5}, new int[]{3, 3, 3, 3, 3})); // 0
    }
}
