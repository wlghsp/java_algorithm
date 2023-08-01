package programmers.코딩기초트레이닝.가까운1찾기;

import java.util.stream.IntStream;

public class Solution {

    public int solution(int[] arr, int idx) {
        return IntStream.range(idx, arr.length).filter(i -> arr[i] == 1).findFirst().orElse(-1);
    }

    public int solution1(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if (arr[i] == 1) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{0, 0, 0, 1}, 1)); // 3
        System.out.println(s.solution(new int[]{1, 0, 0, 1, 0, 0}, 4)); // -1
        System.out.println(s.solution(new int[]{1, 1, 1, 1, 0}, 3)); // 3
    }
}
