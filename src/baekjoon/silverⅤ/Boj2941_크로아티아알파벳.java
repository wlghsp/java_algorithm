package baekjoon.silverⅤ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj2941_크로아티아알파벳 {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] cAlpha = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        String s = br.readLine();

        for (String alpha: cAlpha) {
            s = s.replace(alpha, "a");
        }

        System.out.println(s.length());

    }
}
