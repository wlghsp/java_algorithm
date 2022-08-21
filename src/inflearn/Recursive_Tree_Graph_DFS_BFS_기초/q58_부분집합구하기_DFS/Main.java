package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q58_부분집합구하기_DFS;

public class Main {
    static int n; // 집합의 원소의 갯수
    static int[] ch; // 체크 배열

    public void DFS(int L) {
        if (L == n + 1) {
            StringBuilder tmp = new StringBuilder();
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 1) tmp.append(i).append(" ");
            }
            if (tmp.length() > 0) System.out.println(tmp);
        } else {
            ch[L] = 1;
            DFS(L+1); // 왼쪽
            ch[L] = 0;
            DFS(L+1); // 오른쪽
        }
    }

    public static void main(String[] args) {
        Main T = new Main();
        n = 3;
        ch = new int[n + 1];
        T.DFS(1);
    }
}
