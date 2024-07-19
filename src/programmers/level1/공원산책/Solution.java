package programmers.level1.공원산책;

public class Solution {

    int nx;
    int ny;
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    String[] directions = {"N", "S", "W", "E"};

    public int[] solution(String[] park, String[] routes) {
        int sx = 0, sy = 0;
        for (int i = 0; i < park.length; i++) {
            String row = park[i];
            for (int j = 0; j < row.length(); j++) {
                char c = row.charAt(j);
                if (c == 'S') {
                    sx = i;
                    sy = j;
                    break;
                }
            }
        }

        for (String route : routes) {
            String[] split = route.split(" ");

            nx = sx;
            ny = sy;

            if (isMoveBlocked(park, split)) continue;

            sx = nx;
            sy = ny;
        }

        return new int[]{sx, sy};
    }

    private boolean isMoveBlocked(String[] park, String[] split) {

        String direction = split[0];
        int steps = Integer.parseInt(split[1]);

        for (int i = 0; i < steps; i++) {

            for (int j = 0; j < directions.length; j++) {
                if (direction.equals(directions[j])) {
                    nx += dx[j];
                    ny += dy[j];
                }
            }

            if (nx < 0 || ny < 0 || nx >= park.length || ny >= park[0].length()) return true;
            if (park[nx].charAt(ny) == 'X') return true;
        }

        return false;
    }

}
