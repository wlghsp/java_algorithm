package baekjoon.bronze.bronzeⅢ.Boj2490_윷놀이;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            st = new StringTokenizer(br.readLine());
            int ones = 0;
            int zeros = 0;
            for (int j = 0; j < 4; j++) {
                int n = Integer.parseInt(st.nextToken());
                if (n == 1) ones++;
                if (n == 0) zeros++;
            }
            String result = getAlphabet(ones, zeros);
            System.out.println(result);
        }

    }

    private static String getAlphabet(int ones, int zeros) {
        String result = "";
        if (ones == 3 && zeros == 1) result = "A";
        else if (ones == 2 && zeros == 2) result = "B";
        else if (ones == 1 && zeros == 3) result = "C";
        else if (ones == 0 && zeros == 4) result = "D";
        else if (ones == 4 && zeros == 0) result = "E";
        return result;
    }
}
