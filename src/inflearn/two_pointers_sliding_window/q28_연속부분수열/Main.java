package inflearn.two_pointers_sliding_window.q28_연속부분수열;

import java.util.Scanner;

public class Main {


    private int solution(int n, int k, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum > k) break;
                else if (sum == k) {
                    answer++;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Main T = new Main();
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
