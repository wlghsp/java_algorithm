package baekjoon.silver.silver5.boj1439_뒤집기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver5/boj1439_뒤집기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int zeroGroup = str.charAt(0) == '0' ? 1 : 0;
        int oneGroup =  str.charAt(0) == '1' ? 1 : 0;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i - 1) != str.charAt(i)) {
                if (str.charAt(i) == '0') {
                    zeroGroup++;
                } else {
                    oneGroup++;
                }
            }

        }

        System.out.println(Math.min(zeroGroup, oneGroup));

    }
}
