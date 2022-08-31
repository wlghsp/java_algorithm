package inflearn.DFS_BFS활용.q67_바둑이승차_DFS;

import java.util.Scanner;

public class Main {
    // 부분집합 문제
    // 트럭에 태운다 태우지 않는다. 무게를 포함한다. 포함하지 않는다.
    static int c, n, answer = Integer.MIN_VALUE;

    public void DFS(int L, int sum, int[] arr) {
        if (sum > c) return; // sum이 c보다 크면 종료
        if (L == n) {
            answer = Math.max(answer, sum);
        } else {
            DFS(L + 1, sum + arr[L], arr); // 태운다. 부분집합에 포함한다.
            DFS(L + 1, sum, arr); // 태우지 않는다. 부분집합에 포함시키지 않는다.
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        c = sc.nextInt();
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
