package baekjoon.bronze.bronzeⅠ.Boj2750_수_정렬하기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        // 버블 정렬로 풀이하기
        // 데이터의 인접 요소끼리 비교하고, swap 연산을 수행하며 정렬하는 방식
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - 1 - i; j++) { // i가 커질 수록 뒤에 있는 숫자들은 오름차순 정렬됨
                if (arr[j] > arr[j+1]) {
                    int tmp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

    }
}
