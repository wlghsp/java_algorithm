package baekjoon.bronze.bronzeⅡ.Boj1568_새;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = 1;
        int time = 0;
        while (true) {
            if (N == 0) break;
            if (N < num) num = 1;
            N -= num++;
            time++;
        }
        System.out.println(time);
    }
}
