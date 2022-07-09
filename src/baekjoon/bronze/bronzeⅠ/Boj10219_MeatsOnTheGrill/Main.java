package baekjoon.bronze.bronzeⅠ.Boj10219_MeatsOnTheGrill;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = n;
        char[][] meat;

        while (cnt != 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            meat = new char[H][W];
            for (int i = 0; i < H; i++) {
                String temp = br.readLine();
                meat[i] = temp.toCharArray();
            }
            for (int j = H - 1; j >= 0; j--) {
                System.out.println(meat[j]);
            }

            cnt--;
        }

    }

}

