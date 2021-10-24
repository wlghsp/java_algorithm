package baekjoon.silverⅤ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Boj_1476 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int e = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int E = 1, S = 1, M = 1;

        /*
         * 
         * 1년씩 증가시켜 확인하는 완전탐색으로 문제 해결.
         * 
         * 증가되던 ESM은 범위를 넘어서면 1로 변환해준다.
         * 
         * E,S,M도 연도와 같이 계속 증가시키다 ESM과 입력받은 esm이 일치한 연도를 출력한다.
         */

        for (int year = 1;; year++) {
            if (E == e && S == s && M == m) {
                bw.write(String.valueOf(year));
                bw.flush();
                bw.close();
                break;
            }

            E += 1;
            S += 1;
            M += 1;

            if (E == 16) {
                E = 1;
            }

            if (S == 29) {
                S = 1;
            }

            if (m == 20) {
                m = 1;
            }

        }

        // 다른 풀이
        // while (true) {
        // year++;
        // if ((year - e) % 15 == 0 && (year - s) % 28 == 0 && (year - m) % 19 == 0)
        // break;
        // }

    }
}
