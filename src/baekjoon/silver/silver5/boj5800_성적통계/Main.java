package baekjoon.silver.silver5.boj5800_성적통계;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj5800_성적통계/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int classNo = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < K; i++) {
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] scores = new int[N];
            for (int j = 0; j < N; j++) {
                scores[j] = Integer.parseInt(st.nextToken());
            }

            Arrays.sort(scores);

            int maxVal = scores[N - 1];
            int minVal = scores[0];

            int largestGap = getLargestGap(scores);


            sb.append("Class ").append(classNo++).append("\n");
            sb.append("Max ").append(maxVal).append(", Min ").append(minVal).append(", Largest gap ").append(largestGap).append("\n");
        }

        System.out.println(sb);
    }

    private static int getLargestGap(int[] scores) {
        int largestGap = Integer.MIN_VALUE;

        for (int i = 1; i < scores.length; i++) {
            largestGap = Math.max(largestGap, scores[i] - scores[i - 1]);
        }

        return largestGap;
    }
}
