package inflearn.q27_최대매출;

import java.util.Scanner;

public class Main {

    // 슬라이딩 윈도우 기법
    //
    private int solution(int n, int k, int[] a) {
        int answer = 0; // 합의 최댓값

        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += a[i];
        }

        answer = sum;

        for (int i = k; i < a.length; i++) {
            sum += (a[i] - a[i - k]); // window가 1씩 이동하여 부분합을 계속 구해줌
            answer = Math.max(answer, sum);
        }

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
