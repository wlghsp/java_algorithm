package inflearn.q42_응급실;

import java.util.Scanner;

public class Main {


    public int solution(int[] arr, int M){
        int answer = 0;


        return answer;
    }


    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(T.solution(arr, M));

    }
}
