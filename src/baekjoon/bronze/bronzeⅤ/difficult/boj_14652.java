package baekjoon.bronze.bronzeⅤ.difficult;

import java.io.*;
import java.util.StringTokenizer;

public class boj_14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int result1 = (int) Math.ceil(k/m);
        int result2 = k%m;
        bw.write(result1 + " " +  result2 + "\n");
        bw.flush();
        br.close();
        bw.close();
    }
}
