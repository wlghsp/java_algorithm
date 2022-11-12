package baekjoon.bronze.bronzeⅠ.Boj9093_단어뒤집기;

import java.io.*;

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (T-- > 0) {
            String[] str = br.readLine().split(" ");
            for (int i = 0; i < str.length; i++) {
                str[i] = new StringBuilder(str[i]).reverse().toString();
            }
            sb.append(String.join(" ", str)).append("\n");
        }
        System.out.println(sb);
    }
}
