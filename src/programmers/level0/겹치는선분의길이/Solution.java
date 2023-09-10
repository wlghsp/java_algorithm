package programmers.level0.겹치는선분의길이;

public class Solution {

    public int solution(int[][] lines) {
        int answer = 0;
        int[] arr = new int[201];
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {
                arr[i + 100]++;
            }
        }
        for (int i = 0; i < 201; i++) {
            if (arr[i] >= 2) answer++;
        }
        return answer;
    }

}
