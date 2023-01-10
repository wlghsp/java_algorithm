package inflearn.dynamic_programming.계단오르기;

import java.util.Scanner;

public class Main {
    static int[] dy;
    private int solution(int n) {
        dy = new int[n+1];
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        return dy[n];
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(T.solution(n));
    }
}
