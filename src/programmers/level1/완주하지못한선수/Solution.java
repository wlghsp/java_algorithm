package programmers.level1.완주하지못한선수;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * map 1개
     */
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for (String s : participant) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (String s : map.keySet()) {
            if (map.get(s) != 0) {
                return s;
            }
        }


        return answer;
    }

    /**
     * 내 풀이
     * map 2개
     */
    public String solution1(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> completionMap = new HashMap<>();
        Map<String, Integer> participantMap = new HashMap<>();
        for (String s : completion) {
            completionMap.put(s, completionMap.getOrDefault(s, 0) + 1);
        }
        for (String s : participant) {
            participantMap.put(s, participantMap.getOrDefault(s, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : participantMap.entrySet()) {
            String key = entry.getKey();
            // 1. 참가자가 완주자 명단에 없는 경우 해당 참가자 반환
            if (!completionMap.containsKey(key)) {
                return key;
            }
            // 2. 참가자가 완주자 명단에 있는데 완주자의 수와 참가자의 수가 다르다면 해당 참가자 반환
            if (!completionMap.get(key).equals(entry.getValue())) {
                return key;
            }
        }

        return answer;
    }
}
