package baekjoon.bronze.bronzeⅢ.boj14909_양수개수세기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        while (st.hasMoreTokens()) {
            int n = Integer.parseInt(st.nextToken());
            if (n > 0) cnt++;
        }
        System.out.println(cnt);
    }
}
