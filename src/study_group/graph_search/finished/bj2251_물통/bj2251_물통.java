package study_group.graph_search.finished.bj2251_물통;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 물통의 현재 상태와 물을 붓는 행위를 관리하는 구조체
class State {
    int[] X;
    State(int[] _X) {
        X = new int[3];
        for (int i = 0; i < 3; i++) X[i] = _X[i];
    }
    State move(int from, int to, int[] Limit) {
        // from 물통에서 to 물통으로 물을 옮긴다.
        int[] nX = new int[]{X[0], X[1], X[2]};
        if (X[from] + X[to] >= Limit[to]) { //from에서 to로 부을 때 to의 용량을 넘어 선다면
            nX[from] -= Limit[to] - X[to];
            nX[to] = Limit[to];
        } else { // from 이 바닥난 경우
            nX[to] += nX[from];
            nX[from] = 0;
        }
        return new State(nX);
    }
}

public class bj2251_물통 {

    static int[] Limit; // A,B,C 물통의 용량
    static boolean[] possible; // 정답의 가능한 값들
    static boolean[][][] visit;

    static void bfs(int x1, int x2, int x3) {
        Queue<State> queue = new LinkedList<>();
        // bfs의 가장 첫 번재 할 일은 방문 체크
        visit[x1][x2][x3] = true;
        queue.add(new State(new int[]{x1, x2, x3}));

        // BFS 과정 시작
        while (!queue.isEmpty()) {
            State st = queue.poll();
            if (st.X[0] == 0) possible[st.X[2]] = true; // A번 물통이 비어 있다면, C번 물통이 원하는 양이므로 true체크
            for (int from = 0; from < 3; from++) {
                for (int to = 0; to < 3; to++) {
                    if (from == to) continue;
                    State nxt = st.move(from, to, Limit);

                    if (!visit[nxt.X[0]][nxt.X[1]][nxt.X[2]]) {
                        visit[nxt.X[0]][nxt.X[1]][nxt.X[2]] = true;
                        queue.add(nxt);
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Limit = new int[3];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 3; i++) {
            Limit[i] = Integer.parseInt(st.nextToken());
        }
        visit = new boolean[201][201][201];
        possible = new boolean[201];
        bfs(0, 0, Limit[2]);
        // 정답 계산하기
        for (int i = 0; i <= Limit[2]; i++) {
            if (possible[i]) sb.append(i).append(' ');
        }
        System.out.println(sb);
    }

}
