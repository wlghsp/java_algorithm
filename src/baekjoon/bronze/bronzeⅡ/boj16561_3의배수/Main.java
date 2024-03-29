package baekjoon.bronze.bronzeⅡ.boj16561_3의배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 두 개를 뽑으면 나머지 하나는 결정된다.
        int cnt = 0;
        int N = Integer.parseInt(br.readLine());
        for (int i = 1; i <= N/3; i++) {
            for (int j = 1; j <= N/3; j++) {
                int sum = 0;
                sum = i * 3 + j * 3;
                if ((N-sum) % 3 == 0 && sum < N) cnt++;
            }
        }
        System.out.println(cnt);

    }
}
