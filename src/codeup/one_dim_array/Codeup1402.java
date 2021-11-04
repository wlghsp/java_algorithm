package codeup.one_dim_array;


/*
두 수를 거꾸로 출력하기..
세 수를 거꾸로 출력하기...
이런 문제들은 쉽게 풀 수 있었다.
이번에는 데이터의 개수가 n개가 들어오고, n개의 데이터를 거꾸로 출력하는 프로그램을 작성하시오.


입력
첫째 줄에 데이터의 개수 n이 입력된다. ( n <= 1,000 )
둘째 줄에 공백을 기준으로 n개 데이터가 입력된다.

출력
n개의 데이터를 입력의 역순으로 출력한다.

5
1 3 5 6 8

8 6 5 3 1

*/


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1402 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n]; 
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            sb.append(arr[i]).append(" ");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();


    }
}
