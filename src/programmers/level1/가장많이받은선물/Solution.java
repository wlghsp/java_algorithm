package programmers.level1.가장많이받은선물;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public int solution(String[] friends, String[] gifts) {
        Map<String, Integer> giftRecord = new HashMap<>();
        Map<String, Integer> presentIndex = new HashMap<>();
        for (String s : gifts) {
            giftRecord.put(s, giftRecord.getOrDefault(s, 0) + 1);
            String[] rec = s.split(" ");
            String giver = rec[0];
            String receiver = rec[1];

            // 선물 준 경우
            presentIndex.put(giver, presentIndex.getOrDefault(giver, 0) + 1);
            // 선물 받은 경우
            presentIndex.put(receiver, presentIndex.getOrDefault(receiver, 0) - 1);
        }

        int[] numOfPresents = new int[friends.length];

        for (int i = 0; i < friends.length; i++) {
            for (int j = i + 1; j < friends.length; j++) {
                String friend1 = friends[i];
                String friend2 = friends[j];

                Integer numOfIGave = giftRecord.getOrDefault(friend1 + " " + friend2, 0);
                Integer numOfJGave = giftRecord.getOrDefault(friend2 + " " + friend1, 0);

                if (numOfIGave > numOfJGave || numOfJGave > numOfIGave) {
                    numOfPresents[numOfIGave > numOfJGave ? i : j]++;
                } else {
                    Integer presentIndexOfI = presentIndex.getOrDefault(friend1, 0);
                    Integer presentIndexOfJ = presentIndex.getOrDefault(friend2, 0);

                    if (presentIndexOfI > presentIndexOfJ || presentIndexOfJ > presentIndexOfI) {
                        numOfPresents[presentIndexOfI > presentIndexOfJ ? i : j]++;
                    }
                }
            }
        }


        return Arrays.stream(numOfPresents)
                .max()
                .orElse(0);

    }
}
