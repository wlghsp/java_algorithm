package baekjoon.silver.silver4.boj1057_토너먼트;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj1057_토너먼트/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int jimin = Integer.parseInt(st.nextToken());
        int hansu = Integer.parseInt(st.nextToken());

        int cnt = 0;

        while (jimin != hansu) {
            jimin = jimin / 2 + jimin % 2;
            hansu = hansu / 2 + hansu % 2;
            cnt++;
        }

        System.out.println(cnt);
    }
}
