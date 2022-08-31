package inflearn.DFS_BFS활용.q69_중복순열_DFS;

import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] pm;
    static StringBuilder sb = new StringBuilder();

    public void DFS(int L) {
        if (L == m) {
            for (int x : pm) {
                sb.append(x).append(" ");
            }
            sb.append("\n");
        } else {
            // 1~n까지의 수를 pm에 넣어가면서 출력한다.
            // n가닥으로 뻗어나간다고 생각하자.
            for (int i = 1; i <= n; i++) {
                pm[L] = i;
                DFS(L + 1);
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        n = sc.nextInt(); // 1~n까지 번호가 있음
        m = sc.nextInt(); // m번을 뽑아 일렬로 나열
        int[] arr = new int[n];
        pm = new int[m];

        T.DFS(0);
        System.out.println(sb);
    }
}
