package inflearn.q35_K번째큰수;

import java.util.Scanner;

public class Main {

    public int solution(int N, int K, int[] arr) {
        int answer = 0;


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(N, K, arr));
    }
}
