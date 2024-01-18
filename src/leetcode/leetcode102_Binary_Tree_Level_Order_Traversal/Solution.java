package leetcode.leetcode102_Binary_Tree_Level_Order_Traversal;

import java.util.*;

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();

        // root가 null인 경우 res 반환
        if (root == null) {
            return res;
        }

        Deque<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            int qLen = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < qLen; i++) {
                TreeNode node = q.pollFirst();
                if (node != null) {
                    level.add(node.val);
                    if (node.left != null) {
                        q.offerLast(node.left);
                    }
                    if (node.right != null) {
                        q.offerLast(node.right);
                    }
                }
            }
            if (!level.isEmpty()) {
                res.add(level);
            }
        }
        return res;
    }
}
