package inflearn.DFS_BFS활용.q80_피자배달거리_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static int N, M;
    static int answer;
    static ArrayList<int[]> houses, pizzas;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        houses = new ArrayList<>();
        pizzas = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                int x = Integer.parseInt(st.nextToken());
                if (x == 1) {
                    houses.add(new int[]{i, j});
                } else if (x == 2) {
                    pizzas.add(new int[]{i, j});
                }
            }
        }
        answer = Integer.MAX_VALUE;
        dfs(0, new ArrayList<>());

        System.out.println(answer);
    }

    private static void dfs(int start, List<Integer> path) {
        if (path.size() >= M) {
            int sum = 0;
            // 선택된 피자집으로 피자 배달거리 구해서 더하기
            for (int[] house : houses) {
                int minDist = Integer.MAX_VALUE;
                for (Integer i : path) {
                    int[] pizza = pizzas.get(i);
                    minDist = Math.min(
                            minDist,
                            Math.abs(house[0] - pizza[0]) + Math.abs(house[1] - pizza[1])
                    );
                }
                sum += minDist;
            }
            answer = Math.min(answer, sum);
        } else {
            for (int i = start; i < pizzas.size(); i++) {
                path.add(i);
                dfs(i + 1, path);
                path.remove(path.size() - 1);
            }
        }
    }
}
