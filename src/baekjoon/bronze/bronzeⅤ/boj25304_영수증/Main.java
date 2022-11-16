package baekjoon.bronze.bronzeⅤ.boj25304_영수증;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine()); // 총 금액
        int N = Integer.parseInt(br.readLine());
        int total = 0;
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int price = Integer.parseInt(st.nextToken());
            int ea = Integer.parseInt(st.nextToken());
            total += price * ea;
        }
        if (total == X) System.out.println("Yes");
        else System.out.println("No");
    }
}
