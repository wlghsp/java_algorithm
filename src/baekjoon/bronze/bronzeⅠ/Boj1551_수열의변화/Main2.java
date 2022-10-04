package baekjoon.bronze.bronzeⅠ.Boj1551_수열의변화;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {
    static int SIZE;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int i = 0, n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
        SIZE = n; arr = new int[n];
        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            arr[i++] = Integer.parseInt(st.nextToken(","));
        }

        for (int j = 0; j < k; j++) {
            transform();
        }
        i = 0;
        while (true) {
            System.out.print(arr[i++]);
            if (i == SIZE) break;
            System.out.print(",");
        }
    }

    private static void transform() {
        --SIZE;
        for (int i = 0; i < SIZE; i++) {
            arr[i] = arr[i+1] - arr[i];
        }
    }
}
