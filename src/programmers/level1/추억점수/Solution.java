package programmers.level1.추억점수;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        int[] answer = new int[photo.length];
        int index = 0;
        for (String[] p : photo) {
            int sum = 0;
            for (String s : p) {
                if (map.containsKey(s)) {
                    sum += map.get(s);
                }
            }
            answer[index++] = sum;
        }

        return answer;
    }
}
