package study_group.graph_search.finished.bj1260_DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj1260_AdjacencyMatrix {

    // 인접행렬 방식
    public static int n, m, v;
    public static int[][] graph;
    public static boolean[] visited;

    // DFS 함수
    public static void dfs(int x) {
        // 현재 노드를 방문 처리
        visited[x] = true;
        System.out.print(x + " "); // 방문한 노드 출력

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for (int i = 1; i <= n; i++) {
            if (graph[x][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }

    // BFS 함수 정의
    public static void bfs(int start) {
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        // 현재 노드를 방문 처리
        visited[start] = true;

        //큐가 빌 때까지 반복
        while (!q.isEmpty()) {
            // 큐에서 하나의 원소를 뽑아 출력
            int x = q.poll();
            System.out.print(x + " ");
            // 해당 원소와 연결된, 아직 방문하지 않은 원소들을 큐에 삽입
            for(int i = 1; i<= n; i++) {
                if (graph[x][i] == 1 &&!visited[i]) { //간선이 존재하고 방문하지 않았다면
                    visited[i] = true;
                    q.offer(i);
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken()); // 정점의 갯수
        m = Integer.parseInt(st.nextToken()); // 간선의 갯수
        v = Integer.parseInt(st.nextToken()); // 탐색 시작 정점

        visited = new boolean[n+1];
        graph = new int[n + 1][n + 1];


        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            // 무향(양방향) 그래프
            graph[x][y] = 1; // 1은 간선이 존재, 나머지는 초기화로 인해 0이다
            graph[y][x] = 1;
        }

//        System.out.println(Arrays.deepToString(graph));
        dfs(v);
        visited = new boolean[n+1];
        System.out.println();
        bfs(v);

    }
}
