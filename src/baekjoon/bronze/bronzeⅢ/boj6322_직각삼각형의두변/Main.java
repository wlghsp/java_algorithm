package baekjoon.bronze.bronzeⅢ.boj6322_직각삼각형의두변;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            if (a == 0 && b == 0 && c == 0) break;
            if (i != 1) System.out.println();
            double l = 0;
            char side = ' ';
            boolean possible = false;
            System.out.println("Triangle #" + i);
            if (c == -1) {
                l = a * a + b * b;
                side = 'c';
                possible = true;

            } else if (b == -1) {
                if (c > a) {
                    l = c * c - a * a;
                    side = 'b';
                    possible = true;
                }
            } else if (a == -1) {
                if (c > b) {
                    l = c * c - b * b;
                    side = 'a';
                    possible = true;
                }
            }
            if (possible) {
                System.out.printf("%s = %.3f\n", side, Math.sqrt(l));
            } else {
                System.out.println("Impossible.");
            }

            i++;
        }
    }
}
