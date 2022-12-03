package baekjoon.bronze.bronzeⅢ.boj10886_0NotCute1Cute;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int notCute = 0;
        int cute = 0;
        for (int i = 0; i < N; i++) {
            int opinion = Integer.parseInt(br.readLine());
            if (opinion == 0) notCute++;
            else cute++;
        }
        if (notCute > cute) System.out.println("Junhee is not cute!");
        else System.out.println("Junhee is cute!");
    }
}
