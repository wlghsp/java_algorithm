package baekjoon.silver.silver1.boj3184_양;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int R, C;
    static boolean[][] visited;
    static String[] yard;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj3184_양/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());
        visited = new boolean[R][C];
        yard = new String[R];

        for (int i = 0; i < R; i++) {
            yard[i] = br.readLine();
        }
        // '.' 빈 필드, '#' 울타리, 'o' 양, 'v' 늑대
        int lamb = 0;
        int wolf = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (!visited[i][j] && yard[i].charAt(j) != '#') {
                    int[] cnts = dfs(i, j, new int[]{0, 0});
                    lamb += cnts[0] > cnts[1] ? cnts[0] : 0;
                    wolf += cnts[0] > cnts[1] ? 0 : cnts[1];
                }
            }
        }

        System.out.println(lamb + " " + wolf);

    }

    private static int[] dfs(int x, int y, int[] cnts) {
        visited[x][y] = true;
        cnts[0] += yard[x].charAt(y) == 'o' ? 1 : 0;
        cnts[1] += yard[x].charAt(y) == 'v' ? 1 : 0;

        for (int[] d : dir) {
            int nx = x + d[0];
            int ny = y + d[1];

            if (nx < 0 || ny < 0 || nx >= R || ny >= C) continue;
            if (visited[nx][ny]) continue;
            if (yard[nx].charAt(ny) == '#') continue;


            cnts = dfs(nx, ny, cnts);
        }

        return cnts;
    }


}
