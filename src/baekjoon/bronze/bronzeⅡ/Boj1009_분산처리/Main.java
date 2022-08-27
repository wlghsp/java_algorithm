package baekjoon.bronze.bronzeⅡ.Boj1009_분산처리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if (a % 10 == 0) {
                sb.append(10).append("\n");
                continue;
            }

            // (a^b) % n = (a % n) × (a % n)... 를 b번 한 것과 같다
            // 먼저 초기화를 위해 a * n을 1회 했으므로 for-loop는 b-1회,
            int num = a % 10;
            for (int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
