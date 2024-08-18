package baekjoon.gold.gold5.boj1916_최소비용구하기;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge implements Comparable<Edge> {
    public int vertex;
    public int cost;

    public Edge(int vertex, int cost) {
        this.vertex = vertex;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge o) {
        return this.cost - o.cost;
    }
}

public class Main {
    static int N, M;
    static int start, end;
    static int[] costs;
    static ArrayList<ArrayList<Edge>> graph;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold5/boj1916_최소비용구하기/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());
        costs = new int[N + 1];
        Arrays.fill(costs, Integer.MAX_VALUE);

        graph = new ArrayList<>();
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }
        StringTokenizer st;
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, cost));
        }
        st = new StringTokenizer(br.readLine());
        start = Integer.parseInt(st.nextToken());
        end = Integer.parseInt(st.nextToken());

        dijkstra(start);

        System.out.println(costs[end]);
    }

    private static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        costs[start] = 0;
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int currentVertex = current.vertex;
            int currentCost = current.cost;
            if (costs[currentVertex] < currentCost) continue; // 없으면 시간초과 발생함
            for (Edge edge : graph.get(currentVertex)) {
                if (costs[edge.vertex] > currentCost + edge.cost) {
                    costs[edge.vertex] = currentCost + edge.cost;
                    pq.add(new Edge(edge.vertex, currentCost + edge.cost));
                }
            }
        }
    }
}
