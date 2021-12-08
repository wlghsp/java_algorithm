package codeplus;

import java.io.*;
import java.util.ArrayList;

// https://bbangson.tistory.com/53
public class Boj17425_약수의합 {
    static final int MAX = 1000000;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long[] d = new long[MAX+1];
        for (int i = 1; i <= MAX; i++) {
            d[i] = 1;
        }

        for (int i = 2; i <= MAX; i++) {
            for (int j = 1; i*j <= MAX; j++) {
                d[i*j] += i;
            }
        }

        long[] s= new long[MAX+1];
        for (int i = 1; i <= MAX; i++) {
            s[i] = s[i-1]+d[i];
        }
        int t = Integer.parseInt(br.readLine());
        while (t-- >0) {
            int n = Integer.parseInt(br.readLine());
            bw.write(s[n] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();





    }
}
