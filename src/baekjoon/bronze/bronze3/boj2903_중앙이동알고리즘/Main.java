package baekjoon.bronze.bronze3.boj2903_중앙이동알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int dot = 2;
        while (N-- > 0) {
            dot = dot * 2 - 1;
        }
        System.out.println(dot * dot);
    }
}
