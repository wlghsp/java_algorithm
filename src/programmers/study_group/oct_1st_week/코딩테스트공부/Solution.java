package programmers.study_group.oct_1st_week.코딩테스트공부;

public class Solution {

    public int solution(int alp, int cop, int[][] problems) {
        int maxAlp = 0;
        int maxCop = 0;

        for (int[] problem : problems) {
            maxAlp = Math.max(maxAlp, problem[0]);
            maxCop = Math.max(maxCop, problem[1]);
        }

        alp = Math.min(alp, maxAlp);
        cop = Math.min(cop, maxCop);
        int[][] dp = new int[maxAlp + 1][maxCop + 1];
        for (int i = alp; i <= maxAlp; i++) {
            for (int j = cop; j <= maxCop; j++) {
                dp[i][j] = Integer.MAX_VALUE;
            }
        }

        dp[alp][cop] = 0;
        for (int i = alp; i <= maxAlp; i++) {
            for (int j = cop; j <= maxCop; j++) {
                if (i + 1 <= maxAlp){
                    dp[i + 1][j] = Math.min(dp[i + 1][j], dp[i][j] + 1);
                }
                if (j + 1 <= maxCop){
                    dp[i][j + 1] = Math.min(dp[i][j + 1], dp[i][j] + 1);
                }

                for (int[] problem : problems) {
                    int alpReq = problem[0];
                    int copReq = problem[1];
                    int alpRwd = problem[2];
                    int copRwd = problem[3];
                    int cost = problem[4];
                    if (i >= alpReq && j >= copReq) {
                        int nextAlp = Math.min(maxAlp, i + alpRwd);
                        int nextCop = Math.min(maxCop, j + copRwd);
                        dp[nextAlp][nextCop] = Math.min(dp[nextAlp][nextCop], dp[i][j] + cost);
                    }
                }
            }
        }

        return dp[maxAlp][maxCop];
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10, 10, new int[][]{{10,15,2,1,2}, {20,20,3,3,4}})); // 15
        System.out.println(s.solution(0, 0, new int[][]{{0,0,2,1,2}, {4,5,3,1,2}, {4,11,4,0,2}, {10,4,0,4,2}})); // 13
    }
}
