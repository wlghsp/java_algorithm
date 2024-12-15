package baekjoon.gold.gold2.boj1167_트리의지름;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static List<Node>[] list;
    static boolean[] visited;
    static int maxDistance = 0;
    static int maxNode;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        list = new ArrayList[n + 1];
        for (int i = 1; i < n + 1; i++) {
            list[i] = new ArrayList<>();
        }
        StringTokenizer st;
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int curr = Integer.parseInt(st.nextToken());

            while (true) {
                int adjNode = Integer.parseInt(st.nextToken());
                if (adjNode == -1) break;
                int adjCost = Integer.parseInt(st.nextToken());
                list[curr].add(new Node(adjNode, adjCost));
            }
        }

        visited = new boolean[n + 1];
        dfs(1, 0);

        visited = new boolean[n + 1];
        dfs(maxNode, 0);

        System.out.println(maxDistance);
    }

    private static void dfs(int current, int distance) {
        visited[current] = true;
        if (distance > maxDistance) {
            maxDistance = distance;
            maxNode = current;
        }

        for (Node node : list[current]) {
            if (!visited[node.edge]) {
                dfs(node.edge, node.cost + distance);
                visited[node.edge] = true;
            }
        }
    }
}


class Node {
    int edge;
    int cost;

    public Node(int edge, int cost) {
        this.edge = edge;
        this.cost = cost;
    }
}