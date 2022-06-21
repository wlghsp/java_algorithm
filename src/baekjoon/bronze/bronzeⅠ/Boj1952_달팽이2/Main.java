package baekjoon.bronze.bronzeⅠ.Boj1952_달팽이2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int r, c, curve = 0;
    static boolean[][] visit;

    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        visit = new boolean[r + 1][c + 1];

        simulation();
    }

    private static void simulation() {
        int x = 1, y = 1, d = 0;
        int nx = 1, ny = 1;
        while (true) {
            visit[x][y] = true;

            nx = x + dx[d];
            ny = y + dy[d];

            if (nx >= 1 && ny >= 1 && nx <= r && ny <= c && !visit[nx][ny]) { // 범위 내이고 방문하지 않았다면
                x = nx;
                y = ny;
            } else { // 범위 밖이라면
                d = (d + 1) % 4; // 방향 바꾸기, 4로 나눈 나머지로 하면 0번 인덱스로 다시 돌아갈 수 있음
                x += dx[d];
                y += dy[d];
                if (visit[x][y]) { // 방문했다면 종료
                    break;
                }
                curve++; // 선 꺽음
            }
        }

        System.out.println(curve);
    }
}
