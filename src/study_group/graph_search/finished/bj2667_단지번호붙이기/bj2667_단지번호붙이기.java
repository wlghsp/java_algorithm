package study_group.graph_search.finished.bj2667_단지번호붙이기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class bj2667_단지번호붙이기 {

    static int N, group_cnt;
    static String[] map;
    static int[][] dir = {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
    static boolean[][] visit;
    static ArrayList<Integer> group;

    static void dfs(int x, int y){
        // 단지에 속한 집의 갯수 증가, visit 체크하기
        group_cnt++;
        visit[x][y] = true;
        // 인접한 집으로 새로 방문하기
        for (int k = 0; k < 4; k++) {
            // (x, y) -> dir[k]
            int nx = x + dir[k][0];
            int ny = y + dir[k][1];
            // 1. 이동 위치가 정상범위가 아니라면
            if (nx < 0 || ny < 0 || nx >= N || ny >= N) continue;
            // 2. 이동 위치에 집이 없다면
            if (map[nx].charAt(ny) == '0') continue;
            // 3. 방문한적이 있다면
            if (visit[nx][ny]) continue;

            // 위 확인을 뚫고 왔다면
            dfs(nx, ny);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new String[N];
        visit = new boolean[N][N];
        for (int i = 0; i < N; i++) {
                map[i] = br.readLine();
        }
        group = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visit[i][j] && map[i].charAt(j) =='1') {
                    //단지에 속한 집의 수 카운트
                    group_cnt = 0;
                    dfs(i, j);
                    group.add(group_cnt);
                }
            }
        }

        // 각 단지 내 집의 수를 오름차순 정렬
        Collections.sort(group);
        // 단지 수 출력
        System.out.println(group.size());
        for (int cnt: group) System.out.println(cnt);

    }
}
