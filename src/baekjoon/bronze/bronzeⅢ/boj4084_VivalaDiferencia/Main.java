package baekjoon.bronze.bronzeⅢ.boj4084_VivalaDiferencia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0 && c == 0 && d == 0) break;
            int cnt = 0;
            while (true){
                if (a == b && b == c && c == d && d == a) break;
                int ab = Math.abs(a - b);
                int bc = Math.abs(b - c);
                int cd = Math.abs(c - d);
                int da = Math.abs(d - a);
                a = ab;
                b = bc;
                c = cd;
                d = da;
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
