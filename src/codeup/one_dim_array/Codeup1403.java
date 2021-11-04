package codeup.one_dim_array;


/*
k개의 숫자를 입력받고 그 숫자들을 두번 출력하시오.

입력 예) 
2
5 7
출력 예)
5
7
5
7

입력
첫 줄에 k가 입력된다.(k<=100)
둘째 줄에 k개의 정수들이 공백으로 구분되어 입력된다.

출력
k개의 숫자를 입력받은 순서대로 한 줄에 하나씩 출력한다. 그리고 한번 출력이 다 되면 다시 한번더 출력한다.(총 2번)

3
1 2 3

1
2
3
1
2
3

*/

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Codeup1403 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int k = Integer.parseInt(br.readLine());
        int[] arr = new int[k];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < arr.length; j++) {
                sb.append(arr[j]).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
