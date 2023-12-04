package programmers.level1.대충만든자판;

import java.util.HashMap;
import java.util.Map;

public class Solution {


    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        Map<Character, Integer> map = new HashMap<>();
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char key = s.charAt(i);
                map.put(key, Math.min(i + 1, map.getOrDefault(key, Integer.MAX_VALUE)));
            }
        }


        for (int i = 0; i < targets.length; i++) {
            int cnt = 0;
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < targets[i].length(); j++) {
                if (map.containsKey(targets[i].charAt(j))) {
                    cnt += map.get(targets[i].charAt(j));
                    sb.append(targets[i].charAt(j));
                }
            }
            answer[i] = targets[i].contentEquals(sb) ? cnt : -1;
        }

        return answer;
    }

}
