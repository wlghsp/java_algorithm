package leetcode.trees.leetcode110_balanced_binary_tree;

class Pair {
    public boolean balanced;
    public int height;

    public Pair(boolean balanced, int height) {
        this.balanced = balanced;
        this.height = height;
    }
}

public class Solution {

    private Pair dfs(TreeNode root) {
        if (root == null) return new Pair(true, 0);

        Pair left = dfs(root.left);
        Pair right = dfs(root.right);

        boolean balanced = (left.balanced && right.balanced && Math.abs(left.height - right.height) <= 1);

        return new Pair(balanced, 1 + Math.max(left.height, right.height));

    }

    public boolean isBalanced(TreeNode root) {
        return dfs(root).balanced;
    }
}
