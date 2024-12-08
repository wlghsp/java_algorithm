package baekjoon.gold.gold4.boj11404_플로이드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 도시의 갯수
        int M = Integer.parseInt(br.readLine()); // 버스의 갯수

        // 무한대를 나타내는 값
        final int INF = 100_000_000;

        // 그래프 초기화
        int[][] graph = new int[N + 1][N + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (i == j) {
                    graph[i][j] = 0; // 자기 자신으로의 거리는 0
                } else {
                    graph[i][j] = INF; // 초기에는 무한대
                }
            }
        }

        // 입력받아 그래프 구성
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            // 같은 경로의 버스 중 더 짧은 길이만 저장
            graph[a][b] = Math.min(graph[a][b], c);
        }

        // 플로이드-워셜 알고리즘
        for (int k = 1; k <= N; k++) { // 거쳐가는 노드
            for (int i = 1; i <= N; i++) { // 시작 노드
                for (int j = 1; j <= N; j++) { // 도착 노드
                    if (graph[i][k] != INF && graph[k][j] != INF) {
                        graph[i][j] = Math.min(graph[i][j], graph[i][k] + graph[k][j]);
                    }
                }
            }
        }

        // 결과 출력
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                if (graph[i][j] == INF) {
                    System.out.print("0 "); // 갈 수 없는 경우 0 출력
                } else {
                    System.out.print(graph[i][j] + " ");
                }
            }
            System.out.println();
        }


    }
}
