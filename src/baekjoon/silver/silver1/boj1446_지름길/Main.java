package baekjoon.silver.silver1.boj1446_지름길;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1446_지름길/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        ArrayList<ArrayList<int[]>> graph = new ArrayList<>();
        for (int i = 0; i <= D; i++) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
            if (end <= D) {
                graph.get(start).add(new int[]{end, length});
            }
        }

        int[] dist = new int[D + 1];
        for (int i = 0; i <= D; i++) {
            dist[i] = i;  // 초기화: 지름길을 사용하지 않을 경우의 거리
        }

        for (int i = 0; i <= D; i++) {
            if (i > 0) {
                dist[i] = Math.min(dist[i - 1] + 1, dist[i]);
            }

            for (int[] tmp : graph.get(i)) {
                int end = tmp[0];
                int length = tmp[1];
                if (dist[end] > dist[i] + length) {
                    dist[end] = dist[i] + length;
                }
            }
        }

        System.out.println(dist[D]);
    }
}
