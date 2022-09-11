package inflearn.DFS_BFS활용.q71_순열구하기_DFS;

import java.util.Scanner;

public class Main {

    static int n, m;
    static int[] arr, ch, pm;

    public void DFS(int L) {
        if (L == m) {
            for(int x : pm) System.out.print(x + " ");
            System.out.println();
        } else {
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[L] = arr[i]; // L번째에 arr[i] 숫자를 집어 넣음
                    DFS(L+1);
                    ch[i] = 0; // 백트래킹을 위해 방문을 취소해준다.
                }
            }
        }
    }

    public static void main(String[] args) {
        Main T = new Main();

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ch = new int[n]; // 체크 배열
        pm = new int[m]; // 순열 배열

        T.DFS(0);

    }
}
