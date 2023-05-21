package programmers.코딩기초트레이닝.길이에따른연산;

import java.util.Arrays;

public class Solution {

    public int solution(int[] num_list) {
        return num_list.length >= 11 ? Arrays.stream(num_list).sum() :
                Arrays.stream(num_list).reduce(1, (a, b) -> a * b);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] num_list1 = {3, 4, 5, 2, 5, 4, 6, 7, 3, 7, 2, 2, 1};
        int[] num_list2 = {2, 3, 4, 5};
        System.out.println(s.solution(num_list1));
        System.out.println(s.solution(num_list2));
    }
}
