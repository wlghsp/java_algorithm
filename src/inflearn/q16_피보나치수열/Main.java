package inflearn.q16_피보나치수열;

import java.util.Scanner;

public class Main {
    private int[] solution(int n) {
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int x : T.solution(n)) System.out.print(x + " ");
    }
}
