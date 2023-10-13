package programmers.level1.가장가까운같은글자;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {

    public int[] solution(String s) {
      return IntStream.range(0, s.length())
              .map(i -> s.substring(0, i).lastIndexOf(s.charAt(i)) > -1 ? i - s.substring(0, i).lastIndexOf(s.charAt(i)) : -1)
              .toArray();
    }

    public int[] solution2(String s) {
        int[] answer = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            String substr = s.substring(0, i);

            if (substr.indexOf(s.charAt(i)) == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - substr.lastIndexOf(s.charAt(i));
            }
        }

        return answer;
    }

    public int[] solution1(String s) {
        int[] answer = new int[s.length()];
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, i);
                answer[i] = -1;
            } else {
                Integer idx = map.get(c);
                answer[i] = i - idx;
                map.put(c, i);
            }

        }

        return answer;
    }

}
