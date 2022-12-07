package baekjoon.bronze.bronzeⅢ.boj4880_다음수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a1 = Integer.parseInt(st.nextToken());
            int a2 = Integer.parseInt(st.nextToken());
            int a3 = Integer.parseInt(st.nextToken());
            if (a1 == 0 && a2 == 0 && a3 == 0) break;
            if ((a3 - a2) == (a2 - a1)) {
                sb.append("AP").append(" ").append(a3 + (a3 - a2)).append("\n");
            } else if ((a3/a2) == (a2/a1)) {
                sb.append("GP").append(" ").append(a3 * (a3 / a2)).append("\n");
            }
        }
        System.out.println(sb);
    }
}
