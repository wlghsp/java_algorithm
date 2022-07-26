package baekjoon.bronze.bronzeⅢ.Boj3053_택시기하학;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
            유클리드 기하학 원 넓이 : pi* r^2
            택시 기하학 원의 넓이 2 * r^2
         */
        double r = Double.parseDouble(br.readLine());
        System.out.println(String.format("%.6f", Math.PI * (r * r)));
        System.out.println(String.format("%.6f", 2 * (r * r)));

    }
}
