package baekjoon.bronze.bronzeⅢ.boj10474_분수좋아해;

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
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a == 0 && b == 0) break;
            int integer = a / b;
            int deno = a % b;
            sb.append(String.format("%d %d / %d\n", integer, deno, b));
        }
        System.out.println(sb);
    }
}
