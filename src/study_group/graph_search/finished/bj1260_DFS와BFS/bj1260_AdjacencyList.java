package study_group.graph_search.finished.bj1260_DFS와BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class bj1260_AdjacencyList {
    // 인접리스트 방식
    public static int n, m, v;
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    public static boolean[] visited;

    // DFS 함수
    public static void dfs(int x) {
        // 현재 노드를 방문 처리
        visited[x] = true;
        System.out.print(x + " "); // 방문한 노드 출력

        // 현재 노드와 연결된 다른 노드를 재귀적으로 방문
        for(int value : graph.get(x)) {
            if (!visited[value]) dfs(value);
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
            for(int e: graph.get(x)) {
                if (!visited[e]) {
                    visited[e] = true;
                    q.offer(e);
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

        // 그래프 초기화
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph.get(x).add(y);
            graph.get(y).add(x);
        }
        for (int i = 0; i <= n; i++) {
            Collections.sort(graph.get(i));
        }
        dfs(v);
        visited = new boolean[n+1];
        System.out.println();
        bfs(v);

    }
}
