package leetcode.finished;

import java.util.LinkedList;
import java.util.Queue;

// https://beccacatcheserrors.tistory.com/21
public class Leetcode101_SymmetricTree {

    // 1. 재귀
    public boolean isSymmetric_recursive(TreeNode root) {
        // root가 null이면 left, right도 null
        return root == null || isEqual(root.left, root.right);
    }
    public boolean isEqual(TreeNode a, TreeNode b) {
        // a와 b 중에 하나만 null이면 양쪽이 같지 않으므로 false
        if (a == null || b == null) return a == b;

        // a과 b의 값이 달라도 false
        if (a.val != b.val) return false;

        return isEqual(a.left, b.right) && isEqual(a.right, b.left);
    }

    public boolean isSymmetric_iterative(TreeNode root) {
        if (root == null) return true;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root.left);
        q.add(root.right);

        while (!q.isEmpty()) {
            TreeNode a = q.poll();
            TreeNode b = q.poll();

            if (a == null && b == null) continue;
            if (a == null || b == null) return false;
            if (a.val != b.val) return false;

            q.add(a.left);
            q.add(b.right);
            q.add(a.right);
            q.add(b.left);
        }
        return root == null || isEqual(root.left, root.right);
    }


    public static void main(String[] args) {
        Leetcode101_SymmetricTree T = new Leetcode101_SymmetricTree();



    }
}


