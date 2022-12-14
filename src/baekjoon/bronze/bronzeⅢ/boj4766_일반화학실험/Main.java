package baekjoon.bronze.bronzeⅢ.boj4766_일반화학실험;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double temperature = -100d;
        while (true) {
            double d = Double.parseDouble(br.readLine());
            if (d == 999) break;
            if (temperature != -100d)
                System.out.printf("%.2f\n",d - temperature);
            temperature = d;
        }
    }
}
