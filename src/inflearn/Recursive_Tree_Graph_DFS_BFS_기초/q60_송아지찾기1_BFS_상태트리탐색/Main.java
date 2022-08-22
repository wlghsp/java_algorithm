package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q60_송아지찾기1_BFS_상태트리탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    int answer = 0;
    int[] dis = {1, -1, 5}; // 이동 종류
    int[] ch; // 방문 체크
    Queue<Integer> Q = new LinkedList<>();
    public int BFS(int S, int E) {
        ch = new int[10001];
        ch[S] = 1;
        Q.offer(S);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                int x = Q.poll();
                for (int j = 0; j < 3; j++) {
                    int nx = x + dis[j];
                    if (nx == E) return L + 1;
                    if (nx >= 1 && nx <= 10000 && ch[nx] == 0) {
                        ch[nx] = 1;
                        Q.offer(nx);
                    }
                }
            }
            L++;
        }
        return answer;
    }

    public static void main(String[] args) throws IOException {
        Main T = new Main();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int S = Integer.parseInt(st.nextToken()); // 현수의 위치
        int E = Integer.parseInt(st.nextToken()); // 송아지의 위치
        System.out.println(T.BFS(S, E));
    }
}
