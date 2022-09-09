package inflearn.DFS_BFS활용.q70_동전교환_DFS;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    static int n, m, answer = Integer.MAX_VALUE;

    public void DFS(int L, int sum, int[] coins) {
        //시간초과를 막는 중요부분, L이 answer보다 크다면 볼 필요가 없으므로 재귀 종료
        // 트리가 뻗어나갈 때 가지치기를 할 조건을 찾아서 가지를 쳐주어야 시간 초과를 막을 수 있다
        if (L >= answer) return;

        if (sum > m) return; // 찾고자 하는 값보다 합이 크다면 재귀 종료
        if (sum == m) {
            answer = Math.min(answer, L);
        } else {
            //작은금액부터 할 경우 쓸데없는 시간을 낭비하므로 큰 금액부터 탐색
            // for문을 거꾸로 돌림
            for (int i = n-1; i >= 0; i--) {
                DFS(L + 1, sum + coins[i], coins);
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        m = sc.nextInt();

        int sum = 0;
        int L = 0;
        T.DFS(0, 0, arr);
        System.out.println(answer);
    }
}
