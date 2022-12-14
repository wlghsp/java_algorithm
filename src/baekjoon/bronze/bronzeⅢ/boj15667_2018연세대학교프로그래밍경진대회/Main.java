package baekjoon.bronze.bronzeⅢ.boj15667_2018연세대학교프로그래밍경진대회;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        n = n -1;
        int k = 1;
        while (true) {
            if (k * (k+1) == n) {
                break;
            }
            k++;
        }
        System.out.println(k);
    }
}
