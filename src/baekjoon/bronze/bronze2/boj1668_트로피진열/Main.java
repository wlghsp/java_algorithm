package baekjoon.bronze.bronze2.boj1668_트로피진열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int leftCnt = 1;
        int maxHeight = arr[0];
        for (int i = 1; i < N; i++) {
            if (maxHeight < arr[i]) {
                leftCnt++;
                maxHeight = arr[i];
            }
        }

        System.out.println(leftCnt);

        int rightCnt = 1;
        maxHeight = arr[N - 1];
        for (int i = N - 2; i >= 0; i--) {
            if (maxHeight < arr[i]) {
                rightCnt++;
                maxHeight = arr[i];
            }
        }

        System.out.print(rightCnt);
    }
}
