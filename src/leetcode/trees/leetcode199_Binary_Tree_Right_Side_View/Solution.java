package leetcode.trees.leetcode199_Binary_Tree_Right_Side_View;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            TreeNode rightSide = null;
            int qLen = q.size();

            for (int i = 0; i < qLen; i++) {
                TreeNode node = q.poll();
                if (node != null) {
                    rightSide = node;
                    q.add(node.left);
                    q.add(node.right);
                }
            }
            if (rightSide != null) {
                res.add(rightSide.val);
            }
        }

        return res;
    }
}
