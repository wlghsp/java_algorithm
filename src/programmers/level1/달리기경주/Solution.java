package programmers.level1.달리기경주;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String, Integer> nameMap = new HashMap<>();
        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            nameMap.put(players[i], i);
            rankMap.put(i, players[i]);
        }

        for (String calling : callings) {
            // 앞지르는 선수
            Integer behindRank = nameMap.get(calling);
            String behindName = rankMap.get(behindRank);

            // 뒤로 밀리는 선수 
            String frontName = rankMap.get(behindRank - 1);

            // 서로 교환
            nameMap.put(behindName, behindRank - 1);
            rankMap.put(behindRank - 1, behindName);

            nameMap.put(frontName, behindRank);
            rankMap.put(behindRank, frontName);
        }

        return rankMap.values()
                .toArray(new String[0]);
    }
}
