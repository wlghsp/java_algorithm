package codeup.simple_loop;

/*
수의 개수 n이 주어지고, 그 다음 줄에 무작위로 n개의 자연수가 입력된다.
그 n개의 수 중에서 5의 배수만 골라 합을 출력하시오.

 
입력
첫째 줄에 정수 n이 입력된다.(1<=n<=1,000)
둘째 줄에 n개의 자연수들이 공백으로 분리되어 입력된다. 각 정수는 1~1,000 사이이다.

출력
n개의 자연수들 중 5의 배수의 합을 출력한다.

입력 예시   
5
3 5 7 15 2

출력 예시
20

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp % 5 == 0) {
                sum += temp;
            }
        }
        bw.write(sum + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
