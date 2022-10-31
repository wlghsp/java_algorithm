package programmers.커뮤러닝7기.first_week.기지국설치;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {

    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int si = 0;
        int position = 1;
        while (position <= n) {
            if (si < stations.length && stations[si] - w <= position) {
                position = stations[si] + w + 1;
                si += 1;
            }  else {
                answer += 1;
                position += w * 2 + 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution2 s = new Solution2();
        System.out.println(s.solution(11, new int[]{4, 11}, 1));  // 3
        System.out.println(s.solution(16, new int[]{9}, 2));      // 3
    }

}
