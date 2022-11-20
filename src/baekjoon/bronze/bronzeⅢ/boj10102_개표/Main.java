package baekjoon.bronze.bronzeⅢ.boj10102_개표;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int V = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int cntA = 0;
        int cntB = 0;
        for (int i = 0; i < V; i++) {
            char c = s.charAt(i);
            if (c == 'A') cntA++;
            else cntB++;
        }
        StringBuilder sb = new StringBuilder();
        if (cntA > cntB) sb.append("A");
        else if (cntA < cntB) sb.append("B");
        else sb.append("Tie");
        System.out.println(sb);

    }
}
