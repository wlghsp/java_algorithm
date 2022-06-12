package baekjoon.bronze.bronzeⅠ.Boj1526_가장큰금민수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main_DFS {

    static int result;
    static int N;

    static void DFS(int number) {
        if (number > N) return;
        result = Math.max(result, number);
        DFS(number * 10 + 4);
        DFS(number * 10 + 7);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        DFS(4);
        DFS(7);
        System.out.println(result);

    }
}
