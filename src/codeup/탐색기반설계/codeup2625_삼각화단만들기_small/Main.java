package codeup.탐색기반설계.codeup2625_삼각화단만들기_small;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (i <= j && j <= k && i+j > k && i+j+k == N) {
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
