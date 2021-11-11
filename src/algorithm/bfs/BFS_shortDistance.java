package algorithm.bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

7
8
1 2
1 3
2 4
2 5
3 7
4 6
5 6
6 7

*/

public class BFS_shortDistance {

    static int[][] map;
    static boolean[] visited;
    static StringTokenizer st;
    static int N, M, start, end;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        map = new int[N + 1][M + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {

        }

    }
}
