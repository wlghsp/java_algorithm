package doitcodingtestjava;

import java.util.Scanner;

public class P1546_평균구하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int[] nums = new int[N];
        for (int i = 0; i < N; i++) {
            nums[i] = sc.nextInt();
            if (nums[i] > max) max = nums[i];
            sum += nums[i];
        }
        double avg = sum * 100 / max / N;
        System.out.println(avg);
    }
}
