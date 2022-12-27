package baekjoon.bronze.bronzeⅢ.boj10205_헤라클레스와히드라;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= K; i++) {
            int h = Integer.parseInt(br.readLine());
            String acts = br.readLine();
            for (int j = 0; j < acts.length(); j++) {
                if (h == 0) break;
                char c = acts.charAt(j);
                if (c == 'c') {
                    h++;
                } else if (c == 'b') {
                    h--;
                }
            }
            sb.append("Data Set ").append(i).append(":\n").append(h).append("\n");
            if (i != K) sb.append("\n");
        }
        System.out.print(sb);
    }
}
