package inflearn.DFS_BFS활용.q76_미로의최단거리통로_BFS;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


class Node {
    private int x;
    private int y;

    Node(int x, int y){
        this.x = x;
        this.y = y;
}

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class Main_내풀이 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    static int[][] graph = new int[8][8];

    public int BFS(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            x = node.getX();
            y = node.getY();
            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];
                if (nx >= 1 && nx <= 7 && ny >= 1 && ny <= 7 && graph[nx][ny] == 0) {
                    graph[nx][ny] = graph[x][y] + 1;
                    queue.offer(new Node(nx, ny));
                }
            }
        }

        return graph[7][7] == 0 ? -1 : graph[7][7];
    }

    public static void main(String[] args) {
        Main_내풀이 T = new Main_내풀이();
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.println(T.BFS(1, 1));

    }

}
