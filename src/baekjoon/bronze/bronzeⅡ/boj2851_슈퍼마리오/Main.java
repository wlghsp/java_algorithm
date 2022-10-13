package baekjoon.bronze.bronzeⅡ.boj2851_슈퍼마리오;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            sum += arr[i];
            if (sum == 100) {
                flag = true;
                System.out.println(100);
                break;
            } else if (sum > 100) {
                flag = true;
                int before = sum - arr[i];
                if ((sum-100) == (100 - before)){
                    System.out.println(sum);
                    break;
                } else if ((sum - 100) > (100 -before)) {
                    System.out.println(before);
                    break;
                } else if ((sum - 100) < (100 -before)) {
                    System.out.println(sum);
                    break;
                }
            }
        }

        if (!flag) System.out.println(sum);
    }
}
