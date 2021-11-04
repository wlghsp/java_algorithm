package codeup.simple_loop;

/*
수의 개수 n이 주어지고, 그 다음 줄에 무작위로 n개의 자연수가 입력된다.
그 n개의 수 중에서 짝수의 개수를 출력하시오.

입력
n은 자연수, 그 다음 줄에 n개의 자연수들이 입력으로 들어온다.

출력
n개의 자연수들 중 짝수의 개수를 출력한다.

입력 예시   
5
3 5 7 15 2

출력 예시
1

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
public class Codeup1268 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        // StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int temp = Integer.parseInt(st.nextToken());
            if (temp % 2 == 0) {
                count += 1;
            }
        }
        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
