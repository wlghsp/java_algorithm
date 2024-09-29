package inflearn.dynamic_programming.최대점수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

class Problem {
    int score;
    int time;

    public Problem(int score, int time) {
        this.score = score;
        this.time = time;
    }
}

public class Main {
    static int N, M;
    static int[] dp;
    static List<Problem> problems;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        dp = new int[M + 1];
        problems = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int score = Integer.parseInt(st.nextToken());
            int time = Integer.parseInt(st.nextToken());
            problems.add(new Problem(score, time));
        }

        System.out.println(solution());
    }

    private static int solution() {
        for (Problem problem : problems) {
            for (int j = M; j >= problem.time; j--) {
                dp[j] = Math.max(dp[j], dp[j - problem.time] + problem.score);
            }
        }
        return dp[M] == Integer.MIN_VALUE ? -1 : dp[M];
    }
}
