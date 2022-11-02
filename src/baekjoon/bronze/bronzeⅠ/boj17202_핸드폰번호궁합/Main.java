package baekjoon.bronze.bronzeⅠ.boj17202_핸드폰번호궁합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine();
        String b = br.readLine();
        String ab = "";
        for (int i = 0; i < a.length(); i++) {
            ab += a.charAt(i);
            ab += b.charAt(i);
        }
        while (ab.length() > 2) {
            String S = "";
            for (int i = 0; i < ab.length() - 1; i++) {
                int n = (ab.charAt(i) - 48) + (ab.charAt(i + 1) - 48);
                S += Integer.toString(n % 10);
            }
            ab = S;
        }
        System.out.println(ab);
    }
}
