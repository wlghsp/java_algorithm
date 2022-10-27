package baekjoon.bronze.bronzeⅢ.boj11034_캥거루세마리2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        String tmp = "";
        while((tmp = br.readLine()) != null) {
            st = new StringTokenizer(tmp);
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());
            int b_a = B - A;
            int c_b = C - B;
            if (b_a > c_b) {
                System.out.println(b_a - 1);
            } else {
                System.out.println(c_b - 1);
            }

        }
    }
}
