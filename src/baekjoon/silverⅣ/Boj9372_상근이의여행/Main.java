package baekjoon.silverⅣ.Boj9372_상근이의여행;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int n, m, result;
    static boolean visit[];
    static int arr[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (t-- > 0) {
            st = new StringTokenizer(br.readLine());

            n = Integer.parseInt(st.nextToken()); // 국가수
            m = Integer.parseInt(st.nextToken()); // 비행기 종류

            // 매 테케마다 초기화한다.
            result = 0;
            arr = new int[n + 1][n + 1];
            visit = new boolean[n + 1];

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                arr[a][b] = 1;
                arr[b][a] = 1;
            }
            bfs();
            sb.append(result - 1 + "\n");
        }

        System.out.println(sb);
    }

    private static void bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visit[1] = true;
        while (!queue.isEmpty()) {
            result++;
            int val = queue.poll();
            for (int i = 1; i <= n; i++) {
                if (arr[val][i] != 0 && !visit[i]) {
                    visit[i] = true;
                    queue.add(i);
                }
            }
        }
    }
}
