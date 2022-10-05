package baekjoon.bronze.bronzeⅢ.boj12756_고급여관;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a_attack = Integer.parseInt(st.nextToken());
        int a_vital = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int b_attack = Integer.parseInt(st.nextToken());
        int b_vital = Integer.parseInt(st.nextToken());

        while (a_vital > 0 && b_vital > 0) {
            a_vital -= b_attack;
            b_vital -= a_attack;
        }


        if (a_vital <= 0 && b_vital <= 0) {
            System.out.println("DRAW");
        } else {
            if (a_vital > 0) System.out.println("PLAYER A");
            else System.out.println("PLAYER B");
        }

    }
}
