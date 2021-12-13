package 백준강의.bruteForce;


/*
"""
상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.
가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다.
상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다.
이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.
사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)
다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.
사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.

출력
첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.

3
CCP
CCP
PPC

3


 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Boj3085_사탕게임 {

    static int check(char[][] a) {
        int n = a.length;
        int ans = 1; // 1개 부터 시작
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 1; j < n; j++) {
                // 행 확인
                if (a[i][j] == a[i][j-1]) {
                    cnt++;
                } else {
                    cnt = 1;
                }
                if (ans < cnt) ans = cnt;
            }
            cnt = 1;
            for (int j = 1; j < n; j++) {
                // 열 확인
                if (a[j][i] == a[j-1][i]) {
                    cnt++;
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


        StringTokenizer st;
        for (int i = 0; i < n; i++) {
           a[i] = br.readLine().toCharArray();
        }

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j + 1 < n) {
                    char t = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1]= t;
                    int temp = check(a);
                    if (ans < temp) ans = temp;
                    t = a[i][j];
                    a[i][j] = a[i][j+1];
                    a[i][j+1]= t;
                }

                if (i+1<n) {
                    char t = a[i][j];
                    a[i][j]= a[i+1][j];
                    a[i+1][j] = t;
                    int temp = check(a);
                    if (ans < temp) ans = temp;
                    t = a[i][j];
                    a[i][j]= a[i+1][j];
                    a[i+1][j] = t;
                }
            }
        }

        System.out.println(ans);


    }
}
