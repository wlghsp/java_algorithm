package baekjoon.gold.gold5.boj13549_숨바꼭질3;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static final int MAX = 100000;
    static int N, K;
    static int[] dist = new int[MAX + 1];

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/gold/gold5/boj13549_숨바꼭질3/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        Arrays.fill(dist, Integer.MAX_VALUE);

        if (N == K) {
            System.out.println(0);
        } else {
            dijkstra(N);
            System.out.println(dist[K]);
        }
    }

    private static void dijkstra(int start) {
        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        pq.add(new Node(start, 0));
        dist[start] = 0;

        while (!pq.isEmpty()) {
            Node current = pq.poll();
            int currentPos = current.position;
            int currentCost = current.cost;

            if (dist[currentPos] < currentCost) continue;

            if (currentPos * 2 <= MAX && dist[currentPos * 2] > currentCost) {
                dist[currentPos * 2] = currentCost;
                pq.add(new Node(currentPos * 2, currentCost));
            }

            if (currentPos + 1 <= MAX && dist[currentPos + 1] > currentCost + 1) {
                dist[currentPos + 1] = currentCost + 1;
                pq.add(new Node(currentPos + 1, currentCost + 1));
            }

            if (currentPos - 1 >= 0 && dist[currentPos - 1] > currentCost + 1) {
                dist[currentPos - 1] = currentCost + 1;
                pq.add(new Node(currentPos - 1, currentCost + 1));
            }
        }
    }
}

class Node {
    int position;
    int cost;

    public Node(int position, int cost) {
        this.position = position;
        this.cost = cost;
    }
}
