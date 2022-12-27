package baekjoon.bronze.bronzeⅣ.boj25756_방어율무시계산하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        double V = 0;
        for (int i = 0; i < N; i++) {
            int A = Integer.parseInt(st.nextToken());
            V = A + V - V * A / 100;
            System.out.println(V);
        }
    }
}
