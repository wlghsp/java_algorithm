package baekjoon.silver.silver4.boj18110_solved_ac;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int N;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver4/boj18110_solved_ac/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        // 1. 절사 기준 구하기
        int cutoffValue = (int) Math.round(N * 0.15);

        // 2. 오름차순 정렬
        Arrays.sort(arr);

        // 3. 제외한 값들 새로운 배열로 담음
        int[] newArr = new int[N - (cutoffValue * 2)];
        System.arraycopy(arr, cutoffValue, newArr, 0, N - (cutoffValue * 2));

        // 4. 평균 구하기
        double average = Arrays.stream(newArr)
                .average()
                .orElse(0);

        // 5. 소수점 첫째자리 반올림
        System.out.println(Math.round(average));
    }
}
