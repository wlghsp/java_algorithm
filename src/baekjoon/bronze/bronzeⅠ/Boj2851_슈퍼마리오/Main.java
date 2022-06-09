package baekjoon.bronze.bronzeⅠ.Boj2851_슈퍼마리오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int sum = 0, lt = 0;
        int answer = 0;
        for (int rt = 0; rt < arr.length; rt++) {
            sum += arr[rt];
            if (answer >= distance(sum)) Math.max(answer, sum);
        }

        System.out.println(answer);


    }

    public static int distance(int n) {
        return Math.abs(100 - n);
    }
}
