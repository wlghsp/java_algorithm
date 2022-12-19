package baekjoon.bronze.bronzeⅢ.boj4740_거울오거울;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String s = br.readLine();
            if (s.equals("***")) break;
//            s = new StringBuilder(s).reverse().toString();
            s = getReversed(s);
            System.out.println(s);
        }

    }

    private static String getReversed(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = s.length() -1; i >= 0 ; i--) {
            result.append(s.charAt(i));
        }
        return result.toString();
    }

}
