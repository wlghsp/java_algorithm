package programmers.코딩기초트레이닝.수열과구간쿼리3;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for (int[] query : queries) {
            Collections.swap(list, query[0], query[1]);
        }
        return list.stream().mapToInt(i -> i).toArray();
    }
    public int[] solution1(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            swap(arr, query[0], query[1]);
        }
        return arr;
    }
    public void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{0,1,2,3,4}, new int[][]{
                {0,3}, {1,2}, {1, 4}
        })));  // [3, 4, 1, 0, 2]
    }
}
