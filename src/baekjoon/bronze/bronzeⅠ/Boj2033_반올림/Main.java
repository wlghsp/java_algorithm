package baekjoon.bronze.bronzeⅠ.Boj2033_반올림;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        double N = Double.parseDouble(br.readLine());

        double num = 10;
        while (true) {
            if (N > num){
                N = Math.round(N / num) * num;
            } else {
                break;
            }
            num *= 10;
        }

        System.out.println(Math.round(N));
    }
}
