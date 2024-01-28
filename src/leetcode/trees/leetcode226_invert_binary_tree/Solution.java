package leetcode.trees.leetcode226_invert_binary_tree;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // swap
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        // DFS
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
