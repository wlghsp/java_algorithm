package programmers.코딩기초트레이닝.배열의원소삭제하기;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(int[] arr, int[] delete_list) {
        return IntStream.of(arr).filter(i -> IntStream.of(delete_list).noneMatch(s -> s == i)).toArray();
    }

    public int[] solution1(int[] arr, int[] delete_list) {
        Integer[] array = Arrays.stream(delete_list).boxed().toArray(Integer[]::new);
        Set<Integer> array1 = Set.of(array);
        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (!array1.contains(i)) list.add(i);
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        // [293, 395, 678]
        System.out.println(Arrays.toString(s.solution(new int[]{293, 1000, 395, 678, 94}, new int[]{94, 777, 104, 1000, 1, 12})));

    }
}
