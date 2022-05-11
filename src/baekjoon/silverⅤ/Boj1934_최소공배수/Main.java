package baekjoon.silverⅤ.Boj1934_최소공배수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int GCD(int a, int b){
        if (b==0) {
            return a;
        } else {
            return GCD(b, a % b);
        }
    }

    static int LCM(int a, int b) {
        return (a*b)/ GCD(a, b);
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append(LCM(a, b)).append('\n');
        }
        System.out.println(sb);

    }
}
