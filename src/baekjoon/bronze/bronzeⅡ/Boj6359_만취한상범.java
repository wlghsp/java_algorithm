package baekjoon.bronze.bronzeⅡ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Boj6359_만취한상범 {

    static int room[] = new int[120];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            Arrays.fill(room, 0);
            for (int k = 1; k <= n; k++) {
                for (int j = 1; k*j <= n; j++) {
                    if (room[k*j] == 0) {
                        room[k*j]++;
                    } else {
                        room[k*j]--;
                    }
                }
            }
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                if (room[j] == 1) cnt++;
            }
            System.out.println(cnt);
        }


    }
}
