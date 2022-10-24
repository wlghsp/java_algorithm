package baekjoon.bronze.bronzeⅠ.boj4796_캠핑;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int i = 1;
        while (true){
            st = new StringTokenizer(br.readLine());
            int L = Integer.parseInt(st.nextToken());  // L일동안만 사용
            int P = Integer.parseInt(st.nextToken());  // 연속하는 P일
            int V = Integer.parseInt(st.nextToken());  // V일짜리 휴가
            if (L == 0 && P == 0 && V == 0) break;
            int answer = 0;
            answer += V / P * L + Math.min(V % P, L);
            System.out.printf("Case %d: %d\n", i++, answer);
        }
    }
}
