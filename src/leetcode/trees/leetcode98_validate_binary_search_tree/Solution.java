package leetcode.trees.leetcode98_validate_binary_search_tree;

public class Solution {
    private boolean valid(TreeNode node, long left, long right) {
        if (node == null) return true;
        if (!(node.val < right && left < node.val)) return false;

        return valid(node.left, left, node.val) && valid(node.right, node.val, right);
    }

    public boolean isValidBST(TreeNode root) {
        return valid(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
}
