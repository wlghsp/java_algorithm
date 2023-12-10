package programmers.level1.k번째수;

import java.util.Arrays;

public class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int num;
        int index = 0;
        for (int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            int[] partArr = Arrays.copyOfRange(array, i - 1, j);
            Arrays.sort(partArr);
            num = partArr[k - 1];
            answer[index++] = num;
        }

        return answer;
    }
}
