package baekjoon.silverⅤ.Boj4796_캠핑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int index = 1;
        StringTokenizer st;
        while (true) {
            st = new StringTokenizer(br.readLine());
            int l = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            if (l== 0 && p == 0 && v == 0) break;
            int answer = ((v / p) * l) + Math.min((v % p), l);
            System.out.print(String.format("Case %d: %d%n", index++, answer));
        }
    }
}
