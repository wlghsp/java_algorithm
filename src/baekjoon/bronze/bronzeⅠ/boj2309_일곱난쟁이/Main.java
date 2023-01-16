package baekjoon.bronze.bronzeⅠ.boj2309_일곱난쟁이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int N = 9;
        int[] heights = new int[N];
        int total = 0;
        for (int i = 0; i < N; i++) {
            heights[i] = Integer.parseInt(br.readLine());
            total += heights[i];
        }
        StringBuilder sb = new StringBuilder();
        Arrays.sort(heights);
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (total - heights[i] - heights[j] == 100) {
                    for (int k = 0; k < heights.length; k++) {
                        if (k == i || k == j) continue;
                        sb.append(heights[k]);
                        if(k < heights.length - 1) sb.append('\n');
                    }
                    System.out.println(sb);
                    System.exit(0); // 0은  정상 종료
                }
            }
        }
    }
}
