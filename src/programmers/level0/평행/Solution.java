package programmers.level0.평행;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    int answer;
    public int solution(int[][] dots) {
        answer = 0;
        // 1-2, 3-4가 이어졌을 때
        calculation(dots[0], dots[1], dots[2], dots[3]);
        // 1-3, 2-4가 이어졌을 때
        calculation(dots[0], dots[2], dots[1], dots[3]);
        // 1-4, 2-3가 이어졌을 때
        calculation(dots[0], dots[3], dots[1], dots[2]);
        return answer > 0 ? 1 : 0;
    }

    private void calculation(int[] a, int[] b, int[] c, int[] d) {
        double abDiff = (double) (b[1] - a[1]) / (b[0] - a[0]);
        double cdDiff = (double) (d[1] - c[1]) / (d[0] - c[0]);
        if (abDiff == cdDiff) {
            answer++;
        }
    }


}
