package inflearn.q21_격자판최대합;

import java.util.Scanner;

public class Main {

    private int solution(int[][] m) {
        int answer = 0;

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
        System.out.println(T.solution(map));
    }
}
