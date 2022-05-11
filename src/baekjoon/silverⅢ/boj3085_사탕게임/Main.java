package baekjoon.silverⅢ.boj3085_사탕게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int N;
    static char[][] board;
    static int ans;

    public static void search() {
        // 행 체크
        // 시작점을 포함하므로 cnt는 1개부터 시작
        for (int i = 0; i < N; i++) {
            int cnt = 1;
            for (int j = 1; j < N; j++) {
                if (board[i][j-1] == board[i][j]) {
                    cnt++;
                    ans = Math.max(ans, cnt);
                } else {
                    cnt = 1;
                }
            }
        }

        // 열 체크
        for (int j = 0; j < N; j++) {
            int cnt = 1;
            for (int i = 1; i < N; i++) {
                if (board[i-1][j] == board[i][j]) {
                    cnt++;
                    ans = Math.max(ans, cnt);
                } else {
                    cnt = 1;
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());

        board = new char[N][N];

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < N; j++) {
                board[i][j] = s.charAt(j);
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (j + 1 < N) {
                    char temp = board[i][j];
                    board[i][j] = board[i][j+1];
                    board[i][j+1] = temp;

                    // →, ↓ 체크
                    search();

                    // 원상복구
                    temp = board[i][j+1];
                    board[i][j+1] = board[i][j];
                    board[i][j] = temp;

                }

                if (i + 1 < N) { // 열 교환
                    char temp = board[i][j];
                    board[i][j] = board[i+1][j];
                    board[i+1][j] = temp;

                    // →, ↓ 체크
                    search();

                    // 원상복구
                    temp = board[i+1][j];
                    board[i+1][j] = board[i][j];
                    board[i][j] = temp;
                }
            }
        }

        System.out.println(ans);
    }
}
