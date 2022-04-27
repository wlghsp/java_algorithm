package inflearn.q28_연속부분수열;

import java.util.Scanner;

public class Main {

    // 슬라이딩 윈도우 기법
    private int solution(int n, int k, int[] a) {
        int answer = 0;



        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(n,k,arr));
    }
}
