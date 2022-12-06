package baekjoon.bronze.bronzeⅢ.boj10409_서버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 일의 갯수
        int T = Integer.parseInt(st.nextToken()); // 최대 서버 할당 시간
        st = new StringTokenizer(br.readLine());
        int cnt = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            sum += tmp;
            if (sum > T) break;
            cnt++;
        }
        System.out.println(cnt);
    }
}
