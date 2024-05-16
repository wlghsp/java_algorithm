package baekjoon.bronze.bronze3.boj2720_세탁소사장동혁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            int cents = Integer.parseInt(br.readLine());

            int quater = cents / 25;
            cents = cents % 25;

            int dime = cents / 10;
            cents = cents % 10;

            int nickel = cents / 5;
            cents = cents % 5;

            int penny = cents;
            sb.append(quater).append(" ")
                    .append(dime).append(" ")
                    .append(nickel).append(" ")
                    .append(penny).append("\n");
        }

        System.out.println(sb);
    }
}
