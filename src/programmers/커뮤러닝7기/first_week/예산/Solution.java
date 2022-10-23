package programmers.커뮤러닝7기.first_week.예산;

import java.util.Arrays;

public class Solution {

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i = 0; i < d.length; i++) {
            if (d[i] <= budget) {
                answer++;
                budget -= d[i];
            } else break;
        }

        return answer;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[]{1,3,2,5,4}, 9));  // 3
        System.out.println(s.solution(new int[]{2,2,3,3}, 10));  // 4
    }
}
