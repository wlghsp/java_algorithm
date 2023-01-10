package inflearn.dynamic_programming.돌다리건너기;

import java.util.Scanner;

public class Main {

    static int[] dy;

    private int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;
        for (int i = 3; i <= n + 1; i++) {
            dy[i] = dy[i - 2] + dy[i - 1];
        }
        // 돌다리를 건너서 건너편으로 가는 방법의 갯수를 구해야하므로
        // 돌다리 갯수 + 1 지점의 갯수를 반환
        return dy[n + 1];
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        dy = new int[n + 2];
        System.out.println(T.solution(n));
    }
}
