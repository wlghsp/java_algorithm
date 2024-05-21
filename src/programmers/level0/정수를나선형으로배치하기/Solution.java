package programmers.level0.정수를나선형으로배치하기;

public class Solution {

    /**
     * 우 하 좌 상
     */
    int[] dx = {1, 0, -1, 0};
    int[] dy = {0, 1,  0, -1};

    public int[][] solution(int n) {
        int[][] ans = new int[n][n];

        // 처음 좌표
        int x = 0, y = 0;
        // 방향
        int direction = 0;

        for (int i = 1; i < (n * n) + 1; i++) {

            // 빈배열에 i 순서대로 넣어주기
            ans[y][x] = i;

            // 이동할 다음 좌표 구하기
            int nx = x + dx[direction];
            int ny = y + dy[direction];

            if (nx >= n || nx < 0 || ny >= n || ny < 0 || ans[ny][nx] != 0) {

                // 방향은 총 상하좌우 4가지  90도 회전
                direction = (direction + 1) % 4;

                // 방향 정한 후 다음 이동할 좌표 정하기
                nx = x + dx[direction];
                ny = y + dy[direction];
            }

            // x, y에 이동해야할 다음 좌표 넣기
            x = nx;
            y = ny;
        }

        return ans;
    }
}
