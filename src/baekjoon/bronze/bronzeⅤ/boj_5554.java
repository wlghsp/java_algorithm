package baekjoon.bronze.bronzeⅤ;

import java.io.*;

public class boj_5554 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int total = a + b + c + d;
        int x = total/60;
        int y = total%60;
        bw.write(x + "\n");
        bw.write(y + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
