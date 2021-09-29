package baekjoon.bronzeⅤ;

import java.io.*;
import java.util.StringTokenizer;

public class boj_2845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());

        int numOfAttendee = l * p ;
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i = 0; i <5; i++) {
            int gap = Integer.parseInt(st1.nextToken()) - numOfAttendee;
            bw.write(gap+" ");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
