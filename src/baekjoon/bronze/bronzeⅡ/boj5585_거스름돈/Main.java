package baekjoon.bronze.bronzeⅡ.boj5585_거스름돈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] coins = {500, 100, 50, 10, 5, 1};
        int cnt = 0;
        int money = 1000 - Integer.parseInt(br.readLine());
        int i = 0;
        while (money != 0) {
            if (coins[i] <= money) {
                cnt += money / coins[i];
                money %= coins[i];
            }
            i++;
        }

        System.out.println(cnt);
    }
}
