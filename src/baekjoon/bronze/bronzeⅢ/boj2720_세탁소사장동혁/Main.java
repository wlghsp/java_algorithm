package baekjoon.bronze.bronzeⅢ.boj2720_세탁소사장동혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] coins = {25, 10, 5, 1};
        while (T-- > 0) {
            int cent = Integer.parseInt(br.readLine());
            for (int coin : coins) {
                if (cent >= coin) {
                    sb.append(cent / coin).append(" ");
                    cent %= coin;
                } else {
                    sb.append(0).append(" ");
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
