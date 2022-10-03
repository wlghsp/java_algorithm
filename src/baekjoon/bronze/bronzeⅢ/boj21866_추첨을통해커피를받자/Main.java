package baekjoon.bronze.bronzeⅢ.boj21866_추첨을통해커피를받자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] scores = {100, 100, 200, 200, 300, 300, 400, 400, 500};
        StringTokenizer st = new StringTokenizer(br.readLine());
        int sum = 0;
        boolean hacker = false;
        for (int i = 0; i < 9; i++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp > scores[i]) {
                hacker = true;
                break;
            }
            sum += tmp;
        }

        if (hacker) System.out.println("hacker");
        else{
            if (sum >= 100) System.out.println("draw");
            else System.out.println("none");
        }
    }
}
