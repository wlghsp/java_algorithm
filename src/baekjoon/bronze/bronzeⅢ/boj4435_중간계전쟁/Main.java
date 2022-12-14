package baekjoon.bronze.bronzeⅢ.boj4435_중간계전쟁;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int[] gandalfs = new int[]{1, 2, 3, 3, 4, 10};
    static int[] saurons = new int[]{1, 2, 2, 2, 3, 5, 10};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 1; i <= T; i++) {
            int gandalf = 0;
            int sauron = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 6; j++) {
                int n = Integer.parseInt(st.nextToken());
                gandalf += n * gandalfs[j];
            }
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 7; j++) {
                sauron += Integer.parseInt(st.nextToken()) * saurons[j];
            }

            if (gandalf > sauron) {
                System.out.printf("Battle %d: Good triumphs over Evil\n", i);
            } else if (sauron > gandalf) {
                System.out.printf("Battle %d: Evil eradicates all trace of Good\n", i);
            } else {
                System.out.printf("Battle %d: No victor on this battle field\n", i);
            }
        }
    }
}
