package programmers.코딩기초트레이닝.n개간격의원소들;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[] num_list, int n) {
        int length = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int[] answer = new int[length];
        int idx = 0;
        for (int i = 0; i < num_list.length; i+= n) {
            answer[idx++] = num_list[i];
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{4, 2, 6, 1, 7, 6}, 2))); // 4, 6, 7
        System.out.println(Arrays.toString(s.solution(new int[]{4, 2, 6, 1, 7, 6}, 4))); // 4, 7
    }
}
