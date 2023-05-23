package programmers.코딩기초트레이닝.n번째원소까지;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list, int n) {
        return Arrays.stream(num_list)
                .limit(n)
                .toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list1 = {2, 1, 6};
        int[] num_list2 = {5, 2, 1, 7, 5};
        System.out.println(Arrays.toString(s.solution(num_list1, 1)));
        System.out.println(Arrays.toString(s.solution(num_list2, 3)));
    }
}
