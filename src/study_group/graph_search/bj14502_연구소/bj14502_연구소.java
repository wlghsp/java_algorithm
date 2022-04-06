package study_group.graph_search.bj14502_연구소;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class bj14502_연구소 {
    /**
     * 중복 X 순서 X → 조합 Combination
     * 1. n^2 combination 3 가지 경우만큼 직접 벽을 세운다. (완전 탐색) → 약 41K번
     * 2. 매번 직접 "탐색"을 통해서 바이러스로부터 안전한 구역 확인하기 → O(N^2)
     * 3. 탐색 방법에 따라서 O(41K * T) 만큼의 시간이 걸릴 것이다.
     *
     *      *  ## Multisource BFS 시작점이 여러 개인 탐색 ##
     *      *  단 한번의 BFS로 모든 바이러스의 위치를 알 수 있음.
     *      *  모든 시작점을 전부 Queue에 넣은 상태로 BFS를 시작한다.
     *      *  시간 복잡도는, O(V + E) 가 유지된다.
     *
     * 바이러스로 갈 수 있는 상상의 간선이 있다고
     * 1. n^2 combination 3 가지 경우만큼 직접 벽을 세운다. (완전 탐색) → 약 41K번
     * 2. 매번 직접 "탐색"을 통해서 바이러스로부터 안전한 구역 확인하기 → O(N^2)
     * 3. 총 시간복잡도는 O(41K * N^2 = 41 * 64 = 260만)이다.
     */

    static int N, M, B, ans; // B는 벽의 갯수
    static int[][] A, blank;
    static boolean[][] visit;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};


    //  바이러스 퍼뜨리기!!
    static void bfs() {
        Queue<Integer> q = new LinkedList<>();

        // 모든 바이러스가 시작점으로 가능하니까, 전부 큐에 넣어둔다.
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                visit[i][j] = false;
                if (A[i][j] == 2){
                    q.add(i);
                    q.add(j);
                    visit[i][j] = true;
                }
            }
        }

        // BFS 과정
        while(!q.isEmpty()) {
            int x = q.poll(), y = q.poll();
            for (int k = 0; k < 4; k++) {
                int nx = x + dir[k][0], ny = y + dir[k][1];
                if (nx < 1 || ny < 1 || nx > N || ny > M) continue;
                if (A[nx][ny] != 0) continue;
                if (visit[nx][ny]) continue;
                visit[nx][ny] = true;
                q.add(nx);
                q.add(ny);
            }
        }

        // 탐색이 종료된 시점이니. 안전 영역의 넓이를 계산하고, 정답을 갱신한다.
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (A[i][j] == 0 && !visit[i][j]) { // 빈 공간이고
                    cnt++;
                }
            }
        }
        ans = Math.max(ans, cnt);

    }

    // idx 번째 빈 칸에 벽을 세울 지 말지 경정해야 하고, 이 전까지 selectd_cnt 개의 벽을 세웠다.
    static void dfs(int idx, int selected_cnt) {
        if (selected_cnt == 3) { // 3개의 벽을 모두 세운 상태
            bfs(); // BFS 호출하여 바이러스 퍼뜨리기
            return;
        }
        if (idx > B ) return; // 더 이상 세울 수 있는 벽이 없는 상태

        // 벽 세워보기
        A[blank[idx][0]][blank[idx][1]] = 1;
        dfs(idx + 1, selected_cnt + 1);

        // 벽 세우지 않기
        A[blank[idx][0]][blank[idx][1]] = 0;
        dfs(idx + 1, selected_cnt);


    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        M = sc.nextInt();
        A = new int[N + 1][M + 1];
        blank = new int[N * M + 1][2];
        visit = new boolean[N + 1][M + 1];
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                A[i][j] = sc.nextInt();
            }
        }


        // 모든 벽의 위치를 먼저 모아놓자.
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= M; j++) {
                if (A[i][j] == 0) { // 빈 공간 찾기
                    B++;
                    blank[B][0] = i;
                    blank[B][1] = j;
                }
            }
        }

        // 벽을 3개 세우는 모든 방법을 확인해보자!
        dfs(1, 0);
        System.out.println(ans);

    }
}
