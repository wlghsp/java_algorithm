package programmers.코딩기초트레이닝.배열만들기6;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int j : arr) {
            if (list.isEmpty()) {
                list.add(j);
            } else if (list.get(list.size() - 1) == j) {
                list.remove(list.size() - 1);
            } else if (list.get(list.size() - 1) != j) {
                list.add(j);
            }
        }
        return list.isEmpty() ? new int[]{-1} : list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{0, 1, 1, 1, 0}))); // [0, 1, 0]
    }
}
