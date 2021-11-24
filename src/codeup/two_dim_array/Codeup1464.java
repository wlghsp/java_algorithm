package codeup.two_dim_array;

/*
다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
12 11 10 9
8 7 6 5
4 3 2 1

입력이 4 5인 경우는 다음과 같이 출력한다.
20 19 18 17 16
15 14 13 12 11
10 9 8 7 6
5 4 3 2 1

입력이 n m인 경우의 2차원 배열을 출력해보자.

입력
첫 번째 줄에 배열의 크기 n m이 입력된다.
[입력값의 정의역]
1<= n, m<= 100

출력
n*m 크기의 배열을 설명과 같이 채워 출력한다.

입력 예시
2 3

출력 예시
6 5 4
3 2 1


*/

import java.io.*;
import java.util.StringTokenizer;

public class Codeup1464 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 숫자 n 받기
        int m = Integer.parseInt(st.nextToken()); // 숫자 m 받기

        int[][] arr = new int[101][101]; // 입력값이 1~100까지 이므로 101

        /*
         n은 1씩 감소
         오른쪽으로 -1씩 감소
         */
        int n1 = n;
        int k = 0;
        for (int i = 1; i <= n; i++) {
            k = (n1--) * m;
            for (int j = 1; j <= m; j++) {
                arr[i][j] = k;
                k -= 1;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                sb.append(arr[i][j] + " ");
            }
            sb.append("\n");
        }


        bw.write(sb.toString());


        bw.flush();
        bw.close();
        br.close();
    }
}
