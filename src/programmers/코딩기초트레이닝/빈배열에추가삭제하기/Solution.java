package programmers.코딩기초트레이닝.빈배열에추가삭제하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Stream;

public class Solution {

    public int[] solution(int[] arr, boolean[] flag) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                answer.append(String.valueOf(arr[i]).repeat(arr[i] * 2));
            } else {
                answer = new StringBuilder(answer.substring(0, answer.length() - arr[i]));
            }
        }

        return Stream.of(answer.toString().split("")).mapToInt(Integer::parseInt).toArray();
    }


    public int[] solution2(int[] arr, boolean[] flag) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    list.add(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    list.remove(list.size() - 1);
                }
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public int[] solution1(int[] arr, boolean[] flag) {
        Stack<Integer> stk = new Stack<>();
        for (int i = 0; i < flag.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    stk.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    stk.pop();
                }
            }
        }
        return stk.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{3,2,4,1, 3},
                new boolean[]{true, false, true, false, false}
        )));
    }
}
