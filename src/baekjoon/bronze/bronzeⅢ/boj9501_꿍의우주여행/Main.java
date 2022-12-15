package baekjoon.bronze.bronzeⅢ.boj9501_꿍의우주여행;

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
            int N = Integer.parseInt(st.nextToken()); // 우주선의 갯수
            double D = Double.parseDouble(st.nextToken()); // 목적지까지의 거리
            int cnt = 0;
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int v = Integer.parseInt(st.nextToken());
                int f = Integer.parseInt(st.nextToken());
                double c = Double.parseDouble(st.nextToken());
                double hour = D / v;
                if (c * hour <= f) cnt++;
            }
            System.out.println(cnt);
        }
    }
}
