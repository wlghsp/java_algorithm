package programmers.커뮤러닝7기.first_week.자전거공장;

public class Solution {
    public int solution(int[][] cost, int[][] order) {
        int answer = 0;


        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{{0,10}, {50, 20}, {100, 30}, {200, 40}},
                new int[][]{{3, 50}, {7, 200}, {8, 200}})); // 5000
        System.out.println(s.solution(new int[][]{{0,10}, {50, 20}},
                new int[][]{{3, 100}, {4, 200}}));  // 4000

    }
}
