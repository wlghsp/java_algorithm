package programmers.코딩기초트레이닝.리스트자르기;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int n, int[] slicer, int[] num_list) {
        return IntStream
                .iterate(n == 1 ? 0 : slicer[0], i -> i <= (n == 2 ? num_list.length - 1 : slicer[1]), i -> n == 4 ? i + slicer[2] : i + 1)
                .map(i -> num_list[i])
                .toArray();
    }

    public int[] solution2(int n, int[] slicer, int[] num_list) {
        int start = n == 1 ? 0 : slicer[0];
        int end = n == 2 ? num_list.length - 1 : slicer[1];
        int step = n == 4 ? slicer[2] : 1;
        int[] answer = new int[(end - start + step) / step];
        int idx = 0;
        for (int i = start; i <= end; i+= step) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }

    public int[] solution1(int n, int[] slicer, int[] num_list) {
        int[] answer = {};
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];
        if (n == 1) {
            int len = b + 1;
            answer = new int[len];
            System.arraycopy(num_list, 0, answer, 0, len);
        } else if (n == 2) {
            int len = num_list.length - a;
            answer = new int[len];
            System.arraycopy(num_list, a, answer, 0, len);
        } else if (n == 3) {
            int len = b - a + 1;
            answer = new int[len];
            System.arraycopy(num_list, a, answer, 0, len);
        } else {
            int len = (b - a) / c + 1;
            answer = new int[len];
            int idx = 0;
            for (int i = a; i <= b; i+= 2) {
                answer[idx++] = num_list[i];
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(3, new int[]{1,5,2},
                new int[]{1,2,3,4,5,6,7,8,9})));  // [2,3,4,5,6]
        System.out.println(Arrays.toString(s.solution(4, new int[]{1,5,2},
                new int[]{1,2,3,4,5,6,7,8,9})));  // [2,4,6]
//        System.out.println(Arrays.toString(s.solution(1, new int[]{1,5,2},
//                new int[]{1,2,3,4,5,6,7,8,9})));  // [1,2,3,4,5,6]
//        System.out.println(Arrays.toString(s.solution(2, new int[]{1,5,2},
//                new int[]{1,2,3,4,5,6,7,8,9})));  // [2,4,6]

    }
}
