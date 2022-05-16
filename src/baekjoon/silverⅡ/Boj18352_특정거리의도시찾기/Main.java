package baekjoon.silverⅡ.Boj18352_특정거리의도시찾기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int visited[];
    static ArrayList<Integer>[] A;
    static int N,M,K,X;
    static List<Integer> answer;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 노드의 수
        M = Integer.parseInt(st.nextToken()); // 엣지의 수
        K = Integer.parseInt(st.nextToken()); // 거리정보
        X = Integer.parseInt(st.nextToken()); // 출발도시번호
        A = new ArrayList[N+1];

        answer = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            A[i] = new ArrayList<>();
        }

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int E = Integer.parseInt(st.nextToken());
            A[S].add(E);
        }

        visited = new int[N+1]; // 방문 배열 초기화하기

        for (int i = 0; i <= N; i++) {
            visited[i] = -1;
        }

        BFS(X); // BFS로 탐색하며 거리를 기록한다.

        for (int i = 0; i <= N; i++) {
            if (visited[i] == K) { // 목표거리와 같은 거리의 노드를 찾는다.
                answer.add(i);
            }
        }

        if (answer.isEmpty()) {
            System.out.println("-1");
        }

        else {
            Collections.sort(answer); // 오름차순 출력
            for (int temp : answer) {
                System.out.println(temp);
            }
        }
    }

    // BFS 구현하기
    private static void BFS(int Node) {
        Queue<Integer> queue = new LinkedList<>();

        queue.add(Node); // 큐에 출발노드를 더한다.

        visited[Node]++; // 0으로 만듬

        while (!queue.isEmpty()) { // 큐가 빌 때까지
            int now_node = queue.poll(); // 큐에서 노드데이터를 가져오기
            for (int i : A[now_node]) {
                if (visited[i] == -1) {
                    // 방문할때마다 거리를 늘려준다.
                    visited[i] = visited[now_node] + 1; // 이전 노드의 방문 노드 거리 + 1
                    queue.add(i);
                }
            }
        }
    }


}
