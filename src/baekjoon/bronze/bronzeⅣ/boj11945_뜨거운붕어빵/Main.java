package baekjoon.bronze.bronzeⅣ.boj11945_뜨거운붕어빵;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            StringBuilder tmp = new StringBuilder();
            for (int j = 0; j < M; j++) tmp.append(s.charAt(j));
            tmp.reverse();
            sb.append(tmp).append("\n");
        }
        System.out.println(sb);
    }
}
