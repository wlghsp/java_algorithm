package leetcode.trees.leetcode1448_Count_Good_Nodes_in_Binary_Tree;

public class Solution {
    private int dfs(TreeNode node, int maxVal) {
        if (node == null) return 0;
        int res = node.val >= maxVal ? 1 : 0;
        maxVal = Math.max(maxVal, node.val);
        res += dfs(node.left, maxVal);
        res += dfs(node.right, maxVal);

        return res;
    }
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }
}
