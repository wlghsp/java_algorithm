package baekjoon.bronze.bronzeⅢ.boj17614_369;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            if (s.contains("3") || s.contains("6") || s.contains("9")) {
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (c == '3' || c == '6' || c == '9') cnt++;
                }
            }
        }

        System.out.println(cnt);
    }
}
