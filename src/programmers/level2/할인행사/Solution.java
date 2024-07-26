package programmers.level2.할인행사;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> wantMap = new HashMap<>();
        for (int i = 0; i < want.length; i++) {
            wantMap.put(want[i], number[i]);
        }

        for (int i = 0; i < discount.length - 9; i++) {
            Map<String, Integer> discountMap = new HashMap<>();
            for (int j = i; j < i + 10; j++) {
                discountMap.put(discount[j], discountMap.getOrDefault(discount[j], 0) + 1);
            }
            boolean same = true;

            for (int j = 0; j < want.length; j++) {
                if (!wantMap.get(want[j]).equals(discountMap.get(want[j]))) {
                    same = false;
                    break;
                }
            }
            answer += same ? 1 : 0;
        }

        return answer;
    }
}
