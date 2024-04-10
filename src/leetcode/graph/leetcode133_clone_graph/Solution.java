package leetcode.graph.leetcode133_clone_graph;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    Map<Integer, Node> oldToNew = new HashMap<>();

    public Node cloneGraph(Node node) {
        return dfs(node);
    }

    Node dfs(Node node) {
        if (node == null) return null;

        if (oldToNew.containsKey(node.val)) {
            return oldToNew.get(node.val);
        }

        Node copy = new Node(node.val);
        oldToNew.put(node.val, copy);
        for (Node neighbor : node.neighbors) {
            copy.neighbors.add(dfs(neighbor));
        }
        return copy;
    }
}
