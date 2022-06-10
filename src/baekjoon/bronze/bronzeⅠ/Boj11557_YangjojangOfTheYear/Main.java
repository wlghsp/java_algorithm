package baekjoon.bronze.bronzeⅠ.Boj11557_YangjojangOfTheYear;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int t = 0; t < T; t++) {
            int N = Integer.parseInt(br.readLine());
            String maxUniv = "";
            int maxVal = Integer.MIN_VALUE;
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                String name = st.nextToken();
                int amount = Integer.parseInt(st.nextToken());
                if (maxVal < amount) {
                    maxUniv = name;
                    maxVal = amount;
                }
            }
            System.out.println(maxUniv);
        }
    }
}
