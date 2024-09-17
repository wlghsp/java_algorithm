package baekjoon.gold.gold5.boj15686_치킨배달;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static int N, M, answer = Integer.MAX_VALUE;
    static int[] combination;
    static ArrayList<int[]> chickens, houses;

    private static void dfs(int L, int S) {
        if (L == M) {
            int sum = 0;
            for (int[] house : houses) {
                int minDist = Integer.MAX_VALUE;
                for (int i : combination) {
                    int[] chicken = chickens.get(i);
                    minDist = Math.min(minDist, Math.abs(house[0] - chicken[0]) + Math.abs(house[1] - chicken[1]));
                }
                sum += minDist;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = S; i < chickens.size(); i++) {
                combination[L] = i;
                dfs(L + 1, i + 1);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold5/boj15686_치킨배달/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        houses = new ArrayList<>();
        chickens = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 1) {
                    houses.add(new int[]{i, j});
                } else if (x == 2) {
                    chickens.add(new int[]{i, j});
                }
            }
        }
        combination = new int[M];
        dfs(0, 0);

        System.out.println(answer);
    }
}
