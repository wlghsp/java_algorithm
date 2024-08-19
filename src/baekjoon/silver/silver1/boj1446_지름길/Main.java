package baekjoon.silver.silver1.boj1446_지름길;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, D;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1446_지름길/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int[] dist = new int[D + 1];
        for (int i = 0; i <= D; i++) {
            dist[i] = i;  // 초기화: 지름길을 사용하지 않을 경우의 거리
        }

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());

            if (end <= D && dist[end] > dist[start] + length) {
                dist[end] = dist[start] + length;
            }
        }

        // 고속도로의 모든 지점을 순차적으로 업데이트
        for (int i = 1; i <= D; i++) {
            dist[i] = Math.min(dist[i], dist[i - 1] + 1);
        }

        // 최종 결과 출력
        System.out.println(dist[D]);
    }
}
