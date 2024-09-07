package baekjoon.silver.silver2.boj2630_색종이만들기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int white, blue;
    static int[][] board;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj2630_색종이만들기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        board = new int[N][N];
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        partition(0, 0, N);

        System.out.println(white);
        System.out.println(blue);

    }

    private static void partition(int row, int col, int size) {
        if (colorCheck(row, col, size)) {
            if (board[row][col] == 0) {
                white++;
            } else {
                blue++;
            }
            return;
        }

        int newSize = size / 2;

        partition(row, col, newSize); // 2 사분면
        partition(row, col + newSize, newSize); // 1사분면
        partition(row + newSize, col, newSize); // 3사분면
        partition(row + newSize, col + newSize, newSize); // 4사분면
    }

    // 현재 파티션의 컬러가 같은지 체크한다.
    private static boolean colorCheck(int row, int col, int size) {
        int color = board[row][col]; // 첫 번째 원소를 기준으로 검사
        for (int i = row; i < row + size; i++) {
            for (int j = col; j < col + size; j++) {
                if (board[i][j] != color) return false;
            }
        }
        return true;
    }
}
