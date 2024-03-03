package programmers.level2.거리두기확인하기;

public class Solution {

    /**
     * 상좌우하로 반대방향끼리 더하면 3이 된다
     * 3 - d = 반대방향 인덱스
     */
    private static final int[] dx = {0, -1, 1, 0};
    private static final int[] dy = {-1, 0, 0, 1};

    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int i = 0; i < answer.length; i++) {
            String[] place = places[i];
            char[][] room = new char[place.length][];
            for (int j = 0; j < room.length; j++) {
                room[j] = place[j].toCharArray();
            }
            // 거리두기 검사 후 answer에 기록
            if (isDistanced(room)) {
                answer[i] = 1;
            } else {
                answer[i] = 0;
            }
        }

        return answer;
    }

    private boolean isDistanced(char[][] room) {
        for (int y = 0; y < room.length; y++) {
            for (int x = 0; x < room[y].length; x++) {
                if (room[y][x] != 'P') continue;
                // 응시자가 있는 자리만 확인
                if (!isDistanced(room, x, y)) return false;
            }
        }
        return true;
    }

    private boolean isDistanced(char[][] room, int x, int y) {
        for (int d = 0; d < 4; d++) {
            int nx = x + dx[d];
            int ny = y + dy[d];
            if (NotPossible(room, ny, nx)) continue;
            switch (room[ny][nx]) {
                case 'P': return false;
                case 'O':
                    // 빈 테이블인 경우 3방향을 확인해서 응시자가 있는지 확인
                    if (isNextToVolunteer(room, nx, ny, 3 - d)) return false;
                    break;
            }
        }
        return true;
    }

    /**
     * 빈 테이블에서 출발지 빼고 3방향 확인하여
     * 응시자가 있는지 확인 있으면 true, 없으면 false 반환
     */
    private boolean isNextToVolunteer(char[][] room, int x, int y, int exclude) {
        for (int d = 0; d < 4; d++) {
            if (d == exclude) continue;

            int nx = x + dx[d];
            int ny = y + dy[d];
            if (NotPossible(room, ny, nx)) continue;
            if (room[ny][nx] == 'P') return true;
        }

        return false;
    }

    /**
     * 이동 가능 여부 확인
     */
    private boolean NotPossible(char[][] room, int ny, int nx) {
        return ny < 0 || ny >= room.length || nx < 0 || nx >= room.length;
    }

}
