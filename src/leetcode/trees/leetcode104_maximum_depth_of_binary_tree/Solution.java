package leetcode.trees.leetcode104_maximum_depth_of_binary_tree;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {

    /**
     * 2.BFS
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int maxDepth_bfs(TreeNode root) {
        if (root == null) return 0;

        Deque<TreeNode> dq = new ArrayDeque<>();

        int level = 0;
        dq.add(root);

        while (!dq.isEmpty()) {
            // 현재 level의 노드 갯수를 고정해놓고 반복문 돌려야 함
            // 그렇지않으면 dq의 사이즈가 변하므로 level 에서의 노드의 갯수에 맞지 않게 반복문이 수행됨
            int currentLevelSize = dq.size();

            // 현재 레벨의 노드에서 다음 레벨의 노드들을 담는 반복문 코드
            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode node = dq.pollFirst();
                if (node.left != null) {
                    dq.offer(node.left);
                }
                if (node.right != null) {
                    dq.offer(node.right);
                }
            }

            level++;
        }


        return level;
    }

    /**
     * 1.Recursive DFS
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public int maxDepth_recursive_dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth_recursive_dfs(root.left), maxDepth_recursive_dfs(root.right));
    }
}
