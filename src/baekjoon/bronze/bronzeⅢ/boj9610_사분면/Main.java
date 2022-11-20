package baekjoon.bronze.bronzeⅢ.boj9610_사분면;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int q1 = 0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis = 0;


        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (x > 0 && y > 0) q1++;
            else if (x < 0 && y > 0) q2++;
            else if (x < 0 && y < 0) q3++;
            else if (x > 0 && y < 0) q4++;
            else axis++;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Q1: ").append(q1).append("\n");
        sb.append("Q2: ").append(q2).append("\n");
        sb.append("Q3: ").append(q3).append("\n");
        sb.append("Q4: ").append(q4).append("\n");
        sb.append("AXIS: ").append(axis);
        System.out.println(sb);
    }
}
