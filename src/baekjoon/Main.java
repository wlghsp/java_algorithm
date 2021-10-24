package baekjoon;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int year = 0;
        while (true) {
            year++;
            if ((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0)
                break;
        }
        bw.write(String.valueOf(year));
        bw.flush();
        bw.close();
    }
}
