package baekjoon.bronze.bronzeⅢ.boj2765_자전거속도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int i = 1;
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            double diameter = Double.parseDouble(st.nextToken());
            double spinCnt = Double.parseDouble(st.nextToken());
            double seconds = Double.parseDouble(st.nextToken());
            if (spinCnt == 0) break;
            double circumference = diameter * 3.1415927; // 원의 둘레 (지름 * 3.14)
            sb.append("Trip #").append(i++).append(": ").append(String.format("%.2f", circumference * spinCnt / 12 / 5280)).append(" ").append(String.format("%.2f", (circumference * spinCnt / 12 / 5280) / (seconds / 60 / 60))).append("\n");
        }
        sb.setLength(sb.length() - 1);
        System.out.println(sb);
    }
}
