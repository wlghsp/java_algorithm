package baekjoon.bronze.bronzeⅠ.Boj8595_히든넘버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String word = br.readLine();

        int pt = 0;
        long result = 0;
        boolean hiddenFound = false;

        while (pt < n) {
            if (Character.isDigit(word.charAt(pt))) {
                hiddenFound = true;
                String num = "";
                while (pt < n && Character.isDigit(word.charAt(pt))) {
                    num += word.charAt(pt++);
                }
                result += Long.parseLong(num);
            }
            pt++;
        }

        if (hiddenFound) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}
