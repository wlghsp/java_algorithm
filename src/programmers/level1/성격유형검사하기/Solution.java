package programmers.level1.성격유형검사하기;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public String solution(String[] survey, int[] choices) {
        StringBuilder answer = new StringBuilder();
        String[] types = {"RT", "CF", "JM", "AN"};
        Map<Character, Integer> map = new HashMap<>() {{
                put('R', 0);
                put('T', 0);
                put('C', 0);
                put('F', 0);
                put('J', 0);
                put('M', 0);
                put('A', 0);
                put('N', 0);
        }};

        for (int i = 0; i < survey.length; i++) {
            if (choices[i] > 4) {
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + (choices[i] - 4));
            } else if (choices[i] < 4) {
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + (4 - choices[i]));
            }
        }

        for (String type : types) {
            Integer a = map.get(type.charAt(0));
            Integer b = map.get(type.charAt(1));
            answer.append(a >= b ? type.charAt(0) : type.charAt(1));
        }

        return answer.toString();
    }
}
