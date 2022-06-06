package baekjoon.silverⅤ.Boj1436_영화감독숌;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int title = 666;
        int find_cnt = 0;

        while (true) {
            if (String.valueOf(title).contains("666")) {
                find_cnt++;
                if (find_cnt == N) {
                    System.out.println(title);
                    break;
                }
            }
            title++;
        }
    }
}
