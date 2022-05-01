package cs_senpai.boj10448;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    static int[] T;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = new int[46];
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < 46; i++) {
            T[i] = i* (i+1) / 2;
        }


        for (int i = 0; i < N; i++) {
            System.out.println(is_possible(Integer.parseInt(br.readLine())));
        }
    }

    public static int is_possible(int K) {
        for (int i = 1; i < 46; i++) {
            for (int j = i; j < 46; j++) {
                for (int k = j; k < 46; k++) {
                    if(T[i] + T[j] + T[k] == K) return 1;
                }
            }
        }
        return 0;
    }
}
