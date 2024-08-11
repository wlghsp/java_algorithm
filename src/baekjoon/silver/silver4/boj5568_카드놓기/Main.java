package baekjoon.silver.silver4.boj5568_카드놓기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int N, K;
    static Set<String> set = new HashSet<>();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj5568_카드놓기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        K = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        boolean[] visited = new boolean[N];
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }

        dfs(arr, visited, "",0);

        System.out.println(set.size());
    }

    private static void dfs(int[] arr, boolean[] visited, String number, int cnt) {
        if (cnt == K) {
            set.add(number);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                dfs(arr, visited,number + arr[i], cnt + 1);
                visited[i] = false;
            }
        }
    }
}
