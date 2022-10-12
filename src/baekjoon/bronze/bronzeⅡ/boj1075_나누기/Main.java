package baekjoon.bronze.bronzeⅡ.boj1075_나누기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String original = br.readLine();
        String n = original.substring(0,original.length() - 2);
        int F = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < 100; i++) {
            String tmp = n;
            if (i < 10) {
                tmp += "0" + i;
            } else {
                tmp += String.valueOf(i);
            }
            if (Integer.parseInt(tmp) % F == 0) {
                answer = i;
                break;
            }
        }
        System.out.printf("%02d%n", answer);
    }
}
