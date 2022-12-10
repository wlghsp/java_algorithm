package baekjoon.bronze.bronzeⅢ.boj9550_아이들은사탕을좋아해;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                cnt += Integer.parseInt(st.nextToken()) / K;
            }
            System.out.println(cnt);
        }
    }
}
