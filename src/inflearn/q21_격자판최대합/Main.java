package inflearn.q21_격자판최대합;

import java.util.Scanner;

public class Main {

    private int solution(int n, int[][] m) {
        int answer = Integer.MIN_VALUE;
        int sum1, sum2;
        // 각 행의 합, 각 열의 합마다 최대값 비교
        for (int i = 0; i < n; i++) {
            sum1 = sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum1 += m[i][j];
                sum2 += m[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1 = sum2 = 0;

        // 대각선의 합 구하고 비교하기
        for (int i = 0; i < n; i++) {
            sum1 += m[i][i];
            sum2 += m[i][n - i - 1];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);

        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n,map));
    }
}
