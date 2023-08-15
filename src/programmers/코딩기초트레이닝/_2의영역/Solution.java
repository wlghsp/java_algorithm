package programmers.코딩기초트레이닝._2의영역;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public int[] solution(int[] arr) {
        int start = IntStream.range(0, arr.length)
                .filter(i -> arr[i] == 2)
                .findFirst()
                .orElse(-1);
        int end = IntStream.iterate(arr.length - 1, i -> i >= 0, i -> i - 1)
                .filter(i -> arr[i] == 2)
                .findFirst()
                .orElse(-1);
        if (start == -1 && end == -1) return new int[]{-1};
        if (start == end) return new int[]{arr[start]};
        int[] answer = new int[end - start + 1];

        System.arraycopy(arr, start, answer, 0, end - start + 1);
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1,2,1,4,5,2,9}))); // [2,1,4,5,2]
        System.out.println(Arrays.toString(s.solution(new int[]{1,2, 1}))); // [2]
        System.out.println(Arrays.toString(s.solution(new int[]{1,1, 1}))); // [-1]
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 1, 2, 1, 10, 2, 1}))); // [2, 1, 2, 1, 10, 2]

    }
}
