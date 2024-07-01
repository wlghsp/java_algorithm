package baekjoon.silver.silver2.boj11724_연결요소의개수;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    final static int MAX = 1000 + 10;
    static boolean[][] graph;
    static boolean[] visited;
    static int N, M;
    static int answer;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj11724_연결요소의개수/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        graph = new boolean[N+1][N+1];
        visited = new boolean[N+1];
        // 1. graph에 연결 정보 채우기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = true;
            graph[b][a] = true;
        }

        // 2. dfs(재귀함수 호출)
        for (int i = 1; i <= N; i++) {
            if (!visited[i]) {
                answer++;
                visited[i] = true;
                dfs(i);
            }
        }
        // 3. 출력
        System.out.println(answer);
    }

    private static void dfs(int i) {
        for (int j = 1; j <= N; j++) {
            if (graph[i][j] && !visited[j]) {
                visited[j] = true;
                dfs(j);
            }
        }
    }


}
