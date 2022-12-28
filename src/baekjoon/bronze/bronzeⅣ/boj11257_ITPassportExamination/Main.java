package baekjoon.bronze.bronzeⅣ.boj11257_ITPassportExamination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String candidateNum = st.nextToken();
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());
            boolean pass = true;
            double total = a + b + c;
            if (a / 35 < 0.3 || b / 25 < 0.3 || c / 40 < 0.3 || total < 55) pass = false;
            sb.append(candidateNum).append(" ").append(String.format("%.0f", total)).append(" ").append(pass ? "PASS": "FAIL").append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
