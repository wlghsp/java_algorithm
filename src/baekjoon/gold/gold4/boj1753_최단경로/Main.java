package baekjoon.gold.gold4.boj1753_최단경로;

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
    static int V, E;
    static int start;
    static int[] dist;
    static ArrayList<ArrayList<Edge>> graph;

    private static void dijkstra(int start) {
        PriorityQueue<Edge> pq = new PriorityQueue<>();
        dist[start] = 0;
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int currentNode = current.vertex;
            int currentCost = current.cost;

            if (currentCost > dist[currentNode]) continue;

            for (Edge edge : graph.get(currentNode)) {
                if (dist[edge.vertex] > currentCost + edge.cost) {
                    dist[edge.vertex] = currentCost + edge.cost;
                    pq.add(new Edge(edge.vertex, currentCost + edge.cost));
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold4/boj1753_최단경로/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        start = Integer.parseInt(br.readLine());

        graph = new ArrayList<>();
        for (int i = 0; i <= V; i++) {
            graph.add(new ArrayList<>());
        }

        dist = new int[V + 1];
        Arrays.fill(dist, Integer.MAX_VALUE);

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            graph.get(u).add(new Edge(v, w));
        }

        dijkstra(start);

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= V; i++) {
            if (dist[i] == Integer.MAX_VALUE) {
                sb.append("INF").append('\n');
            } else {
                sb.append(dist[i]).append('\n');
            }
        }

        System.out.println(sb);
    }
}
