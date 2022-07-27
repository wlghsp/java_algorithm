package baekjoon.bronze.bronzeⅠ.Boj1546_평균구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        long maxVal = 0;
        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += arr[i];
            if (maxVal < arr[i]) maxVal = arr[i];
        }

        System.out.println(100.0*sum/maxVal/N);
    }
}
