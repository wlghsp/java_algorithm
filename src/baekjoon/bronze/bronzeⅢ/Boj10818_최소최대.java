package baekjoon.bronze.bronzeⅢ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

/*
문제
N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.

출력
첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.


5
20 10 35 30 7

7 35
*/

public class Boj10818_최소최대 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Integer.parseInt(br.readLine());

        int max = -1000001;
        int min = 1000001;

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        

        // 배열과 정렬함수 사용이 없어 시간복잡도 향상
        while (st.hasMoreTokens()) {
            int val = Integer.parseInt(st.nextToken());
            if (val > max) {
                max = val;
            }
            if (val < min) {
                min = val;
            } 
        }

        bw.write(min + " " + max);
        bw.flush();
        bw.close();
        br.close();
    }
}