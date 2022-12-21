package baekjoon.bronze.bronzeⅢ.boj15734_명장남정훈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());
        int total = L + R + A;
        if (L < R) {
            int diff = Math.min((R - L), A);
            L += diff;
            A -= diff;
        } else {
            int diff = Math.min((L - R), A);
            R += diff;
            A -= diff;
        }
        if (R == L) System.out.println(total - (A & 1)); // A & 1 짝수이면 0이고, 홀수이면 1이 된다.
        else System.out.println(total - Math.abs(R - L));
    }
}
