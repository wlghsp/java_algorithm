package baekjoon.bronze.bronzeⅠ.boj16171_나는친구가적다_small;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine().replaceAll("[0-9]", "");
        String K = br.readLine();
        int kLen = K.length();
        boolean flag = false;

        // subString으로  앞에서부터 잘라가면 일치 여부 확인
        for (int i = 0; i <= S.length() - kLen; i++) {
            if (S.substring(i, i + kLen).equals(K)) flag = true;
        }

        System.out.println(flag ? 1: 0);

    }
}
