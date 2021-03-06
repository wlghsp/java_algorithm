package codeup.two_dim_array;



/*
다음과 같은 n*n 배열 구조를 출력해보자.
입력이 3인 경우 다음과 같이 출력한다.
1 2 3
4 5 6
7 8 9

입력이 5인 경우는 다음과 같이 출력한다.
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25

입력이 n인 경우의 2차원 배열을 출력해보자.

입력
첫 번째 줄에 배열의 크기 n이 입력된다.
[입력값의 정의역]
1<= n <= 100

출력
n*n 크기의 배열을 설명과 같이 채워 출력한다.

입력 예시   
4

출력 예시
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16 

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Codeup1460 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int size = n*n;
        int[] arr = new int[size];
        int value = 1;
        for (int i = 0; i < size; i++) {
            arr[i] = value;
            value++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i % n == 0 && i != 0) {
                sb.append("\n");
            }
            sb.append(arr[i] + " ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
