package inflearn.Recursive_Tree_Graph_DFS_BFS_기초.q62_Tree말단노드까지의가장짧은경로_BFS;


import java.util.LinkedList;
import java.util.Queue;

class Node {
    int data;
    Node lt, rt;

    public Node(int val){
        data = val;
        lt = rt = null;
    }
}

public class Main {
    Node root;

    public int BFS(Node root) {
        Queue<Node> Q = new LinkedList<>();
        Q.offer(root);
        int L = 0;
        while (!Q.isEmpty()) {
            int len = Q.size();
            for (int i = 0; i < len; i++) {
                Node cur = Q.poll();
                // 말단 노드라는 의미. 가장 먼저 찾은 말단 노드가 최단거리
                if (cur.lt == null && cur.rt == null) return L;
                if (cur.lt != null) Q.offer(cur.lt);
                if (cur.rt != null) Q.offer(cur.rt);
            }
            L++;
        }
        // 여기까지 오지 않지만 에러를 피하기 위해 return 0
        return 0;
    }


    public static void main(String[] args) {
        Main tree = new Main();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        System.out.println(tree.BFS(tree.root));

    }
}
