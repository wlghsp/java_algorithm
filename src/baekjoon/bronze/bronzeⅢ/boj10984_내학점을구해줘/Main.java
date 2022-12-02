package baekjoon.bronze.bronzeⅢ.boj10984_내학점을구해줘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int totalC = 0;
            double totalG = 0d;
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                int c = Integer.parseInt(st.nextToken());
                double g = Double.parseDouble(st.nextToken());
                totalC += c;
                totalG += c * g;
            }
            sb.append(totalC).append(" ").append(String.format("%.1f", totalG / totalC)).append("\n");
        }

        System.out.println(sb);

    }
}
