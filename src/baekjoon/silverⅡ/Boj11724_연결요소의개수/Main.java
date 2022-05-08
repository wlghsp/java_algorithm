package baekjoon.silverⅡ.Boj11724_연결요소의개수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;
    static boolean[][] adj;
    static boolean[] chk;

    public static void dfs(int i) {
        for (int j = 1; j < N+1; j++) {
            if(adj[i][j] && !chk[j]) {
                chk[j] = true;
                dfs(j);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 정점의 갯수
        M = Integer.parseInt(st.nextToken()); // 간선의 갯수
        adj = new boolean[N + 1][N + 1]; // 인접 행렬
        chk = new boolean[N+1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            adj[a][b] = true;
            adj[b][a] = true;
        }
        int ans = 0;
        for (int i = 1; i < N+1; i++) {
            if(!chk[i]){
                ans++;
                chk[i] = true;
                dfs(i);
            }
        }

        System.out.println(ans);
    }
}
