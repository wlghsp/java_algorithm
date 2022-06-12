package baekjoon.bronze.bronzeⅠ.Boj14659_한조서열정리하고옴ㅋㅋ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int maxVal = 0;
        int ans = 0;
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st.nextToken());
            if (a > maxVal) {
                maxVal = a;
                cnt = 0;
            } else {
                cnt++;
            }

            ans = Math.max(ans, cnt);

        }

        System.out.println(ans);
    }
}
