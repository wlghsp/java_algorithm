package inflearn.DFS_BFS활용.q72_조합수_DFS_메모이제이션;

import java.util.Scanner;

public class Main {

    //인스턴스 메소드만 접근이라면 static이 불필요. main(static)함수에서 접근한다면 static 달아야 함
    // n,r 33까지로 35로 넉넉히 준 것임
    int[][] dy = new int[35][35];

    public int DFS(int n, int r) {
        if (dy[n][r] != 0) return dy[n][r];
        if (n == r || r == 0)  return 1;
        else return dy[n][r] = DFS(n-1, r -1) + DFS(n-1, r);
    }

    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();
        System.out.println(T.DFS(n,r));
    }
}
