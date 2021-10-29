package baekjoon.bronze.bronzeⅠ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.

5
5
2
3
4
1

1
2
3
4
5

*/

public class Boj2750_수_정렬하기 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int arr[] = new int[N];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        // Arrays.sort(arr);

        // Bubble sort
		// for(int i = 0; i < N - 1; i++) {
		// 	for(int j = i + 1; j < N; j++) {
		// 		if(arr[i] > arr[j]) {
		// 			int temp = arr[j];
		// 			arr[j] = arr[i];
		// 			arr[i] = temp;
		// 		}
		// 	}
		// }    

        



        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
