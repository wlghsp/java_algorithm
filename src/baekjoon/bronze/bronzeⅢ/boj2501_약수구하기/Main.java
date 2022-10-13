package baekjoon.bronze.bronzeⅢ.boj2501_약수구하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int cnt = 0;
        int i = 1;
        boolean flag = false;
        for (; i <= N; i++) {
            if (N % i == 0) cnt++;
            if (cnt == K) {
                flag = true;
                break;
            }
        }
        System.out.println(flag ? i : 0);
    }
}
