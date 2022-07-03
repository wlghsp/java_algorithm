package inflearn.array_1_2차원배열.q22_봉우리;

import java.util.Scanner;

public class Main2 {

    // 상-우-하-좌 순서
    int[] dx = { -1, 0, 1, 0};
    int[] dy = {  0, 1, 0, -1};

    private int solution(int n, int[][] map) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                boolean flag = true;
                // 네 방향 확인
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && map[nx][ny] >= map[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;

            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] map = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = sc.nextInt();
            }
        }
        System.out.println(T.solution(n, map));

    }
}
