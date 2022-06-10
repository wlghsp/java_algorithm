package baekjoon.bronze.bronzeⅠ.Boj9506_약수들의합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            List<Integer> nums = new ArrayList<>();
            int N = Integer.parseInt(br.readLine());
            if (N == -1) break;
            for (int i = 1; i < N/2 + 1; i++) {
                if (N % i == 0){

                }
            }
        }

    }

//    public int getSum(List<Integer> nums) {
//        int answer = 0;
//    }
}
