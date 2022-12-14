package baekjoon.bronze.bronzeⅢ.boj6321_IBM빼기1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            s = getNextAlphabet(s);
            System.out.printf("String #%d\n", i);
            System.out.println(s);
            if (i != n) System.out.println();
        }
    }

    private static String getNextAlphabet(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            char tmp = (char) (s.charAt(i) + 1 == 91 ? 'A' : s.charAt(i) + 1);
            result += tmp;
        }
        return result;
    }
}
