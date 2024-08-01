package baekjoon.silver.silver3.boj26170_사과빨리먹기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int R, C;
    static int ans;
    static int[][] board = new int[5][5];
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver3/boj26170_사과빨리먹기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        ans = Integer.MAX_VALUE;
        board[R][C] = -1; // 시작점도 장애물로 만든다.

        dfs(R, C, 0, 0);

        System.out.println(ans == Integer.MAX_VALUE ? -1 : ans);
    }

    private static void dfs(int r, int c, int moveCnt, int ateCnt) {
        if (ateCnt >= 3) {
            ans = Math.min(ans, moveCnt);
            return;
        }

        for (int[] d : dir) {
            int nx = r + d[0];
            int ny = c + d[1];

            if (nx < 0 || ny < 0 || nx >= 5 || ny >= 5) continue;
            if (board[nx][ny] == -1) continue;

            if (board[nx][ny] == 1) { // 사과인 경우
                board[nx][ny] = -1; // 장애물로 변경
                dfs(nx, ny, moveCnt + 1,ateCnt + 1);
                board[nx][ny] = 1;  // 백트래킹: 상태복원하여 다른 경로에 영향 주지 않음
            } else {                // 빈칸인 경우
                board[nx][ny] = -1; // 장애물로 변경
                dfs(nx, ny, moveCnt + 1, ateCnt);
                board[nx][ny] = 0; // 백트래킹: 상태복원하여 다른 경로에 영향 주지 않음
            }

        }
    }
}
