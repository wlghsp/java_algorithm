package baekjoon.bronze.bronzeⅢ.boj22938_백발백준하는명사수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double x1 = Double.parseDouble(st.nextToken());
        double y1 = Double.parseDouble(st.nextToken());
        double r1 = Double.parseDouble(st.nextToken());
        st = new StringTokenizer(br.readLine());
        double x2 = Double.parseDouble(st.nextToken());
        double y2 = Double.parseDouble(st.nextToken());
        double r2 = Double.parseDouble(st.nextToken());
        double distance = Math.sqrt(Math.pow(x1-x2, 2) + Math.pow(y1-y2, 2));
        if ((r1 + r2) > distance) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
