package baekjoon.bronze.bronzeⅡ.Boj2711_오타맨고창영;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = Integer.parseInt(st.nextToken());
            char[] str = st.nextToken().toCharArray();
            sb = new StringBuilder();

            for (int j = 0; j < str.length; j++) {
                if (j != idx-1) {
                    sb.append(str[j]);
                }
            }
            System.out.println(sb);
        }
    }
}
