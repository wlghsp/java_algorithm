package baekjoon.bronze.bronzeⅢ.boj4806_줄세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = "";
        int cnt = 0;
        while ((s = br.readLine()) != null) {
            cnt++;
        }
        System.out.println(cnt);
    }
}
