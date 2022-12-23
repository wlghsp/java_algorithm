package baekjoon.bronze.bronzeⅢ.boj17010_TimetoDecompress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char c = st.nextToken().charAt(0);
            String result = getString(n, c);
            System.out.println(result);
        }

    }

    private static String getString(int n, char c) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result += c;
        }
        return result;
    }
}
