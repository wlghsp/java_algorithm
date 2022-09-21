package baekjoon.bronze.bronzeⅠ.boj16171_나는친구가적다_small;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    // String 의 contains 로 확인
    // 대소문자를 구분함
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] S = br.readLine().toCharArray();
        String K = br.readLine();
        String newS = "";
        for (char c : S) {
            if (!Character.isDigit(c)) newS += c;
        }
        if (newS.contains(K)) System.out.println(1);
        else System.out.println(0);

    }
}
