package baekjoon.bronze.bronzeⅢ.boj21866_추첨을통해커피를받자;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

    static int[] scores = {100, 100, 200, 200, 300, 300, 400, 400, 500};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        boolean isHacker = false;
        int total = 0;
        String result = "";
        for (int i = 0; i < 9; i++) {
            int n = Integer.parseInt(st.nextToken());
            if (n > scores[i]) {
                isHacker = true;
                result = "hacker";
                break;
            }
            total += n;
        }

        if (isHacker) System.out.println(result);
        else {
            if (total >= 100) {
                System.out.println("draw");
            } else {
                System.out.println("none");
            }
        }

    }
}
