package programmers.level0.아이스아메리카노;


import java.util.Arrays;

public class Solution {

    public int[] solution(int money) {
        int[] answer = new int[2];
        answer[0] = money / 5500;
        answer[1] = money % 5500;
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(5500)));  // [1, 0]
        System.out.println(Arrays.toString(s.solution(15000))); // [2, 4000]
    }
}
