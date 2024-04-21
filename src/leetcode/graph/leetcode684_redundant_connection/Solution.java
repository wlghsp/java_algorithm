package leetcode.graph.leetcode684_redundant_connection;

public class Solution {
    int[] parent;

    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length + 1];

        for (int i = 1; i <= edges.length; i++) parent[i] = i; // 루트 노드 초기화

        for (int[] edge : edges) {
            if (find(edge[0]) == find(edge[1])) return edge; // 루트 노드가 같으면 사이클 발생
            else union(edge[0], edge[1]);
        }

        return new int[2];
    }

    private int find(int n) {
        if (n == parent[n]) return n;
        return find(parent[n]);
    }

    private void union(int x, int y) {
        parent[find(y)] = find(x);
    }
}
