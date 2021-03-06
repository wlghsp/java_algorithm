package codeup.one_dim_array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
n개의 숫자가 입력되면, 다음과 같이 크기를 비교한 후 양식에 맞춰 출력하시오.
예를 들어, 1 2 3 2 1 이라는 숫자가 입력되면,
첫 번째 1과 나머지 2, 3, 2, 1을 비교하면 1 < 2,  1 < 3, 1 < 2, 1 = 1 이므로 < < < = 를 출력한다.
두 번째 2와 나머지 1, 3, 2, 1을 비교하면 2 > 1, 2 < 3, 2 = 2, 2 > 1 이므로 > < = > 를 출력한다.
세 번째 3과 나머지 1, 2, 2, 1을 비교하면 3 > 1, 3 > 2, 3 > 2, 3 > 1 이므로 > > > > 를 출력한다.
같은 방법으로 네 번째는 > = < >, 다섯번째는 = < < < 를 출력한다.
이와 같은 방식의 대소 비교 결과를 출력하시오. 

입력
첫째 줄에 숫자의 개수 n이 입력된다. ( 2 <= n <= 1000)
다음 줄에 n개의 숫자 k가 공백으로 입력된다.( k는 int범위)

출력
샘플 출력 양식에 맞추어 비교 결과를 출력한다.

입력 예시   
5
1 2 3 2 1 

출력 예시
1: < < < = 
2: > < = > 
3: > > > > 
4: > = < > 
5: = < < < 


*/

public class Codeup1440_비교 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {

        }
    }
}
