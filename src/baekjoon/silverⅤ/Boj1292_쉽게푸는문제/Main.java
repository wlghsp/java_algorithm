package baekjoon.silverⅤ.Boj1292_쉽게푸는문제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        int[] arr = new int[1002];
        int cnt = 1;
        for (int i = 1; i <= 1000; i++) {
            for (int j = 0; j < i; j++) {
                // count가 1001이 되면 멈춘다
                if (cnt == 1001) break;
                arr[cnt] = i;
                cnt++;
            }
        }

        int sum = 0;

        for (int i = a; i <= b; i++) {
            sum += arr[i];
        }

        System.out.println(sum);

    }
}
