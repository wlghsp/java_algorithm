package baekjoon.bronze5.difficult;

import java.io.*;

public class boj_15727 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int cand = n % 5;
        int result = n /5  + (cand == 0? 0:1);
        bw.write(result+  "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
