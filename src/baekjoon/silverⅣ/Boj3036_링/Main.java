package baekjoon.silverⅣ.Boj3036_링;

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
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int bunmo = arr[0];
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < N; i++) {
            int gcd_result = gcd(arr[i], bunmo);
            sb.append((bunmo / gcd_result)).append('/').append(arr[i] / gcd_result).append('\n');
        }

        System.out.println(sb);
    }


    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }

        return Math.abs(a);
    }


}
