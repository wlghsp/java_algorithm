package programmers.level2.의상;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String[][] clothes) {
        Map<String, Integer> map = new HashMap<>();

        for (String[] cloth : clothes) {
            String type = cloth[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;

        // 각 의상 종류별로 선택하지 않는 경우를 포함하여 계산
        for (Integer count : map.values()) {
            answer *= count + 1;
        }

        // 아무 의상도 입지 않는 경우를 제외
        return answer - 1;
    }
}
