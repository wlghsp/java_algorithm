package inflearn.array_1_2차원배열.q21_격자판최대합;

import java.util.Scanner;

public class Main {

    private int solution(int n, int[][] m) {
        int answer = Integer.MIN_VALUE;
        int sumOfRow, sumOfCol;
        // 각 행의 합, 각 열의 합마다 최대값 비교
        for (int i = 0; i < n; i++) {
            sumOfRow = sumOfCol = 0;
            for (int j = 0; j < n; j++) {
                sumOfRow += m[i][j]; // 행의 합
                sumOfCol += m[j][i]; // 열의 합
            }
            answer = Math.max(answer, sumOfRow);
            answer = Math.max(answer, sumOfCol);
        }
        sumOfRow = sumOfCol = 0;

        // 대각선의 합 구하고 비교하기
        for (int i = 0; i < n; i++) {
            sumOfRow += m[i][i]; //왼쪽 위에서 오른쪽 아래 대각선
            sumOfCol += m[i][n - i - 1]; // 오른쪽 위에서 왼쪽 아래 방향 대각선
        }
        answer = Math.max(answer, sumOfRow);
        answer = Math.max(answer, sumOfCol);

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
