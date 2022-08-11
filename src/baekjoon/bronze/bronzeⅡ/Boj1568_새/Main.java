package baekjoon.bronze.bronzeⅡ.Boj1568_새;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        int k = 1;
        while (N != 0) {
            if (k > N) k = 1;
            N -= k;
            k++;
            cnt++;
        }
        System.out.println(cnt);
    }
}
