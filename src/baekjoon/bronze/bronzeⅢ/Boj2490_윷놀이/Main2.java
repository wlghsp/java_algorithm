package baekjoon.bronze.bronzeⅢ.Boj2490_윷놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int bae = 0;
            int deung = 0;
            while (st.hasMoreTokens()) {
                int tmp = Integer.parseInt(st.nextToken());
                if (tmp == 0) bae++;
                else deung ++;
            }
            if (bae == 1 && deung == 3) System.out.println("A");
            else if (bae == 2 && deung == 2) System.out.println("B");
            else if (bae == 3 && deung == 1) System.out.println("C");
            else if (bae == 4) System.out.println("D");
            else if (deung == 4) System.out.println("E");
        }

    }
}
