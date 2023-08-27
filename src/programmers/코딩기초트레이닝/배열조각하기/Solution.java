package programmers.코딩기초트레이닝.배열조각하기;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution {

    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i] - 1;
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 2);
    }

    public int[] solution1(int[] arr, int[] query) {
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i : arr) {
            deque.offer(i);
        }
        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                int n = deque.size() - query[i] - 1;
                while (n > 0) {
                    deque.pollLast();
                    n--;
                }
            } else {
                int n = query[i];
                while (n > 0) {
                    deque.pollFirst();
                    n--;
                }
            }
        }

        return deque.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{0, 1, 2, 3, 4, 5}, new int[]{4, 1, 2}))); // [1,2,3]
    }
}
