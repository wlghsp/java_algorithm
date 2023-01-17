package baekjoon.silverⅢ.boj3085_사탕게임;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    private static int check(char[][] a, int start_row, int end_row, int start_col, int end_col) {
        int n = a.length;
        int ans = 1;
        for (int i = start_row; i <= end_row; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (a[i][j] == a[i][j - 1]) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }
                if (ans < cnt) ans = cnt;
            }
        }
        for (int i = start_col; i <= end_col; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                if (a[j][i] == a[j - 1][i]) {
                    cnt += 1;
                } else {
                    cnt = 1;
                }
                if (ans < cnt) ans = cnt;
            }
        }
        return ans;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        char[][] a = new char[n][n];
        for (int i = 0; i < n; i++) {
            a[i] = br.readLine().toCharArray();
        }
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) {
                    char t = a[i][j];
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = t;
                    int temp = check(a, i, i, j, j + 1);
                    if (ans < temp) ans = temp; // 최대갯수
                    t = a[i][j];
                    a[i][j] = a[i][j + 1];
                    a[i][j + 1] = t;
                }

                if (i + 1 < n) {
                    char t = a[i][j];
                    a[i][j] = a[i + 1][j];
                    a[i + 1][j] = t;
                    int temp = check(a, i, i + 1, j, j);
                    if (ans < temp) ans = temp; // 최대갯수
                    t = a[i][j];
                    a[i][j] = a[i + 1][j];
                    a[i + 1][j] = t;
                }
            }
        }
        System.out.println(ans);
    }
}
