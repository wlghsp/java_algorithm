package programmers.코딩기초트레이닝.콜라츠수열만들기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int n) {
        int[] arr = new int[1001];
        int idx = 0;
        while (n != 1) {
            arr[idx++] = n;
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = 3 * n + 1;
            }
        }
        arr[idx++] = n;
        return Arrays.copyOfRange(arr, 0, idx);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(10))); // [10, 5, 16, 8, 4, 2, 1]

    }
}
