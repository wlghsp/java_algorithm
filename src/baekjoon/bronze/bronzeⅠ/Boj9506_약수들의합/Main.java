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
                    nums.add(i);
                }
            }

            if (N == getSum(nums)) {
                System.out.print(N + " = ");
                for (int i = 0; i < nums.size() - 1; i++) {
                    System.out.print(nums.get(i) + " + ");
                }
                System.out.println(nums.get(nums.size()- 1));
            } else {
                System.out.printf("%d is NOT perfect.\n", N);
            }
        }

    }

    public static int getSum(List<Integer> nums) {
        int answer = 0;
        for (Integer num : nums) {
            answer += num;
        }
        return answer;
    }
}
