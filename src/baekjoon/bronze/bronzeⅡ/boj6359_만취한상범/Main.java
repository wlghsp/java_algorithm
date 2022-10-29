package baekjoon.bronze.bronzeⅡ.boj6359_만취한상범;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N + 1];
            for (int i = 1; i <= N; i++) {
                for (int j = i; j <= N; j+=i) {
                    if (arr[j] == 1) arr[j] = 0;
                    else arr[j] = 1;
                }
            }
            int cnt = 0;
            for (int i = 1; i < N + 1; i++) {
                if (arr[i] == 1) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
