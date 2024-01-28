package leetcode.trees.leetcode543_diameter_of_binary_tree;

public class Solution {
    static int result = 0;
    private int dfs(TreeNode root) {
        if (root == null) return -1;

        int left = dfs(root.left);
        int right = dfs(root.right);
        result = Math.max(result, 2 + left + right);

        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        result = 0;
        dfs(root);
        return result;
    }
}
