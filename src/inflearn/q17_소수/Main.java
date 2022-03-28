package inflearn.q17_소수;

import java.util.Scanner;

public class Main {
    private int solution(int n) {
        // 배열의 인덱스에 맞게 값으로 넣어준다.
        int[] a = new int[n+1];
        for (int i = 2; i <= n ; i++) {
            a[i] = i;
        }
        // 이미 지워진 숫자가 아니라면, 그 배수부터 출발하여, 가능한 모든 숫자 지우기
        // 2이라면 4부터, 3이라면 6부터 시작하고
        for (int i = 2; i <= n; i++) {
            if (a[i] == 0) continue; // 이미 지워졌다면 다음 반복으로
            for (int j = 2*i; j <=n ; j+=i) {
                a[j] = 0; // 배수 지우기
            }
        }
        int count = 0;
        for (int i = 2; i <=n ; i++) {
            if (a[i] != 0) count++; // 지워지지 않았다면 소수이다.
        }
        return count;
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
