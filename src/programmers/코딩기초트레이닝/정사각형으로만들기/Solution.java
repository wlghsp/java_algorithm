package programmers.코딩기초트레이닝.정사각형으로만들기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public int[][] solution(int[][] arr) {
       int max = Math.max(arr.length, arr[0].length);
       int[][] answer = new int[max][max];
        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[0].length);
        }
        return answer;
    }


    public int[][] solution1(int[][] arr) {
        int rowSize = arr.length;
        int colSize = arr[0].length;
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            List<Integer> t = new ArrayList<>();
            for (int j = 0; j < arr[0].length; j++) {
                t.add(arr[i][j]);
            }
            list.add(t);
        }
        if (rowSize > colSize) {
            for (int i = 0; i < rowSize; i++) {
                List<Integer> integers = list.get(i);
                for (int j = 0; j < rowSize - colSize; j++) {
                    integers.add(0);
                }
            }

        } else {
            for (int i = 0; i < colSize - rowSize; i++) {
                List<Integer> t = new ArrayList<>();
                for (int j = 0; j < colSize; j++) {
                    t.add(0);
                }
                list.add(t);
            }
        }

        return list.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.deepToString(s.solution(
                new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}})));
        // [[572, 22, 37, 0], [287, 726, 384, 0], [85, 137, 292, 0], [487, 13, 876, 0]]
    }
}
