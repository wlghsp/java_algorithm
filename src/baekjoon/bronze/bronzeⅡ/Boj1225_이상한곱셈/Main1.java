package baekjoon.bronze.bronzeⅡ.Boj1225_이상한곱셈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        long result = 0;
        for (int i = 0; i < a.length(); i++) {
            int c1 = a.charAt(i) - '0';
            for (int j = 0; j < b.length(); j++) {
                int c2 = b.charAt(j) - '0';
                result += c1 * c2;
            }
        }
        System.out.println(result);
    }
}
