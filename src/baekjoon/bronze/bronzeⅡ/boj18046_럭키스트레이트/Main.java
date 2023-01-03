package baekjoon.bronze.bronzeⅡ.boj18046_럭키스트레이트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int former = 0;
        int latter = 0;
        for (int i = 0; i < n.length() / 2; i++) {
            int numLeft = n.charAt(i) - 48;
            int numRight = n.charAt(i + n.length() / 2) - 48;
            former += numLeft;
            latter += numRight;
        }
        System.out.println(former == latter ? "LUCKY" : "READY");
    }
}
