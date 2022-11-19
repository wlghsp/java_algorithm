package baekjoon.bronze.bronzeⅢ.boj3460_이진수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            String s = "";
            while (n/2 != 0) {
                s += n % 2 + "";
                n = n/2;
            }
            s += n;
            for (int j = 0; j < s.length(); j++) {
                if ((s.charAt(j) -48) == 1) sb.append(j).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
