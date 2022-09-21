package baekjoon.bronze.bronzeⅠ.boj16171_나는친구가적다_small;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine().replaceAll("[0-9]", "");
        String K = br.readLine();

        if (S.indexOf(K) != -1) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
