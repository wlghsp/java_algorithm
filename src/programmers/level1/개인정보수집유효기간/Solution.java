package programmers.level1.개인정보수집유효기간;

import java.util.*;

public class Solution {

    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        for (String term : terms) {
            String[] s = term.split(" ");
            map.put(s[0].charAt(0), Integer.parseInt(s[1]));
        }
        int index = 1;
        for (String privacy : privacies) {
            Integer months = map.get(privacy.charAt(privacy.length() - 1));
            int privacyDate = getPrivacyDate(privacy, months);
            int todayDays = getDaysWithStringDate(today);

            if (todayDays > privacyDate) {
                answer.add(index);
            }

            index++;
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }

    private int getPrivacyDate(String privacy, Integer months) {
        return getDaysWithStringDate(privacy.substring(0, privacy.length() - 2))
                + months * 28
                - 1;
    }

    private int getDaysWithStringDate(String privacy) {
        String[] s = privacy.split("\\.");
        return Integer.parseInt(s[0]) * 12 * 28 +
                Integer.parseInt(s[1]) * 28 +
                Integer.parseInt(s[2]);
    }
}
