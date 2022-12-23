package baekjoon.bronze.bronzeⅢ.boj16470_컵라면측정하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double K = Double.parseDouble(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double d1 = Double.parseDouble(st.nextToken());
        double d2 = Double.parseDouble(st.nextToken());
        if (d1 == d2) System.out.println(K * K);
        else {
            double another = (Math.max(d1, d2) - Math.min(d1, d2)) / 2; // 등변 사다리꼴
            System.out.printf(formatD(K * K - another * another));
        }
    }
    public static String formatD(double number) {
        DecimalFormat df = new DecimalFormat("#.##");
        return df.format(number);
    }
}
