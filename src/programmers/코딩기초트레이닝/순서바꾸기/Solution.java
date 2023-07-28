package programmers.코딩기초트레이닝.순서바꾸기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] num_list, int n) {
        return IntStream.range(0, num_list.length).map(i -> num_list[(i + n) % num_list.length]).toArray();
    }

    public int[] solution1(int[] num_list, int n) {
        int length = num_list.length;
        int[] answer = new int[length];
        int idx = 0;
        for (int i = n; i < length; i++) {
            answer[idx++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 1, 6}, 1))); // 1, 6, 2
        System.out.println(Arrays.toString(s.solution(new int[]{5, 2, 1, 7, 5}, 3))); // [7, 5, 5, 2, 1]
    }
}
