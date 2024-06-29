package programmers.level3.등대;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Solution {

    private int N, result = 0;
    private List<List<Integer>> map = new ArrayList<>();

    private int dfs(int cur, int before) {
        // 1. 리프 노드일 경우
        if (map.get(cur).size() == 1 && map.get(cur).get(0) == before) {
            return 1;
        }
        // 2. 리프노드가 아닐 경우
        int tmpRes = 0; // 불이 켜져 있는 자식 노드의 갯수
        for (int i = 0; i < map.get(cur).size(); i++) {
            int next = map.get(cur).get(i);
            if (next == before) continue;
            tmpRes += dfs(next, cur);
        }

        // 자식노드들의 합이 0이라면 해당 노드가 불 킬 필요 없음
        if (tmpRes == 0) {
            return 1; // 해당 노드는 불을 키지 않음
        }

        // 해당 노드가 불 켜야함
        result++;
        return 0; // 해당 노드는 불을 켜줌
    }

    public int solution(int n, int[][] lighthouse) {
        // 초기화
        N = n;
        for (int i = 0; i <= N; i++) {
            map.add(new ArrayList<>());
        }
        for (int[] house : lighthouse) {
            map.get(house[0]).add(house[1]);
            map.get(house[1]).add(house[0]);
        }

        // dfs로 켜야하는 등대 갯수 판별
        dfs(1, 0);


        return result;
    }
}
