package java_study.bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*

 Shortest path
5 
0 0 0 0 0
0 1 1 1 1
0 0 0 0 0
1 1 1 1 0
0 0 0 0 0
0 1 4 2  
// 0 1 은 시작위치, 4 2는 도착위치
0 빈공간 , 1은 벽 


하나의 노드라고 생각하고 간선으로 연결되었다고 생각하자. 
*/

public class BFS_youtubeEx2 {

    static final int MAX_N = 10;
    static int[][] D = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
    static int N; // 공간의 크기
    static int[][] board = new int[MAX_N][MAX_N]; // N*N

    static class Point {
        Point(int r, int c, int d) {
            row = r;
            col = c;
            dist = d;
        }

        int row, col, dist; // 행, 열, 거리

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt(); // 몇 줄 받을 지 N

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt(); // 0, 1로 이루어진 좌표 정보를 읽어 들임
            }
        }

        int sRow, sCol, dRow, dCol; // 시작위치와 도착 위치
        sRow = sc.nextInt();
        sCol = sc.nextInt();
        dRow = sc.nextInt();
        dCol = sc.nextInt();

        System.out.println(bfs(sRow, sCol, dRow, dCol));

    }

    static int bfs(int sRow, int sCol, int dRow, int dCol) {
        boolean[][] visited = new boolean[MAX_N][MAX_N];
        Queue<Point> myqueue = new LinkedList<>();
        visited[sRow][sCol] = true; // 방문여부 표시
        myqueue.add(new Point(sRow, sCol, 0)); // 시작위치 push

        while (!myqueue.isEmpty()) {
            Point curr = myqueue.remove(); // 큐에서 dequeue함 .가장 먼저 들어 온 데이터 빼냄
            if (curr.row == dRow && curr.col == dCol) { // 도착위치이면 거리를 반환한다.
                return curr.dist;
            }
            // 4 방향으로 이동할 위치를 확인하고 이동
            for (int i = 0; i < 4; i++) {
                // 현재 위치에서 상하좌우 이동한 좌표 입력
                int nr = curr.row + D[i][0], nc = curr.col + D[i][1];
                if (nr < 0 || nr > N - 1 || nc < 0 || nc > N - 1)
                    continue;
                if (visited[nr][nc])
                    continue; // 방문했다면 skip
                if (board[nr][nc] == 1)
                    continue; // 1은 벽이므로 skip
                // 방문한 적이 없고 유효한 위치
                visited[nr][nc] = true;
                // 가능한 상하좌우 위치를 enqueue함. 거리는 1을 더해 줌
                myqueue.add(new Point(nr, nc, curr.dist + 1));
            }
        }
        return -1;

    }

}
