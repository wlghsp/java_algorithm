package baekjoon.bronze.bronzeⅣ.boj14489_치킨두마리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if (a + b >= 2 * c) sb.append(a + b - 2 * c);
        else sb.append(a + b);
        System.out.println(sb);

    }
}
