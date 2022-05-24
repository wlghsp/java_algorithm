package thisIsCodingTest.DFS_BFS.음료수얼려먹기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 음료수얼려먹기 {

    static int[][] graph;
    static int n,m;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        graph = new int[n][m];

        for (int i = 0; i < n; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < m; j++) {
                graph[i][j] = arr[j] - '0';
            }
        }

        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j) == true) {
                    result++;
                }
            }
        }

        System.out.println(result);

    }


    public static boolean dfs(int x, int y) {
        if (x <= -1 || x >= n || y <= -1 || y >= m) return false;

        if (graph[x][y] == 0) {
            graph[x][y] = 1;
            dfs(x - 1, y);
            dfs(x, y - 1);
            dfs(x, y + 1);
            dfs(x+1, y);
            return true;
        }

        return false;
    }
}
