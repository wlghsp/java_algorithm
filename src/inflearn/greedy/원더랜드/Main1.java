package inflearn.greedy.원더랜드;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

class Edge1 implements Comparable<Edge1> {

    int v;
    int cost;

    public Edge1(int v, int cost) {
        this.v = v;
        this.cost = cost;
    }

    @Override
    public int compareTo(Edge1 o) {
        return this.cost - o.cost;
    }
}

public class Main1 {
    static int V, E;

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/inflearn/greedy/원더랜드/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        V = Integer.parseInt(st.nextToken());
        E = Integer.parseInt(st.nextToken());
        List<List<Edge1>> edges = new ArrayList<>();
        int[] check = new int[V + 1];
        for (int i = 0; i <= V; i++) {
            edges.add(new ArrayList<>());
        }

        for (int i = 0; i < E; i++) {
            st = new StringTokenizer(br.readLine());
            int v1 = Integer.parseInt(st.nextToken());
            int v2 = Integer.parseInt(st.nextToken());
            int cost = Integer.parseInt(st.nextToken());
            edges.get(v1).add(new Edge1(v2, cost));
            edges.get(v2).add(new Edge1(v1, cost));
        }

        int answer = 0;
        int cnt = 0;
        PriorityQueue<Edge1> pq = new PriorityQueue<>();
        pq.offer(new Edge1(1, 0));
        while (!pq.isEmpty()) {
            Edge1 cur = pq.poll();

            if (check[cur.v] != 0) continue;

            cnt++;
            check[cur.v] = 1;
            answer += cur.cost;

            if (cnt == V) break;

            for (Edge1 next : edges.get(cur.v)) {
                if (check[next.v] != 0) continue;

                pq.offer(new Edge1(next.v, next.cost));
            }
        }

        System.out.println(answer);
    }
}
