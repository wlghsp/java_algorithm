package codeup.one_dim_array;



/*
우리는 1부터 N까지의 숫자가 차례대로 적힌 N장의 카드 묶음을 가지고 있다.
그런 데 이 카드 묶음을 옮기는 중 실수로 땅에 떨어뜨려 그 중 한 장을 잃어버렸다.
여러 분은 땅에 떨어진 카드 묶음을 읽어서 빠진 하나의 카드 번호를 찾아 출력해야 한다.

입력
첫 줄에는 한 장을 잃어버리기 전 카드의 전체 장수 N이 주어져 있다. 단 . 3 <= N <= 50 이다.
이어지는 N-1개의 각 줄에는 한 장이 빠진 카드 묶음의 카드 숫자가 하나씩 순서 없이 나열되어 있다.

출력
여러분은 주 어진 카드 묶음에서 빠진 하나의 카드를 찾아서 그 번호를 출력해야 한다.

입력 예시   
10
3
4
1
10
2
6
7
5
9

출력 예시
8

*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

public class Codeup1411 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[n+1]; // boolean 배열은 false로 초기화된다. 
        for (int i = 1; i <= n-1; i++) { 
            int idx = Integer.parseInt(br.readLine());
            arr[idx] = true;
        }

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == false) {
                bw.write(i + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
