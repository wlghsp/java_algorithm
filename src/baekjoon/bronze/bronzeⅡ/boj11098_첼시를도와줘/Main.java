package baekjoon.bronze.bronzeⅡ.boj11098_첼시를도와줘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            int p = Integer.parseInt(br.readLine());
            int maxPrice = Integer.MIN_VALUE;
            String maxPlayer = "";
            for (int j = 0; j < p; j++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int price = Integer.parseInt(st.nextToken());
                String player = st.nextToken();
                if (price > maxPrice) {
                    maxPrice = price;
                    maxPlayer = player;
                }
            }
            System.out.println(maxPlayer);
        }


    }
}
