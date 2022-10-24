package baekjoon.bronze.bronzeⅡ.boj22864_피로도;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int work = 0;
        int pirodo = 0;
        for (int i = 0; i < 24; i++) {
            if ((pirodo + A) > M) {
                pirodo = Math.max(pirodo - C, 0);
            } else {
                work += B;
                pirodo += A;
            }
        }
        System.out.println(work);
    }
}
