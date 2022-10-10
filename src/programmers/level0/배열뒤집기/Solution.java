package programmers.level0.배열뒤집기;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        int j = 0;
        for(int i = num_list.length-1; i >= 0; i--) answer[j++] = num_list[i];
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{1, 2, 3, 4, 5}))); // [5,4,3,2,1]
        System.out.println(Arrays.toString(s.solution(new int[]{1, 1, 1, 1, 1, 2}))); // [2, 1, 1, 1, 1, 1]
    }
}
