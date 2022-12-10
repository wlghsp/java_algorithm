package programmers.level0.안전지대;

public class Solution {

    // 이동할 8 가지 방향 정의
    static int dx[] = {-1, -1, -1, 0, 1, 1,  1,  0};
    static int dy[] = {-1,  0,  1, 1, 1, 0, -1, -1};
    static int n;
    public int solution(int[][] board) {
        int answer = 0;
        n = board.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    if (checkMine(board, i, j)) {
                        board[i][j] = 2;
                    } else {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    // 8가지 방향에 마인이 있는지 체크
    private boolean checkMine(int[][] board, int i, int j) {
        for (int k = 0; k < 8; k++) {
            int nx = i + dx[k];
            int ny = j + dy[k];
            if (nx >=0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                return true;
            }
        }
        return false;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(new int[][]{
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,1,0,0},
                {0,0,0,0,0}
        })); // 16
        System.out.println(s.solution(new int[][]{
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,0,0,0},
                {0,0,1,1,0},
                {0,0,0,0,0}
        })); // 13
    }
}
