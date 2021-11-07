package java_study.recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*

Flood Fill은 말 그대로 색칠 알고리즘이다. 
우리가 그림판을 이용할 때 물감통 모양의 아이콘을 클릭하고 어떠한 도형의 내부를 클릭하면 
해당 도형의 내부만 색칠된다. 또 우리가 지뢰찾기 게임을 할 때 지뢰가 없는 영역을 누르면 
근처의 지뢰가 없는 영역이 전부 눌러지게 된다. 이러한 알고리즘을 내부적으로 어떻게 구현할까?


5
0 0 0 0 0
0 0 0 1 1
0 0 0 1 0
1 1 1 1 0
0 0 0 0 0
1 1

*/

public class FloodFill {

    // Flood fill 알고리즘

    static int N;
    static int[][] board = new int[100][100];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int sRow, sCol;
        st = new StringTokenizer(br.readLine());
        sRow = Integer.parseInt(st.nextToken());
        sCol = Integer.parseInt(st.nextToken());
        fill(sRow, sCol);
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void fill(int r, int c) {
        // 2개의 base case
        if (r < 0 || r > N - 1 || c < 0 || c > N - 1)
            return;

        if (board[r][c] != 0)
            return;
        board[r][c] = 1;
        fill(r - 1, c); // 위로 이동
        fill(r + 1, c); // 아래로 이동
        fill(r, c - 1); // 왼쪽 이동
        fill(r, c + 1); // 오른쪽으로 이동
    }
}
