package programmers.level0.등수매기기;

import java.util.Arrays;

public class Solution {

    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];
        for (int i = 0; i < score.length; i++) average[i] = (double)(score[i][0] + score[i][1]) / 2;
        for (int i = 0; i < average.length; i++) {
            answer[i] = 1;
            for (int j = 0; j < answer.length; j++) {
                if (average[i] < average[j]) answer[i]++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(new int[][]{{80, 70}, {90, 50}, {40, 70}, {50, 80}}))); // [1, 2, 4, 3]
        System.out.println(Arrays.toString(s.solution(new int[][]{{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10,30}}))); // [4, 4, 6, 2, 2, 1, 7]
    }
}
