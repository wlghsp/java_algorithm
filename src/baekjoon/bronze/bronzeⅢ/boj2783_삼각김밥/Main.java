package baekjoon.bronze.bronzeⅢ.boj2783_삼각김밥;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double sX = Double.parseDouble(st.nextToken());
        double sY = Double.parseDouble(st.nextToken());
        double minPrice = 1000 / sY * sX;

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            double x = Double.parseDouble(st.nextToken());
            double y = Double.parseDouble(st.nextToken());
            double price = 1000 / y * x;
            if (minPrice > price) {
                minPrice = price;
            }
        }
        System.out.printf("%.2f",minPrice);
    }
}
