package inflearn.q28_연속부분수열;

import java.util.Scanner;

public class Main2 {

    private int solution(int n, int k, int[] arr) {
        int answer = 0;
        int lt = 0, rt = 0;


        return answer;
    }

    public static void main(String[] args) {
        Main2 T = new Main2();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,m,arr));
    }
}
