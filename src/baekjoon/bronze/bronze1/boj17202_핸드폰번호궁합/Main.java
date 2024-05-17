package baekjoon.bronze.bronze1.boj17202_핸드폰번호궁합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        String s2 = br.readLine();
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < s1.length(); i++) {
            s.append(s1.charAt(i)).append(s2.charAt(i));
        }
        while (s.length() > 2) {
            StringBuilder S = new StringBuilder();
            for (int i = 0; i < s.length() - 1; i++) {
                int n = Character.getNumericValue(s.charAt(i)) + Character.getNumericValue(s.charAt(i + 1));
                S.append(n % 10);
            }
            s = S;
        }
        System.out.println(s);

    }
}
