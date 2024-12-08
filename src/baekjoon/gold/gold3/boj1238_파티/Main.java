package baekjoon.gold.gold3.boj1238_파티;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {

    static int N, M, X;
    static final int INF = 100_000_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        X = Integer.parseInt(st.nextToken());

        // 그래프 초기화
        List<List<Node>> graph = new ArrayList<>();
        List<List<Node>> reverseGraph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
            reverseGraph.add(new ArrayList<>());
        }

        // 간선 정보 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int from = Integer.parseInt(st.nextToken());
            int to = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(from).add(new Node(to, cost));
            reverseGraph.get(to).add(new Node(from, cost));
        }

        // 다익스트라 실행
        int[] distFromX = dijkstra(X, graph); // X에서 다른 노드까지
        int[] distToX = dijkstra(X, reverseGraph);

        // 왕복 거리 계산 및 최댓값 구하기
        int maxTime = 0;
        for (int i = 1; i <= N; i++) {
            maxTime = Math.max(maxTime, distFromX[i] + distToX[i]);
        }

        System.out.println(maxTime);

    }

    private static int[] dijkstra(int start, List<List<Node>> graph) {
        int[] dist = new int[N + 1];
        Arrays.fill(dist, INF);
        dist[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentNode = current.to;
            int currentCost = current.cost;

            if (currentCost > dist[currentNode]) {
                continue;
            }

            for (Node neighbor : graph.get(currentNode)) {
                int nextNode = neighbor.to;
                int newCost = currentCost + neighbor.cost;

                if (newCost < dist[nextNode]) {
                    dist[nextNode] = newCost;
                    pq.add(new Node(nextNode, newCost));
                }
            }
        }

        return dist;
    }
}



class Node implements Comparable<Node> {

    int to, cost;

    Node (int to, int cost) {
        this.to = to;
        this.cost = cost;
    }

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.cost, o.cost);
    }
}
