package codeup.simple_loop;

/*
1부터 n까지의 수 중 짝수의 합을 구하시오.

입력
자연수 n이 입력으로 주어진다.

출력
1부터 n까지의 짝수의 합을 출력하시오.

입력 예시   
5

출력 예시
6

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1259 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        // StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        bw.write(sb.append(sum).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
