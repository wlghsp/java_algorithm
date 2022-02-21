package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj1100_하얀칸 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int cnt = 0;

        for (int i = 0; i < 8; i++) {
            String s = br.readLine();
            if (i % 2== 0) { // 짝수번째 행은 하얀칸이 짝수 번째 열
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (j % 2 == 0 && c == 'F') {
                        cnt++;
                    }
                }
            } else { // 홀수 행은 하얀칸이 홀수 번째 열
                for (int j = 0; j < s.length(); j++) {
                    char c = s.charAt(j);
                    if (j % 2 == 1 && c == 'F') {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
