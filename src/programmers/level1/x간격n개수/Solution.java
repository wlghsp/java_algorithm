package programmers.level1.x간격n개수;

public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) (i + 1) * x;
        }
        return answer;
    }


}
