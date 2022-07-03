package baekjoon.bronze.bronzeⅡ.Boj2292_벌집;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int grp = 1;
        int result = 1;
        while (true) {
            if (result >= n) break;
            result += 6 * grp;
            grp++;
        }
        System.out.println(grp);
    }
}
