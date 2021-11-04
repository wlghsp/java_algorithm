package codeup.simple_loop;

/*
어떤 수 a, b가 주어진다.

a와 b의 관계는 a <= b 이다.

a에서 b까지의 수 중 3의 배수만 더하여 출력하시오.

입력
입력으로 두 자연수 a,  b가 주어진다. (a<= b)

출력
a~b까지의 수 중 3의 배수의 합을 출력한다.

입력 예시   
3 7

출력 예시
9

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1260 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        // int n = Integer.parseInt(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0) {
                sum += i;
            }
        }
        bw.write(sb.append(sum).toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
