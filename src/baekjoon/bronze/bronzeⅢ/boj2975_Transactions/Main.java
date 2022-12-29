package baekjoon.bronze.bronzeⅢ.boj2975_Transactions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int starting = Integer.parseInt(st.nextToken());
            String letter = st.nextToken();
            int amount = Integer.parseInt(st.nextToken());
            if (starting == 0 && "W".equals(letter) && amount == 0) break;
            if ("W".equals(letter)) {
                starting -= amount;
            } else {
                starting += amount;
            }
            if (starting < -200) {
                System.out.println("Not allowed");
            } else {
                System.out.println(starting);
            }
        }
    }
}
