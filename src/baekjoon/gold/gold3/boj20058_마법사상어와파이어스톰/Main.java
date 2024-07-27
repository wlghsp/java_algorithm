package baekjoon.gold.gold3.boj20058_마법사상어와파이어스톰;

import java.io.*;

public class Main {

    static int N, Q, gridSize;
    static int[][] grid;
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold3/boj20058_마법사상어와파이어스톰/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        Q = Integer.parseInt(br.readLine());
        gridSize = (int) Math.sqrt(N);

    }
}
