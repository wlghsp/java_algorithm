package baekjoon.bronze.bronzeⅡ.Boj10093_숫자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long a = Long.parseLong(st.nextToken());
        long b = Long.parseLong(st.nextToken());
        long bigger = Math.max(a, b);
        long smaller = Math.min(a, b);
        long cnt = (a == b) ? 0 : bigger - smaller - 1;
        StringBuilder sb = new StringBuilder();
        sb.append(cnt).append("\n");
        for (long i = smaller+1; i < bigger; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
