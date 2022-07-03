package inflearn.array_1_2차원배열.q22_봉우리;

import java.util.Scanner;

public class Main {

    private int solution(int n, int[][] map) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (map[i][j] > map[i][j-1] &&
                    map[i][j] > map[i][j+1] &&
                    map[i][j] > map[i-1][j] &&
                    map[i][j] > map[i+1][j]) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n+2][n+2];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, map));

    }
}
