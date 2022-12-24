package baekjoon.bronze.bronzeⅢ.boj16483_접시안의원;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double T = Double.parseDouble(br.readLine());
        System.out.printf("%.0f", Math.pow(T/2, 2));
    }
}
