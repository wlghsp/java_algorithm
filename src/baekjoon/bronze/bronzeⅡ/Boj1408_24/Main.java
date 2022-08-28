package baekjoon.bronze.bronzeⅡ.Boj1408_24;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");
        int h1 = Integer.parseInt(st.nextToken());
        int m1 = Integer.parseInt(st.nextToken());
        int s1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), ":");
        int h2 = Integer.parseInt(st.nextToken());
        int m2 = Integer.parseInt(st.nextToken());
        int s2 = Integer.parseInt(st.nextToken());

        int t = 3600 * h2 + 60 * m2 + s2 - (3600 * h1 + 60 * m1 + s1);

        if (t < 0){
            t += 60 * 60 * 24;
        }

        System.out.printf("%02d:%02d:%02d", t / 3600, t % 3600 / 60, t % 3600 % 60);
    }
}
