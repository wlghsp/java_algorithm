package baekjoon.bronze.bronzeⅡ.Boj10102_개표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int v = Integer.parseInt(br.readLine());
        String votes = br.readLine();

        int cntA = 0;
        int cntB = 0;

        for (int i = 0; i < v; i++) {
            char c = votes.charAt(i);
            if (c == 'A') {
                cntA++;
            } else {
                cntB++;
            }
        }

        if (cntA > cntB) System.out.println("A");
        else if (cntB > cntA) System.out.println("B");
        else System.out.println("Tie");

    }
}
