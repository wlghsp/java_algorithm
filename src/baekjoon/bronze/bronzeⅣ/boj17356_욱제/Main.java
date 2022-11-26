package baekjoon.bronze.bronzeⅣ.boj17356_욱제;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double M = (b - a) / 400;
        double result = 1 / (1 + Math.pow(10, M));
        System.out.println(result);
    }
}
