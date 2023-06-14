package programmers.코딩기초트레이닝.마지막두원소;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int lastNum = num_list[num_list.length -1];
        int num = num_list[num_list.length - 2];
        int addNum = lastNum > num ? lastNum - num : lastNum * 2;
        System.arraycopy(num_list, 0, answer, 0, num_list.length);
        answer[answer.length - 1] = addNum;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[]{2, 1, 6}))); // [2,1,6,5]
        System.out.println(Arrays.toString(s.solution(new int[]{5, 2, 1, 7, 5}))); // [5, 2, 1, 7, 5, 10]
    }
}
