package baekjoon.silverⅣ.Boj1388_바닥장식;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static char[][] board;
    static boolean[][] visited;

    /*
        DFS Algorithm - 재귀 함수 사용
        1. 벽이 나오면 함수 종료
        2. 이미 방문 기록이 있으면 함수 종료
        3. 현재 index의 모양이 '-'이고 다음 오른쪽 칸의 모양이 '-'이거나, 현재 index의 모양이 '-'이고 현재 index가 마지막 칸이면 오른쪽으로 이동
        4. 현재 index의 모양이 '|'이고 다음 아래 칸의 모양이 '|'이거나, 현재 index의 모양이 '|'이고 현재 index가 마지막 칸이면 아래로 이동
        5. 재귀 끝나면 True 반환하고 dfs()가 True 반환하는 경우 count += 1
     */

    public static boolean dfs(int x, int y) {
        if (x < -1 || x > N - 1 || y < -1 || y > M - 1) return false;
        if (visited[x][y]) return false;
        visited[x][y] = true;
        // y == M-1 이면
        if (board[x][y] == '-' && (y == M-1 || board[x][y+1] == '-')){
            // 오른쪽으로 이동
            dfs(x, y+1);
        } else if (board[x][y] == '|' && (x == N-1 || board[x+1][y] == '|')) {
            // 아랫쪽으로 이동
            dfs(x+1, y);
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        board = new char[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = str.charAt(j);
            }
        }

        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (dfs(i, j)) {
                    count += 1;
                }
            }
        }

        System.out.println(count);


    }
}
