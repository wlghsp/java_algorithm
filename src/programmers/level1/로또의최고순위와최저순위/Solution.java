package programmers.level1.로또의최고순위와최저순위;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        int win = 6;
        for (int i = 1; i <= 6; i++) {
            map.put(win--, i);
            if (i == 6) {
                map.put(0, i);
            }
        }

        Set<Integer> winSet = new HashSet<>();
        for (int winNum : win_nums) {
            winSet.add(winNum);
        }

        int cnt = 0;
        int zeroCnt = 0;
        for (int lotto : lottos) {
            if (winSet.contains(lotto)) cnt++;
            else if(lotto == 0) zeroCnt++;
        }

        answer[0] = map.get(cnt + zeroCnt);
        answer[1] = map.get(cnt);

        return answer;
    }
}
