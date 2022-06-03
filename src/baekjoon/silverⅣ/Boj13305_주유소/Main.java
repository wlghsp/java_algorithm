package baekjoon.silverⅣ.Boj13305_주유소;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        long[] roads = new long[N - 1];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            roads[i] =  Long.parseLong(st.nextToken());
        }

        long[] prices = new long[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            prices[i] = Long.parseLong(st.nextToken());
        }

        long minPrice = roads[0] * prices[0];

        long min_cost = prices[0];

        for (int i = 1; i < N-1; i++) {
            if (min_cost > prices[i]){
                min_cost = prices[i];
            }
            minPrice += min_cost * roads[i];
        }

        System.out.println(minPrice);

    }
}
