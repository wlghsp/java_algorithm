package baekjoon.bronze.bronzeⅠ.Boj10769_행복한지슬픈지;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int i;
        int happy = 0;
        int sad = 0;
        for (i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ':' && i + 2 < s.length()) {
                String t = s.substring(i + 1, i + 3);
                if ("-)".equals(t)) happy++;
                else if ("-(".equals(t)) sad++;
                i += 3;
            }
        }
        if (happy > sad) System.out.println("happy");
        else if (sad > happy) System.out.println("sad");
        else if (sad == 0 && happy == 0) System.out.println("none");
        else if (sad == happy) System.out.println("unsure");
    }
}
