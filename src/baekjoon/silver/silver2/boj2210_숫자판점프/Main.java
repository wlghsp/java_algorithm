package baekjoon.silver.silver2.boj2210_숫자판점프;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    static int end = 5;
    static int[][] board = new int[5][5];
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static Set<String> nums = new HashSet<>();
    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver2/boj2210_숫자판점프/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 0; i < 5; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 5; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(0, i, j, board[i][j] + "");
            }
        }
        
        System.out.println(nums.size());
    }

    private static void dfs(int start, int x, int y, String number) {
        if (start == end) {
            nums.add(number);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dir[i][0];
            int ny = y + dir[i][1];

            if (nx < 0 || nx >= 5 || ny < 0 || ny >= 5) continue;

            dfs(start + 1, nx, ny, number + board[nx][ny]);
        }

    }
}
