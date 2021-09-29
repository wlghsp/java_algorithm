package baekjoon.bronzeⅤ;

import java.io.*;

public class boj_5522 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int total = 0;
        for (int i = 0; i < 5; i++) {
            total += Integer.parseInt(br.readLine());
        }
        bw.write(total + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
