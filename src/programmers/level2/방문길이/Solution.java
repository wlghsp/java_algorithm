package programmers.level2.방문길이;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {

    public int solution(String dirs) {
        // 음수 좌표가 포함 되므로 원점을 5, 5 로 변경
        int x = 5, y = 5;
        Set<Point> ans = new HashSet<>();

        for (char dir : dirs.toCharArray()) {
            int[] newPoint = updateLocation(x, y, dir);
            if (!validMove(newPoint[0], newPoint[1])) continue;

            ans.add(new Point(x, y, newPoint[0], newPoint[1]));
            ans.add(new Point(newPoint[0], newPoint[1], x, y));
            x = newPoint[0];
            y = newPoint[1];
        }

        return ans.size() / 2;
    }

    private int[] updateLocation(int x, int y, char dir) {
        int[] ret = new int[2];
        if (dir == 'U') {
            ret[0] = x;
            ret[1] = y + 1;
        } else if (dir == 'D') {
            ret[0] = x;
            ret[1] = y - 1;
        } else if (dir == 'L') {
            ret[0] = x - 1;
            ret[1] = y;
        } else if (dir == 'R') {
            ret[0] = x + 1;
            ret[1] = y;
        }
        return ret;
    }

    private boolean validMove(int nx, int ny) { // 좌표 평면 벗어나는지 체크
        return 0 <= nx && nx < 11 && 0 <= ny && ny < 11;
    }

}

class Point {
    int x;
    int y;
    int nx;
    int ny;

    public Point(int x, int y, int nx, int ny) {
        this.x = x;
        this.y = y;
        this.nx = nx;
        this.ny = ny;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return x == point.x && y == point.y && nx == point.nx && ny == point.ny;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, nx, ny);
    }
}
