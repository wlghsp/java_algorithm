package programmers.코딩기초트레이닝.수열과구간쿼리2;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] arr, int[][] queries) {
        return Arrays.stream(queries)
                .mapToInt(query -> IntStream.rangeClosed(query[0], query[1])
                        .map(j -> arr[j])
                        .filter(j -> j > query[2])
                        .min().orElse(-1))
                .toArray();
    }

    public int[] solution1(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int idx = 0;
        for (int[] query : queries) {
            int s = query[0];
            int e = query[1];
            int k = query[2];
            int minVal = Integer.MAX_VALUE;
            for (int i = s; i <= e; i++) {
                if (arr[i] > k) {
                    minVal = Math.min(minVal, arr[i]);
                }
            }
            answer[idx++] = minVal != Integer.MAX_VALUE ? minVal : -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{0,1,2,4,3},
                new int[][]{{0, 4, 2}, {0, 3, 2}, {0, 2, 2}}))); // [3, 4, -1]
    }
}
