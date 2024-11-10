package baekjoon.silver.silver1.boj1991_트리순회;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

class Node {
    char value;
    Node left;
    Node right;

    public Node(char value) {
        this.value = value;
    }
}

public class Main {
    static int N;
    static Map<Character, Node> tree = new HashMap<>();

    public static void main(String[] args) throws IOException {
        System.setIn(new FileInputStream("src/baekjoon/silver/silver1/boj1991_트리순회/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");
            char root = input[0].charAt(0);
            char left = input[1].charAt(0);
            char right = input[2].charAt(0);

            tree.putIfAbsent(root, new Node(root));

            if (left != '.') {
                tree.putIfAbsent(left, new Node(left));
                tree.get(root).left = tree.get(left);
            }

            if (right != '.') {
                tree.putIfAbsent(right, new Node(right));
                tree.get(root).right = tree.get(right);
            }
        }

        // 순회 결과 출력
        preorder(tree.get('A'));
        System.out.println();
        inorder(tree.get('A'));
        System.out.println();
        postorder(tree.get('A'));
        System.out.println();
    }

    // 전위 순회 : 노드 -> 왼쪽 -> 오른쪽 순서
    public static void preorder(Node node) {
        if (node == null) return;
        System.out.print(node.value);
        preorder(node.left);
        preorder(node.right);
    }

    // 중위 순회 : 왼쪽 -> 노드 -> 오른쪽
    public static void inorder(Node node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.value);
        inorder(node.right);
    }

    // 후위 순회 : 왼쪽 -> 오른쪽 -> 노드
    public static void postorder(Node node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.value);
    }

}
