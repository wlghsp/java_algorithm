package baekjoon.silver.silver4.boj11399_ATM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj11399_ATM/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int[] sums = new int[N];
        sums[0] = arr[0];
        for (int i = 1; i < N; i++) {
            sums[i] += sums[i - 1] + arr[i];
        }

        int ans = Arrays.stream(sums)
                .sum();

        System.out.println(ans);
    }
}
