package baekjoon.bronze.bronze1.boj2204_도비의난독증테스트;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if (s.equals("0")) break;
            int n = Integer.parseInt(s);
            String minStr = br.readLine();
            String min = minStr.toLowerCase();
            for (int i = 1; i < n; i++) {
                String candidateStr = br.readLine();
                String candidate = candidateStr.toLowerCase();
                if (min.compareTo(candidate) > 0) {
                    minStr = candidateStr;
                    min = candidate;
                }
            }
            System.out.println(minStr);
        }
    }
}
